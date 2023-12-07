//Nadav Horowitz CS 210 3/11/2022


public class PiggyBank {
    
    
    //Private Fields
    private int numOfQuarters;
    private int numOfDimes;
    private int numOfNickels;
    private int numOfPennies;

    
    //Constructors
    public PiggyBank(int quarters, int dimes, int nickels, int pennies){
        if(quarters<0||dimes<0||nickels<0||pennies<0){
            throw new IllegalArgumentException();
        }
        numOfQuarters=quarters;
        numOfDimes=dimes;
        numOfNickels=nickels;
        numOfPennies=pennies;
    }
    
    public PiggyBank(){
        this (0,0,0,0);
    }
    
    
    //Mutators
    public void setQuarters(int quarters){
        if(quarters<0){
            throw new IllegalArgumentException();
        }
        numOfQuarters=quarters;
    }

    public void setDimes(int dimes){
        if(dimes<0){
            throw new IllegalArgumentException();
        }
        numOfDimes=dimes;
    }

    public void setNickels(int nickels){
        if(nickels<0){
            throw new IllegalArgumentException();
        }
        numOfNickels=nickels;
    }

    public void setPennies(int pennies){
        if(pennies<0){
            throw new IllegalArgumentException();
        }
        numOfPennies=pennies;
    }

    public void transferTo(PiggyBank other){
        other.numOfQuarters += numOfQuarters;
        other.numOfDimes += numOfDimes;
        other.numOfNickels += numOfNickels;
        other.numOfPennies += numOfPennies;
        setQuarters(0);
        setDimes(0);
        setNickels(0);
        setPennies(0);
    }
    
    
    //Accessors
    public int getQuarters(){
        return numOfQuarters;
    }

    public int getDimes(){
        return numOfDimes;
    }

    public int getNickels(){
        return numOfNickels;
    }

    public int getPennies(){
        return numOfPennies;
    }

    public double getValue(){
        double quarterValue = 0.25*numOfQuarters;
        double dimeValue = 0.10*numOfDimes;
        double nickelValue = 0.05*numOfNickels;
        double pennieValue = 0.01*numOfPennies;
        double totalValue = quarterValue+dimeValue+nickelValue+pennieValue;
        totalValue=Math.round(totalValue*100.0)/100.0;
        return totalValue;
    }
    
    
    //toString
    public String toString(){
        String s = "PiggyBank($" + getValue() + ")";
        return s;
    }

}
