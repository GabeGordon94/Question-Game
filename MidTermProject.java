/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.project;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author gagordon
 */
public class MidTermProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        System.out.println("Gabriel Gordon, Midterm Project, CS173, 2/18/15");
        System.out.println("Please take the TV Show Trivia quiz: ");
        
        String answerLine;
        final char TRUE='t';
        final char FALSE='f';
        
        int score=0;
        //Question 1 - Entourage
        char originAnswer='a';
        
        //check if input is correct
        boolean invalidInput=true;
        do{
            try{
                System.out.println("1. Where did the Entourage crew originate? (Pick the letter) ");
                System.out.println("    a. Miami, FL");
                System.out.println("    b. Queens, NY");
                System.out.println("    c. Austin, TX");
                System.out.println("    d. Ontario, Canada ");
                answerLine=in.nextLine();
                originAnswer=answerLine.charAt(0);
                if ((originAnswer=='a')|| (originAnswer=='b')||(originAnswer=='c')||(originAnswer=='d')){
                    invalidInput=false;
                }else{
                    System.out.println("There was an error, try again");
                }
            
            } catch(InputMismatchException e){
                    
                    System.out.println("There was an error, try again ");
            }
        }while(invalidInput);

        
        //adjust score
        char correctAnswer='b';
        if (originAnswer==correctAnswer){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("That is not correct");
            System.out.println("They are from Queens");
        }
        //question 2 - Shameless
        invalidInput=true;
        char ShamelessAnswer='a';
        //check if input is correct
        do{
            try{
                System.out.print("2. In Shameless (US), Frank Gallagher is an alcoholic. T or F? ");
                answerLine=in.nextLine().toLowerCase();
                ShamelessAnswer=answerLine.charAt(0);  
                if ((ShamelessAnswer=='f')||(ShamelessAnswer=='t')){
                    invalidInput=false;
                }else{
                    System.out.println("There was an error, try again");
                }
            
            } catch(InputMismatchException e){
                    
                    System.out.println("There was an error, try again ");
            }
        }while(invalidInput);
                
        if (ShamelessAnswer==(TRUE)){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("That is not correct");
            System.out.println("Frank Gallagher is most definitely an alcoholic");
        }   
        //Question 3 - Game of Thrones
        invalidInput=true;
        String GoTAnswer=" ";
        String correctGoT=" ";
         //check if input is correct
        do{
            try{
                System.out.println("3. Fill in the blank: The ____ throne is the throne upon which the King of the Andals");
                System.out.println(" and the First Men sits, located in the Great Hall of the Red Keep in the city of King's Landing. ");
                GoTAnswer=in.nextLine();
        
                correctGoT="iron";
            }catch(InputMismatchException e){
                    invalidInput=false;
                    System.out.println("There was an error, try again ");
            }
        }while(!invalidInput);
        
       
        if (GoTAnswer.equalsIgnoreCase(correctGoT)){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("That is not correct");
            System.out.println("The Answer is the iron throne");
        }
        
        //Question 4 - Arrow
        char ArrowAnswer='a';
        invalidInput=true;
        //check if input is correct
        do{
            try{
                System.out.println("4. Oliver Queen disguises himself as The Flash in order to fight crime. T or F");
                answerLine=in.nextLine().toLowerCase();
                ArrowAnswer=answerLine.charAt(0);
                if ((ArrowAnswer=='t')||(ArrowAnswer=='f')){
                    invalidInput=false;
                }else{
                    System.out.println("There was an error, try again");
                }
            
            } catch(InputMismatchException e){
                    
                    System.out.println("There was an error, try again ");
            }
        }while(invalidInput);
        
        //adjust score
        if (ArrowAnswer==(FALSE)){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("That is not correct");
            System.out.println("Oliver Queen is The Arrow");
        }
        
        //Question 5 - Teen Wolf
        invalidInput=true;
        char TeenWolfAnswer='x';
        char correctTWanswer='c';
        //check if input is correct
        do{
            try{
                System.out.println("5. In the TV series, Teen Wolf, which star is the alpha wolf? ");
                System.out.println("    a. Allison Argent");
                System.out.println("    b. Stiles Stillinski");
                System.out.println("    c. Scott McCall");
                System.out.println("    d. Lydia Martin");
                answerLine=in.nextLine();
                TeenWolfAnswer=answerLine.charAt(0);
                if ((TeenWolfAnswer=='a')|| (TeenWolfAnswer=='b')||(TeenWolfAnswer=='c')||(TeenWolfAnswer=='d')){
                    invalidInput=false;
                }else{
                    System.out.println("There was an error, try again");
                }
            
            } catch(InputMismatchException e){
                    
                    System.out.println("There was an error, try again ");
            }
        }while(invalidInput);
              
        //adjust score
        if (TeenWolfAnswer==(correctTWanswer)){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("That is not correct");
            System.out.println("The Answer is Scott McCall");
        }
        
        //Question 6 - Lost
        
        System.out.println("6. In Lost, What drug is Charlie addicted to? ");
        String LostAnswer=in.nextLine();
        LostAnswer=LostAnswer.toLowerCase();
        String correctLost="heroin";
        
        //adjust score
        if (LostAnswer.equals(correctLost)){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("That is not correct");
            System.out.println("The answer was heroin");
        }
        
        //Question 7 - The League
        System.out.println("7. Fill in the Blank: The League is a show about a bunch of friends in a fantasy ____ league. ");
        String LeagueAnswer=in.nextLine();
        LeagueAnswer=LeagueAnswer.toLowerCase();
        String CorrectSport="football";
        
        //adjust score
        if (LeagueAnswer.equals(CorrectSport)){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("That is not correct");
            System.out.println("The answer is a fantasy football league");
        }
        
        //Question 8 - Silicon Valley
        invalidInput=true;
        char SVanswer='x';
        //check for error and valid input
        do{
            try{
                System.out.println("8. The show Silicon Valley is about a technology company. T or F");
                answerLine=in.nextLine().toLowerCase();
                SVanswer=answerLine.charAt(0);
                if ((SVanswer=='t')||(SVanswer=='f')){
                    invalidInput=false;
                }else{
                    System.out.println("There was an error, try again");
                }
            }catch(InputMismatchException e){
                    
                    System.out.println("There was an error, try again ");
            }
        }while(invalidInput);
    //adjust score
        if (SVanswer==(TRUE)){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("That is not correct");
            System.out.println("Silicon Valley is about a group of technology geeks");
        }
        
        //Question 9 - Fear Factor
        System.out.println("9. Joe Rogan is the host of what hit TV reality show? ");
        String FearAnswer=in.nextLine();
        FearAnswer=FearAnswer.toLowerCase();
        String correctFactor="fear factor";
        
        //adjust score
        if (FearAnswer.equals(correctFactor)){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("That is not correct");
            System.out.println("Joe Rogan is the host of Fear Factor");
        }
        
        //Question 10 - Family Guy
        invalidInput=true;
        char FamilyGuy='x';
        //check for valid input
        do{        
            try{
                System.out.println("10. The father from Family Guy is Peter Griffin. T or F");
                answerLine=in.nextLine().toLowerCase();
                FamilyGuy=answerLine.charAt(0);
                if ((FamilyGuy=='t')||(FamilyGuy=='f')){
                    invalidInput=false;
                }else{
                    System.out.println("There was an error, try again");
                }
            }catch(InputMismatchException e){
                    
                    System.out.println("There was an error, try again ");
            }
        }while(invalidInput);
       
        //adjust score
        if (FamilyGuy==(TRUE)){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("That is not correct");
            System.out.println("Peter Griffin is the father in Family Guy");
        }
        
        
        //results
        int notFB=2;
        int FBfriends=4;
        int cellPhone=6;
        int date=8;
        
        System.out.println("Thank you for taking the test!");
        if (score<=notFB){
            System.out.println("We can't even connect on LinkedIn");
        }else{
            if ((score>notFB)&&(score<=FBfriends)){
                System.out.println("I'd be your facebook friend");
            }else{
                if ((score>FBfriends)&&(score<=cellPhone)){
                    System.out.println("Here's my number, 973-901-2212 ");
                }else{
                    if((score>cellPhone)&&(score<date)){
                        System.out.println("I'd date you! ;)");
                    }else{
                        System.out.println("Lets get married!!");
                       
                    }
                }
                
            }
        }
                
            
        
        
    
        
        
        
        
        }
        
        }
    

       
                
            
            
        
            
            
            
            
            
            
            
    
     
        
        


    
    

