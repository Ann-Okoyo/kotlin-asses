fun main() {

    var current=Current("12345T","Dorcas Wacuka",43000)
    current.deposit(45000.00)


//    var current = Current("12345T","Dorcas Wacuka",43000)
    current.withdraw(2000.00)

    var pupil = student("Dorcas")
    pupil[0]
    pupil[-1]
    pupil.length

     var passwords="1234567T"
    for (password in passwords){
        if(passwords.length <= 8 )if (passwords.length >=16){
            print("my $password is")
        }
        else{
            print("in valid")


        }

    }

    var savings=Savings(2000)
    savings.withdraw(2000)





    }












//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.
fun student(name:String):String {
   for (one in student){
       if (one ==="aeiou"){
           return one
       }
   }




//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
fun password(character:String){
}

    return true
    }





//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”

fun numbers (digits:Int){
    var multiple=0
    for (multiple in 1..1000)
        if ( multiple%6 ==0 && multiple%8==0 ){
            print("Bingo!")
    }

}
//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”

open class Current(var accnumber:String,var accname:String , var balance:Int){
    fun deposit( amount1:Double){

        balance+=amount1()
    }
    open fun withdraw(amount2:Double){
        balance-=amount2()


    }
    fun details(){
        print("$accnumber with $balance is operated by  $accname")

    }

}
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal

class Savings( var withdrawals:Int):Current( accnumber, accname ,balance){
    override fun withdraw(amount2: Double){
        var withdrawals=0;
        for (withdrawal in withdraw){
            if(withdrawal<=4){
                print("withdraw from account")
            }
            withdraw+=withdrawals

        }
    }
}

