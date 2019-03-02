
//this massive class contains the bulk of my algorithmic code for the project
//first, we need to import the necessary classes to create ArrayLists and Random objects
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anishmahto
 */
public class EquationSolverAlgorithms {
    
    //we will create a sub-class Term
    //this class will be the primary "data" type used in most algorithms
    //it stores the components that will define each term; the numerator, denominator, and a boolean to check if the current term is degree one or zero
    //I use longs to store the numerator and denominator just in case that during the fraction addition the values become very large
    public static class Term {
        long longNumerator = 0;
        long longDenominator = 1;
        boolean boolDegOne = false;
    }
    
    //declare two global ArrayLists that can store multiple Terms
    //globalEqnOne will store the terms that make up equation one, and globalEqnTwo stores the terms that make up equation two
    static ArrayList <Term> globalEqnOne = new ArrayList <Term>(), globalEqnTwo = new ArrayList <Term>();
    
    //the following is euclids GCD algorithm, that computes the GCD of two numbers very quickly
    //its simple to code but requires a mathematical proof to explain, too complex to put in comments
    //for more information on the algorithm, google it
    public static long gcd (long a, long b) {        
        if (b==0) {
            return a;
        } else {
            return gcd (b, a%b);
        }
    }
    
    public static String printSide (ArrayList<Term> side) {
        //this method accepts an ArrayList of Terms as a paramter; this ArrayList represents the equation that needs to be printed
        //if we think about the equations in the form y = some equation, this returns a string with the equation part of the relationship
        //we will append all the output to a single string variable, and return this string variable
        String strOutput = "";
        if (side.size()==0) {
            //if the ArrayList is empty that means this equation equals 0
            strOutput += "0";
        }
        for (int i = 0; i < side.size(); i++) {
            //if the ArrayList is not empty we loop through all the terms in the ArrayList
            if (i!=0) {
                //if we are not printing out the very first term, we need to print out an addition sign
                strOutput += " + ";
            }
            //next, we always need to print out the numerator of a term
            strOutput += side.get(i).longNumerator;
            if (side.get(i).longDenominator!=1) {
                //if the denominator does not equal one we need to print it out, using a division sign and the denominator itself
                //if it equals one we dont need to print out the denominator
                strOutput += "/" + side.get(i).longDenominator;
            }
            if (side.get(i).boolDegOne) {
                //if this term is a degree one term, we need to print out the variable x beside the coefficient
                strOutput += "x";
            }
        }
        //finally, return the string that stores the accumulated output to be printed out
        return strOutput;
    }
    
    public static String printGlobalEqn (boolean eqnOne) {
        //this method prints out the entirety of one of the global equations, not just one side
        //the left side of the equation always starts with y = , so we add that to our output string variable right away 
        String strOutput = "y = ";
        if (eqnOne) {
            //if the parameter specified is true we will print out global equation number 1
            //hence, we append the output from the printSide method for globalEqnOne
            strOutput += printSide (globalEqnOne);
        } else {
            //if the parameter specified is true we will print out global equation number 2
            //hence, we append the output from the printSide method for globalEqnTwo
            strOutput += printSide (globalEqnTwo);
        }
        //now that we have stored the entire global equation in a string that can be printed out, we return it
        return strOutput;
    }
    
    public static String printEquation (ArrayList<Term> LHS, ArrayList<Term> RHS) {
        //this is a general method for printing out any equation, if there exists a left hand side and right hand side with actual Terms
        //declare a string variable which will store our output mesage
        String strOutput = "";
        //append the formatted left hand side of the equation using printSide()
        strOutput += printSide (LHS);
        //append an equal sign with spacing
        strOutput += " = ";
        //append the formatted right hand side of the equation using printSide(), and add a new line
        strOutput += printSide (RHS) + "\n";
        //return the output string variable, which now holds the entire equation in a string format
        return strOutput;
    }
    
    public static ArrayList <Term> generate (int intNumTerms) {
        //this method is responsible for randomly generating a linear equation
        //first, declare an ArrayList that can store Terms - the entire equation generated will be stored here
        ArrayList <Term> generated = new ArrayList<Term> ();
        //declare an instance of the Random class, so that we can randomize our equation
        Random rand = new Random();
        //we then loop through the number of terms we want to generate, as specified by the intNumTerms parameter
        for (int i = 0; i < intNumTerms; i++) {
            //for each term, we need to generate the numerator, denominator, and whether this term is degree 1 or 0
            //declare the appropriate variables to hold this information
            int intGenNumerator, intGenDenominator;
            boolean boolGenDegOne;
            if (i==0) {
                //if we are currently setting the first term, we always set it to be degree one
                //this is because we want at least one degree one variable no matter what, so might as well make the first term degree one
                boolGenDegOne = true;
            } else {
                //otherwise, we will randomly choose whether the term is degree 1 or 0
                //to do this, first we generate a random number between 0->9
                int intChoice = rand.nextInt(10);
                if (intChoice<=2) {
                    //if the random number is <= 2 we choose to make this term degree 1
                    //hence, there is a 30% chance that this term is degree 1
                    boolGenDegOne = true;
                } else {
                    //otherwise, we choose to make this term degree 2
                    //hence, there is a 70% chance that this term is degree 2
                    boolGenDegOne = false;
                }
            }
            //next we need to generate a denominator
            //to do this, first we choose a random number between 1->100
            int intChooseDenominator = rand.nextInt(100)+1;
            if (intChooseDenominator <= 80) {
                //if the random number is <= 80, we will set this denominator to 1 (so its not a fraction)
                //hence, there is an 80% chance the term is not a fraction
                intGenDenominator = 1;
            } else {
                //otherwise, we choose the denominator to be a number between 2->20
                //hence, there is a 20% chance the term is a fraction
                intGenDenominator = rand.nextInt(19)+2;
            }
            //lastly, we need to determine a numerator for the term - we will simply choose a random number between 1->100
            intGenNumerator = rand.nextInt(100)+1;
            //now, we need to store all the generated information as a Term object. So, we first create an instance of the Term class
            Term generatedTerm = new Term();
            //next, we set all the components of the Term instance to their appropriate values we generated
            generatedTerm.longNumerator = intGenNumerator;
            generatedTerm.longDenominator = intGenDenominator;
            generatedTerm.boolDegOne = boolGenDegOne;
            //then, add this generated term to our generated equation so far
            generated.add (generatedTerm);
        }
        //finally, return the generated equation
        return generated;
    }
    
    public static ArrayList <Term> generateSide () {
        //this method is the method that starts off the process for generating an equation
        //specifically, this method chooses how many terms the equation should have, then uses the generate() method above to actually generate the equation
        //first we create an instance of the random class, to generate random numbers
        Random rand = new Random ();
        //then we choose a random number between 1->100
        int intChooseNumberOfTerms = rand.nextInt(100)+1;
        if (intChooseNumberOfTerms <= 10) {
            //if the random number is <= 10, the equation will have 4 terms
            //hence there is a 10% chance that the equation will have 4 terms
            return generate (4);
        } else if (intChooseNumberOfTerms <= 30) {
            //if the random number is > 10 but <= 30, the equation will have 3 terms
            //hence there is a 20% chance that the equation will have 3 terms
            return generate (3);
        } else {
            //otherwise, the equation will only have two terms
            //hence, there is a 70% chance that the equation will have only two terms
            return generate (2);
        }
        //in all cases, we return the equation generated by the generate method(), based on the number of terms decided
    }
    
    public static Term fractionAddition (Term termOne, Term termTwo, boolean boolBothDegOne) {
        //this method adds to Terms together, while maintaining the fraction form
        //first we declare a new instance of the Term class, to store the new Term when the two given Terms are added
        Term combinedTerm = new Term();
        //we also declare a variable to store the GCD of the numerator and denominator of the new Term, so that we can simplify
        long longGCD;
        //now, we simply cross multiply to add fractions
        //thus, the denominator simply becomes the product of the two denominators
        combinedTerm.longDenominator = termOne.longDenominator*termTwo.longDenominator;
        //the numerator becomes the sum of termOne's numerator and termTwo's denominator and vice versa
        combinedTerm.longNumerator = termOne.longNumerator*termTwo.longDenominator + termTwo.longNumerator*termOne.longDenominator;
        if (boolBothDegOne) {
            //in all cases, both terms will either be degree 1 or 0, based on the way this method is called
            //if the boolBothDegOne boolean is true, that means both terms are degree 1, thus the new term is also degree one
            combinedTerm.boolDegOne = true;
        }
        //next, get the GCD of the numerator and denominator of our combined term
        longGCD = gcd (combinedTerm.longNumerator, combinedTerm.longDenominator);
        //once we have a the GCD we can simplify our term by dividing both the numerator and denominator by the GCD
        combinedTerm.longDenominator /= longGCD;
        combinedTerm.longNumerator /= longGCD;
        //finally, return our simplified Term
        return combinedTerm;
    }
    
    public static String solveForY (ArrayList <Term> eqn, Term X) {
        //after solving for the x-value of the point of intersection, this method solves for the y-value and returns the soltuion/steps taken in a string variable
        //declare our output string variable, and append the first step of the process to it
        String strOutput = "\nPlug in the x value into either equation, and find the corresponding y-value:";
        
        //create an accumulating Term
        //we add this term to all the other terms in the equation - thus it is the sum of each individual term and hence the y-value
        //we dont need to modify and of the Term's values right now, as the values that class automatically instatiates is fine for now
        Term ans = new Term();
        
        for (int i = 0; i < eqn.size(); i++) {
            //now we loop through all the terms of the equation, so that we can sum them together
            if (eqn.get(i).boolDegOne) {
                //if the current term is degree one, we can simply plug in the X value that we already solved for, and multiply it with the numerator
                //since we multiply the term by the X value that we now know, the term becomes degree 0
                eqn.get(i).longNumerator *= X.longNumerator;
                eqn.get(i).longDenominator *= X.longDenominator;
            }
            //now we can simply add the fractions as at this point the current term is degree 0
            ans = fractionAddition (ans, eqn.get(i), false);
        }
        //finally, we want to print out the y-value; the fraction stored in ans after summing all values in the equation
        if (ans.longDenominator == 1) {
            //if the denominator is 1, we only need to print out the numerator
            strOutput += "\ny = " + ans.longNumerator;
        } else {
            //otherwise print out the numerator and denominator
            strOutput += "\ny = " + ans.longNumerator + "/" + ans.longDenominator;
        }
        //alas, return the output string
        return strOutput;
    }
    
    public static String solve (ArrayList <Term> LHS, ArrayList<Term> RHS) {
        //this method is responsible for solving for the x-value of the point of intersection of the system of equations, by setting their y-values equal to each other
        //the very first thing I do is create a copy of the left hand side equation
        //I will use this copied equation after determining the x-value of the point of intersection to determine the y-value
        //the y-value can be determined by plugging in the x-value back into the equation, and getting the output (y-value) as done in the solveForY method
        //declare an ArrayList to store a copy of the left hand side equation; note we could have even done the right hand side, it doesnt matter 
        ArrayList <Term> origLHS = new ArrayList <Term> ();
        for (int i = 0; i < LHS.size(); i++) {
            //loop through every term in the left hand side equation, and create a copy of that term
            Term curTerm = new Term();
            //to create a copy of that term we set all the components of our new term to that term
            //this way we copy by value and not reference
            curTerm.longNumerator = LHS.get(i).longNumerator;
            curTerm.longDenominator = LHS.get(i).longDenominator;
            curTerm.boolDegOne = LHS.get(i).boolDegOne;
            //once the values are copied, add the copied term to the copied equation ArrayList (origLHS)
            origLHS.add(curTerm);
        }
        //we will now begin the process for solving for the x-value of the point of intersection
        //since this method also shows steps, we will print out the initial steps by adding it to an output string variable
        String strOutput = "\nSolve the following linear system: \n";
        strOutput += "\ty = " + printSide (LHS) + "\n";
        strOutput += "\ty = " + printSide (RHS) + "\n";
        strOutput += "\nSet the equations equal to each other: \n";
        strOutput += printEquation (LHS, RHS);
        
        //now, we will move all degree 0 terms in the left hand side equation to the right hand side
        for (int i = 0; i < LHS.size(); i++) { 
            //we loop through all terms in the left hand side
            if (!LHS.get(i).boolDegOne) {
                //if the term is not degree 1, we want to move it to the right hand side
                //when moving terms over the equal sign, we need to multiply the term by -1
                LHS.get(i).longNumerator *= -1;
                //once multiplied by -1, we add the term to the right hand side, and delete it from the left hand side
                RHS.add (LHS.get(i));
                LHS.remove(i);
                //due to index shifts due to the remove method, we decrement i
                i--;
            }
        }
        //once we have rearanged all degree 0 terms to the right side, we state this in the output string along side what the equation looks like so far (using the printEquation() method)
        strOutput += "\nRearrange all degree zero terms to the right side: \n";
        strOutput += printEquation (LHS, RHS);
        
        //now, we will move all degree 1 terms in the right hand side equation to the left hand side
        for (int i = 0; i < RHS.size(); i++) {
            //we loop through all terms in the left hand side
            if (RHS.get(i).boolDegOne) {
                //if the term is not degree 1, we want to move it to the left hand side
                //when moving terms over the equal sign, we need to multiply the term by -1
                RHS.get(i).longNumerator *= -1;
                //once multiplied by -1, we add the term to the left hand side, and delete it from the right hand side
                LHS.add (RHS.get(i));
                RHS.remove(i);
                //due to index shifts due to the remove method, we decrement i
                i--;
            }
        }
        //once we have rearanged all degree 1 terms to the left side, we state this in the output string along side what the equation looks like so far (using the printEquation() method)
        strOutput += "\nRearrange all degree one terms to the left side: \n";
        strOutput += printEquation (LHS, RHS);
        
        //next, we add all LHS terms together
        while (LHS.size() > 1) {
            //if there are 2 or more terms in the left hand side, it means there are still terms we need to add together
            //order of addition doesnt matter, so we will just add the first two terms in the equation currently
            //we will store those Terms into other objects, and then delete the terms from the left hand side
            Term termOne = LHS.get(0), termTwo = LHS.get(1);
            LHS.remove (0);
            LHS.remove (0);
            //then, we add those two terms using the fractionAddition() method, and add it back to the left hand side
            LHS.add (fractionAddition(termOne, termTwo, true));
        }
        
        //once again, we output the step we just completed, as we want to print out both solution and steps for the user
        //additionally, print out what the equation looks like so far
        strOutput += "\nCombine all degree one terms on the left side: \n";
        strOutput += printEquation (LHS, RHS);
        
        //next, we add all RHS terms together
        while (RHS.size() > 1) {
            //if there are 2 or more terms in the right hand side, it means there are still terms we need to add together
            //order of addition doesnt matter, so we will just add the first two terms in the equation currently
            //we will store those Terms into other objects, and then delete the terms from the right hand side
            Term termOne = RHS.get(0), termTwo = RHS.get(1);
            RHS.remove (0);
            RHS.remove (0);
            //then, we add those two terms using the fractionAddition() method, and add it back to the right hand side
            RHS.add (fractionAddition(termOne, termTwo, false));
        }
        //again, print out the steps we took and the equation so far
        strOutput += "\nCombine all degree zero terms to the right side: \n";
        strOutput += printEquation (LHS, RHS);
        
        //at this point we have an equation in the form ax = b
        //therefore, x = b/a. We will print this step out in the following if/else statement
        if (LHS.get(0).longDenominator != 1) {
            //if the coefficient 'a' is a fraction, we need to print out the division sign and denominator along with the numerator
            strOutput += "\nDivide both sides by " + LHS.get(0).longNumerator + "/" + LHS.get(0).longDenominator + "\n";
        } else {
            //otherwise we just need to print out the numerator
            strOutput += "\nDivide both sides by " + LHS.get(0).longNumerator + "\n";
        }
        
        if (RHS.isEmpty()) {
            //if the right hand side is empty, that implies 'b' = 0, and hence x = 0
            //thus, print out x=0, store the value in a Term object, and then solve for the corresponding y-value using this x value and the original left hand side equation
            strOutput += "\tx = 0\n";
            Term answer = new Term();
            answer.longNumerator = 0;
            answer.longDenominator = 1;
            strOutput += solveForY(origLHS,answer);
        } else {
            //otherwise if the right hand side does not equal 0, divide 'b' by 'a', to find x
            //we create a new Term object to store the answer, and then do the math
            Term answer = new Term();
            answer.boolDegOne = false;
            //dividing a number by a fraction is equal to multiplying by the inverse of the fraction; hence we do that here
            answer.longNumerator = RHS.get(0).longNumerator*LHS.get(0).longDenominator;
            answer.longDenominator = RHS.get(0).longDenominator*LHS.get(0).longNumerator;
            //finally, simplify the fraction by dividing the numerator and denominator by their GCD, and print out this value for x
            long longGCD = gcd (answer.longNumerator, answer.longDenominator);
            answer.longNumerator /= longGCD;
            answer.longDenominator /= longGCD;
            strOutput += "\tx = " + answer.longNumerator + "/" + answer.longDenominator + "\n";
            //once agian, solve for the corresponding y-value using this x value and the original left hand side equation
            strOutput += solveForY(origLHS,answer);
        }
        //lastly, return the entire output string that has all the steps+answer stored
        return strOutput;
    }
    
    public static void addTerm (boolean eqnOne, long longNum, long longDenom, boolean boolIsDegOne) {
        //this method is a utility method used by the Calculator JFrame to add terms to one of the two global ArrayList/equations
        //first, we need to create a new Term object; this is the object that will store information about the Term and then will be added to the appropriate global ArrayList
        Term addedTerm = new Term();
        
        //we assign the components of the term to what the user specified
        addedTerm.boolDegOne = boolIsDegOne;
        addedTerm.longNumerator = longNum;
        addedTerm.longDenominator = longDenom;
        
        //if the user wanted to add this term to equation one, the eqnOne boolean evaluates to true, otherwise to false
        if (eqnOne) {
            //simply add the new Term to equation one's ArrayList
            globalEqnOne.add(addedTerm);
        } else {
            //simply add the new Term to equation two's ArrayList
            globalEqnTwo.add(addedTerm);
        }
    }
    
    public static void reset () {
        //this method resets both global equations by emptying out all their Terms
        globalEqnOne.clear();
        globalEqnTwo.clear();
    }            
    
    public static String generateAndSolve () {
        //this utility method combines both the indvididual generation and solve methods, as they are often used in conjunction
        //as usual, declare a string variable to store the output
        String strOutput = "";
        //declare/initialize two ArrayLists, to store the left hand side and right hand side equations
        ArrayList <Term> LHS = new ArrayList<Term>(), RHS = new ArrayList<Term>();
        LHS = generateSide (); //generate the left hand side
        RHS = generateSide (); //generate the right hand side
        //re-initialize the global equations to empty them
        globalEqnOne = new ArrayList <Term>();
        globalEqnTwo = new ArrayList <Term>();
        
        //for both the left hand side and right hand side, loop through all the elements, create a copy, and add it to the appropriate global ArrayList/equation
        //we assign the left hand side equation to global equation 1, and the right hand side to global equation 2
        for (int i = 0; i < LHS.size(); i++) {
            Term curTerm = new Term();
            curTerm.longNumerator = LHS.get(i).longNumerator;
            curTerm.longDenominator = LHS.get(i).longDenominator;
            curTerm.boolDegOne = LHS.get(i).boolDegOne;
            globalEqnOne.add(curTerm);
        }
        for (int i = 0; i < RHS.size(); i++) {
            Term curTerm = new Term();
            curTerm.longNumerator = RHS.get(i).longNumerator;
            curTerm.longDenominator = RHS.get(i).longDenominator;
            curTerm.boolDegOne = RHS.get(i).boolDegOne;
            globalEqnTwo.add(curTerm);
        }
        //finally, solve the system and print out the answer/steps for solving the system
        strOutput += solve (LHS, RHS);
        //return the output string
        return strOutput;
    }
    
}
