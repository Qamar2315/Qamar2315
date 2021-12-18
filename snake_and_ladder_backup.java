import java.util.Scanner;
public class snake_and_ladder{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String board[][]={
            {"0","0","0","0","0","0","0","0","0","0"},
            {"0","0","0","0","0","0","0","0","","0"},
            {"0","0","0","0","0","0","0","0","0","0"},
            {"0","0","0","0","0","0","0","0","0","0"},
            {"0","0","0","0","0","0","0","0","0","0"},
            {"0","0","0","0","0","0","0","0","0","0"},
            {"0","0","0","0","0","0","0","0","0","0"},
            {"0","0","0","0","0","0","0","0","0","0"},
            {"0","0","0","0","0","0","0","0","0","0"},
            {"0","0","0","0","0","0","0","0","0","0"},
        };
        System.out.println();
        System.out.println();
        System.out.println("""
        *********************************************************************************
        *                        SNAKE AND LADDER GAME                                  *
        *********************************************************************************
        """);
        while(true){
            System.out.printf("%37s%n","MAIN MENU");
            System.out.printf("%37s%n","`````````");
            System.out.printf("%38s%n","1- START GAME");
            System.out.printf("%35s%n","2-    HELP");
            System.out.printf("%35s%n","3-    EXIT");
            System.out.println("Enter a choice: ");
            int menuResponse=input.nextInt();
            if(menuResponse==1){    
                System.out.printf("%38s%n","CHOOSE GAME");
                System.out.printf("%38s%n","```````````");
                System.out.printf("%42s%n","1- PLAYER  VS PLAYER ");
                System.out.println();
                System.out.printf("%42s%n","2- PLAYER VS COMPUTER"); 
                System.out.println();
                System.out.printf("%38s%n","3- P1 VS P2 VS P3"); 
                System.out.println();
                System.out.printf("%44s%n","4- P1 VS P2 VS P3 VS P4"); 
                System.out.println();
                System.out.printf("%35s%n","5-        BACK");
                System.out.println("Enter a choice: ");
                int gameChoice=input.nextInt();
                if (gameChoice==1){
                    System.out.println("""
                                        **************************
                                        *      STARTING GAME     *
                                        *    PLAYER VS PLAYER    *
                                        **************************
                    """);
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        System.out.println("");
                    }
                    String tryAgain="yes";
                    do{
                        System.out.println("Player One, Enter your name:");
                        String playerOne = input.next();
                        System.out.println("Player Two, Enter your name:");
                        String playerTwo = input.next();
                        if(twoPlayersGame(board, playerOne,playerTwo)=="p1"){
                            System.out.println("CONGRAGULATIONS "+ playerOne +" YOU ARE WINNER!!");
                        }else{
                            System.out.println("CONGRAGULATIONS "+ playerTwo +" YOU ARE WINNER!!");
                        }
                        System.out.println("DO YOU WANT TO PLAY AGAIN?");
                        System.out.println("YES/NO");
                        String playAgainResponse=input.next();
                        if(playAgainResponse.equals("yes") || playAgainResponse.equals("y")){
                            tryAgain="yes";
                            System.out.printf("%40s%n","RESTARTING....");
                            try{
                                Thread.sleep(1000);
                            }catch (InterruptedException e) {
                                System.out.println("");
                            }
                        }else{
                            tryAgain="no";
                            System.out.printf("%48s%n","NAVIGATING BACK TO MAIN MENU ...");
                            try{
                                Thread.sleep(1000);
                            }catch (InterruptedException e) {
                                System.out.println("");
                            }
                        }
                    }while(tryAgain.equals("yes"));
                    
                } else if(gameChoice==2){
                    System.out.println("""
                                        **************************
                                        *      STARTING GAME     *
                                        *    PLAYER VS COMPUTER  *
                                        **************************
                    """);
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        System.out.println("");
                    }
                    String tryAgain="yes";
                    do{
                        System.out.println("Enter you name");
                        String player = input.next();
                        if(oneVsComp(board).equals("player")){
                            System.out.println("CONGRAGULATIONS "+ player + " YOU ARE WINNER" );
                        }else{
                            System.out.println("COMPUTER IS WINNER");
                        }
                        System.out.println("DO YOU WANT TO PLAY AGAIN?");
                        System.out.println("YES/NO");
                        String playAgainResponse=input.next();
                        if(playAgainResponse.equals("yes") || playAgainResponse.equals("y")){
                            tryAgain="yes";
                            System.out.printf("%40s%n","RESTARTING....");
                            try{
                                Thread.sleep(1000);
                            }catch (InterruptedException e) {
                                System.out.println("");
                            }
                        }else{
                            tryAgain="no";
                            System.out.printf("%48s%n","NAVIGATING BACK TO MAIN MENU ...");
                            try{
                                Thread.sleep(1000);
                            }catch (InterruptedException e) {
                                System.out.println("");
                            }
                        }
                    }while(tryAgain.equals("yes"));
                }else if (gameChoice==3){
                    System.out.println("""
                                        **************************
                                        *      STARTING GAME     *
                                        *     P1 VS P2 VS P3     *
                                        **************************
                    """);
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        System.out.println("");
                    }
                    String tryAgain="yes";
                    do{
                        System.out.println("Player One, Enter your name:");
                        String playerOne = input.next();
                        System.out.println("Player Two, Enter your name:");
                        String playerTwo = input.next();
                        System.out.println("Player Three, Enter your name:");
                        String playerThree = input.next();
                        if(threePlayersGame(board, playerOne, playerTwo, playerThree)=="p1"){
                            System.out.println("CONGRAGULATIONS "+ playerOne +" YOU ARE WINNER!!");
                        }else if(threePlayersGame(board, playerOne, playerTwo, playerThree)=="p2"){
                            System.out.println("CONGRAGULATIONS "+ playerTwo +" YOU ARE WINNER!!");
                        }else{
                            System.out.println("CONGRAGULATIONS "+ playerThree +" YOU ARE WINNER!!");
                        }
                        System.out.println("DO YOU WANT TO PLAY AGAIN?");
                        System.out.println("YES/NO");
                        String playAgainResponse=input.next();
                        if(playAgainResponse.equals("yes") || playAgainResponse.equals("y")){
                            tryAgain="yes";
                            System.out.printf("%40s%n","RESTARTING....");
                            try{
                                Thread.sleep(1000);
                            }catch (InterruptedException e) {
                                System.out.println("");
                            }
                        }else{
                            tryAgain="no";
                            System.out.printf("%48s%n","NAVIGATING BACK TO MAIN MENU ...");
                            try{
                                Thread.sleep(1000);
                            }catch (InterruptedException e) {
                                System.out.println("");
                            }
                        }
                    }while(tryAgain.equals("yes"));
                }else if (gameChoice==4){
                    System.out.println("""
                                        **************************
                                        *      STARTING GAME     *
                                        *  P1 VS P2 VS P3 VS P4  *
                                        **************************
                    """);
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        System.out.println("");
                    }
                    String tryAgain="yes";
                    do{
                        System.out.println("Player One, Enter your name:");
                        String playerOne = input.next();
                        System.out.println("Player Two, Enter your name:");
                        String playerTwo = input.next();
                        System.out.println("Player Three, Enter your name:");
                        String playerThree = input.next();
                        System.out.println("Player Four, Enter your name:");
                        String playerFour = input.next();
                        if(fourPlayersGame(board, playerOne, playerTwo, playerThree,playerFour)=="p1"){
                            System.out.println("CONGRAGULATIONS "+ playerOne +" YOU ARE WINNER!!");
                        }else if(fourPlayersGame(board, playerOne, playerTwo, playerThree,playerFour)=="p2"){
                            System.out.println("CONGRAGULATIONS "+ playerTwo +" YOU ARE WINNER!!");
                        }else if(fourPlayersGame(board, playerOne, playerTwo, playerThree,playerFour)=="p3") {
                            System.out.println("CONGRAGULATIONS "+ playerThree +" YOU ARE WINNER!!");
                        }else{
                            System.out.println("CONGRAGULATIONS "+ playerFour +" YOU ARE WINNER!!");
                        }
                        System.out.println("DO YOU WANT TO PLAY AGAIN?");
                        System.out.println("YES/NO");
                        String playAgainResponse=input.next();
                        if(playAgainResponse.equals("yes") || playAgainResponse.equals("y")){
                            tryAgain="yes";
                            System.out.printf("%40s%n","RESTARTING....");
                            try{
                                Thread.sleep(1000);
                            }catch (InterruptedException e) {
                                System.out.println("");
                            }
                        }else{
                            tryAgain="no";
                            System.out.printf("%48s%n","NAVIGATING BACK TO MAIN MENU ...");
                            try{
                                Thread.sleep(1000);
                            }catch (InterruptedException e) {
                                System.out.println("");
                            }
                        }
                    }while(tryAgain.equals("yes"));
                }else if(gameChoice==5){
                    System.out.printf("%48s%n","NAVIGATING BACK TO MAIN MENU ...");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        System.out.println("");
                    }
                }
                else{
                    System.out.println();
                    System.out.printf("%55s%n","ERROR: WRONG INPUT (ENTER A CHOICE BETWEEN 1 - 3)");
                    System.out.println();
                }
                
            }else if(menuResponse==2){
                System.out.printf("%35s%n","HELP");
                System.out.printf("%35s%n","````");
                System.out.println("""
                1- To start game choose first option from main menu
                2- Choose game type wehther you want to play with a friend or computer
                3- you game will be started
                4- Rules:
                    - Each player will roll its dice on its turn, and will move forward according to score on dice eg if there is 4 on dice player will move four digits forward
                    - This will be added to its total score
                    - When a player lands on a top of a snake, their playing piece will slide down to the bottom of the snake.
                    - Whereas landing on the bottom of a snake the player will remain in the same spot until their next turn.
                    - When a player lands at the base of a ladder, it immediately climbs to the top of the ladder.
                    - Whereas landing at the top of a ladder the player will stay there until the next turn. The player does not move to the bottom of the ladder.
                    - The first player that reaches the highest space on the board, 100, wins the game. 
                    - To win the player will need to roll the exact number to get you to the last space.
                    - If the player rolls a higher number than needed to land exactly on 100, their piece will not move and remains there until their next turn.
                """);
                System.out.println();
                System.out.println("ENTER ANY KEY TO MOVE BACK TO MAIN MENU");
                input.next();
                System.out.printf("%48s%n","NAVIGATING BACK TO MAIN MENU ...");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        System.out.println("");
                    }
                continue;
            }else if(menuResponse==3){
                System.out.printf("%33s%n","EXIT");
                System.out.printf("%33s%n","````");
                System.out.printf("%46s%n","ARE YOU SURE YOU WANT TO EXIT");
                System.out.printf("%34s%n","YES/NO");
                String exitResponse=input.next();
                exitResponse= exitResponse.toLowerCase();
                if(exitResponse.equals("yes") || exitResponse.equals("y")) {
                    System.out.printf("%40s%n","EXITING GAME..");
                    try{
                        Thread.sleep(2000);
                    }catch (InterruptedException e) {
                        System.out.println("");
                    }
                    System.out.printf("%40s%n","THANKS FOR PLAYING");
                    System.out.printf("%37s%n","SEE YOU SOON");
                    break;
                }else if(exitResponse.equals("no") || exitResponse.equals("n")){
                    System.out.printf("%48s%n","NAVIGATING BACK TO MAIN MENU ...");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        System.out.println("");
                    }
                    System.out.println();
                }
            }else{
                System.out.println();
                System.out.printf("%55s%n","ERROR: WRONG INPUT (ENTER A CHOICE BETWEEN 1 - 3)");
                System.out.println();
            }
            
        }
    }
    public static int getRandom(){
        int dice= (int) (1 + Math.floor(Math.random()*6));
        return dice;
    }
    public static void printBoard(String[][] board){
        System.out.printf("%50s%n","----------------------------------------------");
        System.out.printf("%33s%n","SNAKE AND LADDER");
        System.out.printf("%50s%n","----------------------------------------------");
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                System.out.printf("%5s",board[i][j]);
            }
            System.out.println();
        }
        System.out.printf("%50s%n","----------------------------------------------");
    }
    public static String oneVsComp(String[][] board) {
        Scanner input = new Scanner(System.in);
        int sumComp = 0;
        int sumPlayer = 0;
        String win = "false";
        do {
            System.out.println("=========================================================");
            System.out.println("SNAKE MOUTH IS AT 52, 87, 97 AND TAIL IS AT  26, 49, 7");
            System.out.println("LADDER STARTS  AT  4, 28, 32 AND  ENDS   AT  24, 45, 77");
            System.out.println("==========================================================");
            System.out.println("Enter r to roll");
            input.next();
            int dicePlayer = getRandom();
            System.out.println();
            System.out.println("your dice number is:" + dicePlayer);
            while (dicePlayer % 6 == 0 ) {
                System.out.println("Your bonus turn, Enter r to roll");
                input.next();
                int diceBonusPlayer = getRandom();
                System.out.println();
                System.out.println("your dice number is:" + diceBonusPlayer);
                dicePlayer += diceBonusPlayer;
            }
            sumPlayer += dicePlayer;
            if (sumPlayer > 100 || dicePlayer >= 18) {
                sumPlayer -= dicePlayer;
            }
            int diceComp = getRandom();
            System.out.println();
            System.out.println("Computer dice number is:" + diceComp);
            while (diceComp % 6 == 0) {
                System.out.println("Computer bonus turn");
                int diceBonusComp = getRandom();
                System.out.println();
                System.out.println("Computer dice number is:" + diceBonusComp);
                diceComp += diceBonusComp;
            }
            sumComp += diceComp;
            if (sumComp > 100 || diceComp >= 18) {
                sumComp -= diceComp;
            }
            System.out.println("-----------");
            System.out.println("SCORE BOARD");
            System.out.println("```````````");
            System.out.println("Your score till now is : " + sumPlayer);
            System.out.println("Comp score till now is : " + sumComp);
            System.out.println();
            int num = 100;
            int S1 = 52;
            int s1 = 26;
            int S2 = 87;
            int s2 = 49;
            int S3 = 97;
            int s3 = 7;

            int L1 = 24;
            int l1 = 4;
            int L2 = 45;
            int l2 = 28;
            int L3 = 77;
            int l3 = 32;
            if (sumPlayer == S1) {
                sumPlayer -= (S1-s1);
                System.out.println("Snake bite Player");
            } else if(sumPlayer==S2){
                sumPlayer -= (S2-s2);
                System.out.println("Snake bite Player");
            } else if(sumPlayer==S3){
                sumPlayer -= (S3-s3);
                System.out.println("Snake bite Player");
            }else if (sumPlayer == l1) {
                sumPlayer += (L1-l1);
                System.out.println("The Player went upward through ladder");
            }else if(sumPlayer==l2){
                sumPlayer += (L2-l2);
                System.out.println("The Player went upward through ladder");
            }else if(sumPlayer==l3){
                sumPlayer += (L3-l3);
                System.out.println("The Player went upward through ladder");
            }
            if (sumComp == S1) {
                sumComp -= (S1-s1);
                System.out.println("snake bite Comp");
            }else if(sumComp == S2){
                sumComp -= (S2-s2);
                System.out.println("snake bite Comp");
            }else if(sumComp==S3){
                sumComp -= (S3-s3);
                System.out.println("snake bite Comp");
            }else if (sumComp == l1) {
                sumComp += (L1-l1);
                System.out.println("The computer went upward through ladder");
            }else if(sumComp==l2){
                sumComp += (L2-l2);
                System.out.println("The computer went upward through ladder");
            }else if(sumComp==l3){
                sumComp += (L3-l3);
                System.out.println("The computer went upward through ladder");
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if(num == sumPlayer && num == sumComp){
                        board[i][j] = "*PC";
                    }else if (num == sumPlayer) {
                        board[i][j] = "*P";
                    } else if (num == sumComp) {
                        board[i][j] = "*C";
                    } else if (num == s1) {
                        board[i][j] = "_s1";
                    } else if (num == S1) {
                        board[i][j] = "-S1";
                    } else if (num == s2) {
                        board[i][j] = "_s2";
                    } else if (num == S2) {
                        board[i][j] = "-S2";
                    }else if (num == s3) {
                        board[i][j] = "_s3";
                    }else if (num == S3) {
                        board[i][j] = "-S3";
                    }else if (num == l1) {
                        board[i][j] = "+l1";
                    } else if (num == L1) {
                        board[i][j] = "_L1";
                    } else if (num == l2) {
                        board[i][j] = "+l2";
                    } else if (num == L2) {
                        board[i][j] = "_L2";
                    }else if (num == l3) {
                        board[i][j] = "+l3";
                    } else if (num == L3) {
                        board[i][j] = "_L3";
                    }else {
                        board[i][j] = String.valueOf(num);
                    }
                    num--;
                }
            }
            printBoard(board);
            if (sumPlayer == 100) {
                win = "player";
                //System.out.println("==============YOU IS WIN==============");
            } else if (sumComp == 100) {
                win = "comp";
                //System.out.println("==============COMPUTER IS WIN==============");
            }
        }while (win == "false");
        
        return win;
    }
    public static String twoPlayersGame(String board[][],String a,String b) {
        Scanner input = new Scanner(System.in);
        int sumPlayerOne = 0;
        int sumPlayerTwo = 0;
        String win = "false";
        do {
            System.out.println("=========================================================");
            System.out.println("SNAKE MOUTH IS AT 52, 87, 97 AND TAIL IS AT  26, 49, 7");
            System.out.println("LADDER STARTS  AT  4, 28, 32 AND  ENDS   AT  24, 45, 77");
            System.out.println("==========================================================");
            System.out.println("First "+ a + " turn, Enter r to roll");
            input.next();

            int dicePlayerOne = getRandom();
            System.out.println();
            System.out.println(a + " dice number is:" + dicePlayerOne);
            while (dicePlayerOne % 6 == 0) {
                System.out.println(a + " bonus turn, Enter r to roll");
                input.next();
                int diceBonusPlayerOne = getRandom();
                System.out.println();
                System.out.println(a + " dice number is:" + diceBonusPlayerOne);
                dicePlayerOne += diceBonusPlayerOne;
            }
            sumPlayerOne += dicePlayerOne;
            if (sumPlayerOne > 100 || dicePlayerOne >= 18) {
                sumPlayerOne -= dicePlayerOne;
            }
            System.out.println("Next "+ b + " turn, Enter r to roll");
            input.next();
            int dicePlayerTwo = getRandom();
            System.out.println();
            System.out.println(b + " dice number is:" + dicePlayerTwo);
            while (dicePlayerTwo % 6 == 0) {
                System.out.println(b + " bonus turn, Enter r to roll");
                int diceBonusComp = getRandom();
                input.next();
                System.out.println();
                System.out.println(b + " dice number is:" + diceBonusComp);
                dicePlayerTwo += diceBonusComp;
            }
            sumPlayerTwo += dicePlayerTwo;
            if (sumPlayerTwo > 100 || dicePlayerTwo >= 18) {
                sumPlayerTwo -= dicePlayerTwo;
            }
            System.out.println("-----------");
            System.out.println("SCORE BOARD");
            System.out.println("```````````");
            System.out.println(a + " score till now is : " + sumPlayerOne);
            System.out.println(b + " score till now is : " + sumPlayerTwo);
            System.out.println();
            int num = 100;
            int S1 = 52;
            int s1 = 26;
            int S2 = 87;
            int s2 = 49;
            int S3 = 97;
            int s3 = 7;

            int L1 = 24;
            int l1 = 4;
            int L2 = 45;
            int l2 = 28;
            int L3 = 77;
            int l3 = 32;
            if (sumPlayerOne == S1) {
                sumPlayerOne -= (S1-s1);
                System.out.println("Snake bite " + a);
            }else if(sumPlayerOne == S2){
                sumPlayerOne -= (S2-s2);
                System.out.println("Snake bite " + a);
            }else if(sumPlayerOne == S3){
                sumPlayerOne -= (S3-s3);
                System.out.println("Snake bite " + a);
            }else if (sumPlayerOne == l1) {
                sumPlayerOne += (L1-l1);
                System.out.println("The " + a + " went upward through ladder");
            }else if (sumPlayerOne == l2) {
                sumPlayerOne += (L2-l2);
                System.out.println("The " + a + " went upward through ladder");
            }else if (sumPlayerOne == l3) {
                sumPlayerOne += (L3-l3);
                System.out.println("The " + a + " went upward through ladder");
            }

            if (sumPlayerTwo == S1) {
                sumPlayerTwo -= (S1-s1);
                System.out.println("Snake bite " + b);
            }else if(sumPlayerTwo == S2){
                sumPlayerTwo -= (S2-s2);
                System.out.println("Snake bite " + b);
            }else if(sumPlayerTwo == S3){
                sumPlayerTwo -= (S3-s3);
                System.out.println("Snake bite " + b);
            }else if (sumPlayerTwo == l1) {
                sumPlayerTwo += (L1-l1);
                System.out.println("The " + b + " went upward through ladder");
            }else if (sumPlayerTwo == l2) {
                sumPlayerTwo += (L2-l2);
                System.out.println("The " + b + " went upward through ladder");
            }else if (sumPlayerTwo == l3) {
                sumPlayerTwo += (L3-l3);
                System.out.println("The " + b + " went upward through ladder");
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if(num==sumPlayerOne && num== sumPlayerTwo){
                        board[i][j] = "*PP";
                    }else if (num == sumPlayerOne) {
                        board[i][j] = "*P1";
                    } else if (num == sumPlayerTwo) {
                        board[i][j] = "*P2";
                    } else if (num == s1) {
                        board[i][j] = "_s1";
                    } else if (num == S1) {
                        board[i][j] = "-S1";
                    } else if (num == l1) {
                        board[i][j] = "+l1";
                    } else if (num == L1) {
                        board[i][j] = "_L1";
                    }else if (num == s2) {
                        board[i][j] = "_s2";
                    } else if (num == S2) {
                        board[i][j] = "-S2";
                    } else if (num == l2) {
                        board[i][j] = "+l2";
                    } else if (num == L2) {
                        board[i][j] = "_L2";
                    }else if (num == s3) {
                        board[i][j] = "_s3";
                    } else if (num == S1) {
                        board[i][j] = "-S3";
                    } else if (num == l1) {
                        board[i][j] = "+l3";
                    } else if (num == L3) {
                        board[i][j] = "_L3";
                    }else {
                        board[i][j] = String.valueOf(num);
                    }
                    num--;
                }
            }
            printBoard(board);
            if (sumPlayerOne == 100) {
                win = "p1";
            } else if (sumPlayerTwo == 100) {
                win = "p2";
            }
        }while (win == "false");
        return win;
    }
    public static String threePlayersGame(String board[][],String a,String b,String c) {
        Scanner input = new Scanner(System.in);
        int sumPlayerOne = 0;
        int sumPlayerTwo = 0;
        int sumPlayerThree=0;
        String win = "false";
        do {
            System.out.println("=========================================================");
            System.out.println("SNAKE MOUTH IS AT 52, 87, 97 AND TAIL IS AT  26, 49, 7");
            System.out.println("LADDER STARTS  AT  4, 28, 32 AND  ENDS   AT  24, 45, 77");
            System.out.println("==========================================================");
            
            System.out.println("First "+ a + " turn, Enter r to roll");
            input.next();
            int dicePlayerOne = getRandom();
            System.out.println();
            System.out.println(a + " dice number is:" + dicePlayerOne);
            while (dicePlayerOne % 6 == 0) {
                System.out.println(a + " bonus turn, Enter r to roll");
                input.next();
                int diceBonusPlayerOne = getRandom();
                System.out.println();
                System.out.println(a + " dice number is:" + diceBonusPlayerOne);
                dicePlayerOne += diceBonusPlayerOne;
            }
            sumPlayerOne += dicePlayerOne;
            if (sumPlayerOne > 100 || dicePlayerOne >= 18) {
                sumPlayerOne -= dicePlayerOne;
            }
            System.out.println("Next "+ b + " turn, Enter r to roll");
            input.next();
            int dicePlayerTwo = getRandom();
            System.out.println();
            System.out.println(b + " dice number is:" + dicePlayerTwo);
            while (dicePlayerTwo % 6 == 0) {
                System.out.println(b + " bonus turn, Enter r to roll");
                int diceBonusComp = getRandom();
                input.next();
                System.out.println();
                System.out.println(b + " dice number is:" + diceBonusComp);
                dicePlayerTwo += diceBonusComp;
            }
            sumPlayerTwo += dicePlayerTwo;
            if (sumPlayerTwo > 100 || dicePlayerTwo >= 18) {
                sumPlayerTwo -= dicePlayerTwo;
            }


            System.out.println("Next "+ c + " turn, Enter r to roll");
            input.next();
            int dicePlayerThree = getRandom();
            System.out.println();
            System.out.println(b + " dice number is:" + dicePlayerThree);
            while (dicePlayerThree % 6 == 0) {
                System.out.println(c + " bonus turn, Enter r to roll");
                int diceBonusComp = getRandom();
                input.next();
                System.out.println();
                System.out.println(b + " dice number is:" + diceBonusComp);
                dicePlayerThree += diceBonusComp;
            }
            sumPlayerThree += dicePlayerThree;
            if (sumPlayerTwo > 100 || dicePlayerTwo >= 18) {
                sumPlayerThree -= dicePlayerThree;
            }
            System.out.println("-----------");
            System.out.println("SCORE BOARD");
            System.out.println("```````````");
            System.out.println(a + " score till now is : " + sumPlayerOne);
            System.out.println(b + " score till now is : " + sumPlayerTwo);
            System.out.println(c + " score till now is : " + sumPlayerThree);
            System.out.println();
            int num = 100;
            int S1 = 52;
            int s1 = 26;
            int S2 = 87;
            int s2 = 49;
            int S3 = 97;
            int s3 = 7;

            int L1 = 24;
            int l1 = 4;
            int L2 = 45;
            int l2 = 28;
            int L3 = 77;
            int l3 = 32;
            if (sumPlayerOne == S1) {
                sumPlayerOne -= (S1-s1);
                System.out.println("Snake bite " + a);
            }else if(sumPlayerOne == S2){
                sumPlayerOne -= (S2-s2);
                System.out.println("Snake bite " + a);
            }else if(sumPlayerOne == S3){
                sumPlayerOne -= (S3-s3);
                System.out.println("Snake bite " + a);
            }else if (sumPlayerOne == l1) {
                sumPlayerOne += (L1-l1);
                System.out.println("The " + a + " went upward through ladder");
            }else if (sumPlayerOne == l2) {
                sumPlayerOne += (L2-l2);
                System.out.println("The " + a + " went upward through ladder");
            }else if (sumPlayerOne == l3) {
                sumPlayerOne += (L3-l3);
                System.out.println("The " + a + " went upward through ladder");
            }

            if (sumPlayerTwo == S1) {
                sumPlayerTwo -= (S1-s1);
                System.out.println("Snake bite " + b);
            }else if(sumPlayerTwo == S2){
                sumPlayerTwo -= (S2-s2);
                System.out.println("Snake bite " + b);
            }else if(sumPlayerTwo == S3){
                sumPlayerTwo -= (S3-s3);
                System.out.println("Snake bite " + b);
            }else if (sumPlayerTwo == l1) {
                sumPlayerTwo += (L1-l1);
                System.out.println("The " + b + " went upward through ladder");
            }else if (sumPlayerTwo == l2) {
                sumPlayerTwo += (L2-l2);
                System.out.println("The " + b + " went upward through ladder");
            }else if (sumPlayerTwo == l3) {
                sumPlayerTwo += (L3-l3);
                System.out.println("The " + b + " went upward through ladder");
            }
            
            if (sumPlayerThree == S1) {
                sumPlayerThree -= (S1-s1);
                System.out.println("Snake bite " + c);
            }else if(sumPlayerThree == S2){
                sumPlayerThree -= (S2-s2);
                System.out.println("Snake bite " + c);
            }else if(sumPlayerThree == S3){
                sumPlayerThree -= (S3-s3);
                System.out.println("Snake bite " + c);
            }else if (sumPlayerThree == l1) {
                sumPlayerThree += (L1-l1);
                System.out.println("The " + c + " went upward through ladder");
            }else if (sumPlayerThree == l2) {
                sumPlayerThree += (L2-l2);
                System.out.println("The " + c + " went upward through ladder");
            }else if (sumPlayerThree == l3) {
                sumPlayerThree += (L3-l3);
                System.out.println("The " + c + " went upward through ladder");
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if(num==sumPlayerOne && num== sumPlayerTwo && num== sumPlayerThree){
                        board[i][j] = "PPP";
                    }else if ((num == sumPlayerOne && num== sumPlayerTwo) || (num == sumPlayerOne && num== sumPlayerThree) || (num == sumPlayerTwo && num== sumPlayerThree) || (num == sumPlayerTwo && num== sumPlayerThree)) {
                        board[i][j] = "PP";
                    }else if (num == sumPlayerOne) {
                        board[i][j] = "*P1";
                    } else if (num == sumPlayerTwo) {
                        board[i][j] = "*P2";
                    }else if (num == sumPlayerThree) {
                        board[i][j] = "*P3";
                    }else if (num == s1) {
                        board[i][j] = "_s1";
                    } else if (num == S1) {
                        board[i][j] = "-S1";
                    } else if (num == l1) {
                        board[i][j] = "+l1";
                    } else if (num == L1) {
                        board[i][j] = "_L1";
                    }else if (num == s2) {
                        board[i][j] = "_s2";
                    } else if (num == S2) {
                        board[i][j] = "-S2";
                    } else if (num == l2) {
                        board[i][j] = "+l2";
                    } else if (num == L2) {
                        board[i][j] = "_L2";
                    }else if (num == s3) {
                        board[i][j] = "_s3";
                    } else if (num == S3) {
                        board[i][j] = "-S3";
                    } else if (num == l3) {
                        board[i][j] = "+l3";
                    } else if (num == L3) {
                        board[i][j] = "_L3";
                    }else {
                        board[i][j] = String.valueOf(num);
                    }
                    num--;
                }
            }
            printBoard(board);
            if (sumPlayerOne == 100) {
                win = "p1";
            } else if (sumPlayerTwo == 100) {
                win = "p2";
            }else if(sumPlayerThree==100){
                win="p3";
            }
        }while (win == "false");
        return win;
    }
    public static String fourPlayersGame(String board[][],String a,String b,String c,String d) {
        Scanner input = new Scanner(System.in);
        int sumPlayerOne = 0;
        int sumPlayerTwo = 0;
        int sumPlayerThree=0;
        int sumPlayerFour=0;
        String win = "false";
        do {
            System.out.println("=========================================================");
            System.out.println("SNAKE MOUTH IS AT 52, 87, 97 AND TAIL IS AT  26, 49, 7");
            System.out.println("LADDER STARTS  AT  4, 28, 32 AND  ENDS   AT  24, 45, 77");
            System.out.println("==========================================================");
            
            System.out.println("First "+ a + " turn, Enter r to roll");
            input.next();
            int dicePlayerOne = getRandom();
            System.out.println();
            System.out.println(a + " dice number is:" + dicePlayerOne);
            while (dicePlayerOne % 6 == 0) {
                System.out.println(a + " bonus turn, Enter r to roll");
                input.next();
                int diceBonusPlayerOne = getRandom();
                System.out.println();
                System.out.println(a + " dice number is:" + diceBonusPlayerOne);
                dicePlayerOne += diceBonusPlayerOne;
            }
            sumPlayerOne += dicePlayerOne;
            if (sumPlayerOne > 100 || dicePlayerOne >= 18) {
                sumPlayerOne -= dicePlayerOne;
            }
            System.out.println("Next "+ b + " turn, Enter r to roll");
            input.next();
            int dicePlayerTwo = getRandom();
            System.out.println();
            System.out.println(b + " dice number is:" + dicePlayerTwo);
            while (dicePlayerTwo % 6 == 0) {
                System.out.println(b + " bonus turn, Enter r to roll");
                int diceBonusComp = getRandom();
                input.next();
                System.out.println();
                System.out.println(b + " dice number is:" + diceBonusComp);
                dicePlayerTwo += diceBonusComp;
            }
            sumPlayerTwo += dicePlayerTwo;
            if (sumPlayerTwo > 100 || dicePlayerTwo >= 18) {
                sumPlayerTwo -= dicePlayerTwo;
            }


            System.out.println("Next "+ c + " turn, Enter r to roll");
            input.next();
            int dicePlayerThree = getRandom();
            System.out.println();
            System.out.println(b + " dice number is:" + dicePlayerThree);
            while (dicePlayerThree % 6 == 0) {
                System.out.println(c + " bonus turn, Enter r to roll");
                int diceBonusComp = getRandom();
                input.next();
                System.out.println();
                System.out.println(b + " dice number is:" + diceBonusComp);
                dicePlayerThree += diceBonusComp;
            }
            sumPlayerThree += dicePlayerThree;
            if (sumPlayerTwo > 100 || dicePlayerTwo >= 18) {
                sumPlayerThree -= dicePlayerThree;
            }


            System.out.println("Next "+ d + " turn, Enter r to roll");
            input.next();
            int dicePlayerFour = getRandom();
            System.out.println();
            System.out.println(d + " dice number is:" + dicePlayerFour);
            while (dicePlayerFour % 6 == 0) {
                System.out.println(d + " bonus turn, Enter r to roll");
                int diceBonusComp = getRandom();
                input.next();
                System.out.println();
                System.out.println(d + " dice number is:" + diceBonusComp);
                dicePlayerFour += diceBonusComp;
            }
            sumPlayerFour += dicePlayerFour;
            if (sumPlayerFour > 100 || dicePlayerFour >= 18) {
                sumPlayerFour -= dicePlayerFour;
            }
            System.out.println("-----------");
            System.out.println("SCORE BOARD");
            System.out.println("```````````");
            System.out.println(a + " score till now is : " + sumPlayerOne);
            System.out.println(b + " score till now is : " + sumPlayerTwo);
            System.out.println(c + " score till now is : " + sumPlayerThree);
            System.out.println(d + " score till now is : " + sumPlayerFour);
            System.out.println();
            int num = 100;
            int S1 = 52;
            int s1 = 26;
            int S2 = 87;
            int s2 = 49;
            int S3 = 97;
            int s3 = 7;

            int L1 = 24;
            int l1 = 4;
            int L2 = 45;
            int l2 = 28;
            int L3 = 77;
            int l3 = 32;
            if (sumPlayerOne == S1) {
                sumPlayerOne -= (S1-s1);
                System.out.println("Snake bite " + a);
            }else if(sumPlayerOne == S2){
                sumPlayerOne -= (S2-s2);
                System.out.println("Snake bite " + a);
            }else if(sumPlayerOne == S3){
                sumPlayerOne -= (S3-s3);
                System.out.println("Snake bite " + a);
            }else if (sumPlayerOne == l1) {
                sumPlayerOne += (L1-l1);
                System.out.println("The " + a + " went upward through ladder");
            }else if (sumPlayerOne == l2) {
                sumPlayerOne += (L2-l2);
                System.out.println("The " + a + " went upward through ladder");
            }else if (sumPlayerOne == l3) {
                sumPlayerOne += (L3-l3);
                System.out.println("The " + a + " went upward through ladder");
            }

            if (sumPlayerTwo == S1) {
                sumPlayerTwo -= (S1-s1);
                System.out.println("Snake bite " + b);
            }else if(sumPlayerTwo == S2){
                sumPlayerTwo -= (S2-s2);
                System.out.println("Snake bite " + b);
            }else if(sumPlayerTwo == S3){
                sumPlayerTwo -= (S3-s3);
                System.out.println("Snake bite " + b);
            }else if (sumPlayerTwo == l1) {
                sumPlayerTwo += (L1-l1);
                System.out.println("The " + b + " went upward through ladder");
            }else if (sumPlayerTwo == l2) {
                sumPlayerTwo += (L2-l2);
                System.out.println("The " + b + " went upward through ladder");
            }else if (sumPlayerTwo == l3) {
                sumPlayerTwo += (L3-l3);
                System.out.println("The " + b + " went upward through ladder");
            }
            
            if (sumPlayerThree == S1) {
                sumPlayerThree -= (S1-s1);
                System.out.println("Snake bite " + c);
            }else if(sumPlayerThree == S2){
                sumPlayerThree -= (S2-s2);
                System.out.println("Snake bite " + c);
            }else if(sumPlayerThree == S3){
                sumPlayerThree -= (S3-s3);
                System.out.println("Snake bite " + c);
            }else if (sumPlayerThree == l1) {
                sumPlayerThree += (L1-l1);
                System.out.println("The " + c + " went upward through ladder");
            }else if (sumPlayerThree == l2) {
                sumPlayerThree += (L2-l2);
                System.out.println("The " + c + " went upward through ladder");
            }else if (sumPlayerThree == l3) {
                sumPlayerThree += (L3-l3);
                System.out.println("The " + c + " went upward through ladder");
            }
            if (sumPlayerFour == S1) {
                sumPlayerFour -= (S1-s1);
                System.out.println("Snake bite " + d);
            }else if(sumPlayerFour == S2){
                sumPlayerFour -= (S2-s2);
                System.out.println("Snake bite " + d);
            }else if(sumPlayerFour == S3){
                sumPlayerFour -= (S3-s3);
                System.out.println("Snake bite " + d);
            }else if (sumPlayerFour == l1) {
                sumPlayerFour += (L1-l1);
                System.out.println("The " + d + " went upward through ladder");
            }else if (sumPlayerFour == l2) {
                sumPlayerFour += (L2-l2);
                System.out.println("The " + d + " went upward through ladder");
            }else if (sumPlayerFour == l3) {
                sumPlayerFour += (L3-l3);
                System.out.println("The " + d + " went upward through ladder");
            }
            //filling board
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if(num==sumPlayerOne && num== sumPlayerTwo && num== sumPlayerThree && num== sumPlayerFour){
                        board[i][j] = "PPPP";
                    }
                    else if(num==sumPlayerOne && num== sumPlayerTwo && num== sumPlayerThree){
                        board[i][j] = "PPP";
                    }else if(num==sumPlayerTwo && num== sumPlayerThree && num== sumPlayerFour){
                        board[i][j] = "PPP";
                    }else if(num==sumPlayerOne && num== sumPlayerThree && num== sumPlayerFour){
                        board[i][j] = "PPP";
                    }else if(num==sumPlayerOne && num== sumPlayerTwo && num== sumPlayerFour){
                        board[i][j] = "PPP";
                    }else if(num==sumPlayerOne && num== sumPlayerTwo || num== sumPlayerOne && num== sumPlayerThree || num ==sumPlayerOne && num==sumPlayerFour){
                        board[i][j] = "PP";
                    }else if(num==sumPlayerTwo && num== sumPlayerThree || num== sumPlayerTwo && num== sumPlayerFour || num ==sumPlayerThree && num==sumPlayerFour){
                        board[i][j] = "PP";
                    }else if (num == sumPlayerOne) {
                        board[i][j] = "*P1";
                    } else if (num == sumPlayerTwo) {
                        board[i][j] = "*P2";
                    }else if (num == sumPlayerThree) {
                        board[i][j] = "*P3";
                    } else if (num == sumPlayerFour) {
                        board[i][j] = "*P4";
                    }else if (num == s1) {
                        board[i][j] = "-s1";
                    } else if (num == S1) {
                        board[i][j] = "_S1";
                    } else if (num == l1) {
                        board[i][j] = "+l1";
                    } else if (num == L1) {
                        board[i][j] = "_L1";
                    }else if (num == s2) {
                        board[i][j] = "-s2";
                    } else if (num == S2) {
                        board[i][j] = "_S2";
                    } else if (num == l2) {
                        board[i][j] = "+l2";
                    } else if (num == L2) {
                        board[i][j] = "_L2";
                    }else if (num == s3) {
                        board[i][j] = "-s3";
                    } else if (num == S3) {
                        board[i][j] = "_S3";
                    } else if (num == l3) {
                        board[i][j] = "+l3";
                    } else if (num == L3) {
                        board[i][j] = "_L3";
                    }else {
                        board[i][j] = String.valueOf(num);
                    }
                    num--;
                }
            }
            //printing board
            printBoard(board);
            if (sumPlayerOne == 100) {
                win = "p1";
            } else if (sumPlayerTwo == 100) {
                win = "p2";
            }else if(sumPlayerThree==100){
                win="p3";
            }else if(sumPlayerFour==100){
                win="p4";
            }
        }while (win == "false");
        return win;
    }
}