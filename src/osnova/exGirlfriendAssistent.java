package osnova;

import interfejs.CitacGUI;
import interfejs.MojaKnjigaGUI;
import interfejs.IgraonicaGUI;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class exGirlfriendAssistent implements Runnable {

    public void run() {
        System.out.print("\nyou personal java ex girlfriend assistent->");
        String commandLine;
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        ProcessBuilder pb = new ProcessBuilder();
        List<String> history = new ArrayList<String>();
        
        List<Integer> commandsNumbers = new ArrayList<>();
        List<String> commandsList = Arrays.asList("history", "song", "game", "calculate", "givelove", "turnoff", "turnoffyes", "hey", "hi", "hello", "latinoserbia", "dome");
        int index = 0;

        int startup = 1;
        int calculate = 1;
        int love = 100;
        //we break out with <ctrl c>	
        while (true) {
            try {
                //read what the user enters
                System.out.print("\nyour ex gf->");
                commandLine = console.readLine();

                //input parsed into array of strings(commands)
                String[] commands = commandLine.split(" ");
                List<String> list = new ArrayList<String>();

                //loop through to see if parsing worked
                for (int i = 0; i < commands.length; i++) {
                    //System.out.println(commands[i]); ***check to see if parsing/split worked***
                    list.add(commands[i]);

                }
                //System.out.print(list); ***check to see if list was added correctly***
                history.addAll(list);
                try {
                    //display history of shell with index
                    if (list.get(list.size() - 1).equals("history")) {
                        for (String s : history) {
                            System.out.println((index++) + " " + s);
                        }
                        continue;
                    }

                    //change directory
                    if (list.contains("cd")) {
                        if (list.get(list.size() - 1).equals("cd")) {
                            File home = new File(System.getProperty("user.home"));
                            //test to see what user.home changes to
                            //System.out.println("The home directory is " + home);
                            pb.directory(home);
                            continue;

                        } else {
                            String dir = list.get(1);
                            //test to see what directory was passed
                            //System.out.println("The directory passed is " + dir);
                            File newPath = new File(dir);
                            boolean exists = newPath.exists();

                            if (exists) {
                                System.out.println("/" + dir); //added the "/" for cleaner output
                                pb.directory(newPath);
                                continue;
                            } else {
                                //if directory doesn't exist
                                System.out.print("Path ");
                            }
                        }
                    }
                    if (love > 80) {
                        if (list.contains("song")) {
                            love -= -20;
                            System.out.println("Park outside");
                            try {
                                TimeUnit.MILLISECONDS.sleep(1000);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("got 500 porsches");
                            try {
                                TimeUnit.MILLISECONDS.sleep(2400);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("lookin at you in");
                            try {
                                TimeUnit.MILLISECONDS.sleep(1200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("boy you so gorgeous");
                            try {
                                TimeUnit.MILLISECONDS.sleep(1700);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("gotta couple horses");
                            try {
                                TimeUnit.MILLISECONDS.sleep(2500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("come check out my stall");
                            try {
                                TimeUnit.MILLISECONDS.sleep(1200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("take a look, me man?");
                            System.out.println("");
                            try {
                                TimeUnit.MILLISECONDS.sleep(2700);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("know that I ball");
                            try {
                                TimeUnit.MILLISECONDS.sleep(1200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("money so tall $$$$$");
                            try {
                                TimeUnit.MILLISECONDS.sleep(2200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("chain so icey");
                            try {
                                TimeUnit.MILLISECONDS.sleep(2300);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("lookin in yo eyes");
                            try {
                                TimeUnit.MILLISECONDS.sleep(1200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("i can tell dat you like me");
                            try {
                                TimeUnit.MILLISECONDS.sleep(2400);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("kinda tied up");
                            try {
                                TimeUnit.MILLISECONDS.sleep(1500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("like da shoes on my nikes");
                            try {
                                TimeUnit.MILLISECONDS.sleep(2900);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("gotta question boy");
                            try {
                                TimeUnit.MILLISECONDS.sleep(1700);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("will you be my manfy?");

                            continue;
                        }
                        if(list.contains("latinoserbia")){
                            love -= -20;
                            System.out.println("Muerto si, amigo, jer si mi laz rek'o");
                            try {
                                TimeUnit.MILLISECONDS.sleep(1000);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("revolveron catas para mi contigo");
                            try {
                                TimeUnit.MILLISECONDS.sleep(2400);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("placi, muzo pandureva i cero");
                            try {
                                TimeUnit.MILLISECONDS.sleep(1200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("el guapo cigojna diablo pistolero");
                            System.out.println("");
                            try {
                                TimeUnit.MILLISECONDS.sleep(2700);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("La policia driblam k’o Fernando Hierro");
                            try {
                                TimeUnit.MILLISECONDS.sleep(2500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("oseti pasiones, you dumb quero");
                            try {
                                TimeUnit.MILLISECONDS.sleep(1200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("e onda, muchachos, za bien este miro");
                            continue;
                    }}
                    if (love > 20) {
                        if (list.contains("commands")) {
                            System.out.println(commandsList);
                            continue;
                        }
                    }
                    if (love > 60) {
                        if (list.contains("dome")) {
                            love += -5;
                            Random r = new Random();
                            int pitanje = r.nextInt(5);
                            if (pitanje == 0) {
                                System.out.println("you do, i don't want");
                            } else if (pitanje == 1) {
                                System.out.println("you sloths");
                            } else {
                                System.out.println("this is sick");
                            }

                            continue;
                        }
                        if (list.contains("game")) {
                            love += -10;
                            System.out.println("check this out");
                           System.out.println("haha nothing");
                            continue;
                        }
                        if (list.contains("calculatewords")) {
                            love += -15;
                            System.out.println("stay swag homie");
                            continue;
                        }
                    }
                    if (love > 80) {
                        if (list.contains("calculate")) {
                            love += -30;
                            Scanner input = new Scanner(System.in);
                            System.out.print("enter your number bimbo ");
                            int num1 = input.nextInt();

                            System.out.print("operator pra pra pra ");
                            char operator = input.next().charAt(0);

                            System.out.print("enter next, whatever ");
                            int num2 = input.nextInt();
                            // this part of decision, it doesn't work.
                            if ('+' == operator) {
                                System.out.println("there you are dogo " + (num1 + num2));
                                continue;
                            } else if ('-' == operator) {
                                System.out.println("gg ez " + (num1 - num2));
                                continue;
                            } else if ('*' == operator) {
                                System.out.println("ok " + (num1 * num2));
                                continue;
                            } else if ('/' == operator) {
                                System.out.println("easy " + (num1 / num2));
                                continue;
                            } else {
                                System.out.println("you broke something, wtf man");
                                continue;
                            }
                        }
                    }
                    if (list.contains("givelove")) {
                        love -= -30;
                        ArrayList<String> listMessages = new ArrayList<>();
                        Random r = new Random();
                        int pitanje = r.nextInt(6);
                        listMessages.add("now you have found that you love me, ok");
                        listMessages.add("kiss");
                        listMessages.add("not interested");
                        listMessages.add("what?");
                        listMessages.add("come here");
                        listMessages.add("weirdo");
                        System.out.println(listMessages.get(pitanje));
                        continue;
                    }
                    if (list.contains("turnoff")) {
                        love += -100;
                        System.out.println("just turn off girl without even asking");
                        System.out.println("are you serious?");
                        System.out.println("say that again and i'm gonna kick your ass");
                        continue;
                    }
                    if (list.contains("turnoffyes")) {
                        System.out.println("wtf, you are soo aggressive");
                        System.exit(0);
                    }
                    if (startup == 2) {
                        love += -10;
                        Random r = new Random();
                        int pitanje = r.nextInt(4);
                        ArrayList<String> listMessages = new ArrayList<>();
                        listMessages.add("omg stop");
                        listMessages.add("stop pushing me, what's wrong with you");
                        listMessages.add("slow down boy");
                        listMessages.add("you so annoying, jesus");
                        listMessages.add("i don't want to do that");
                        System.out.println(listMessages.get(pitanje));
                        continue;
                        //just turn off girls without even asking
                    } else if (startup == 1) {
                        if (list.contains("hey") || list.contains("hi") || list.contains("hello")) {
                            if (startup == 1 && list.get(list.size() - 1).equals("hey")) {
                                System.out.println("hey boy");
                                ++startup;
                                love -= -0;
                                continue;
                            } else if (list.get(list.size() - 1).equals("hi")) {
                                System.out.println("flirty,i like that");
                                ++startup;
                                love -= -5;
                                continue;
                            } else if (list.get(list.size() - 1).equals("hello")) {
                                System.out.println("formal, wtf wrong with you?");
                                ++startup;
                                love += -10;
                                continue;
                            }
                        }
                    }
                    //!! startup returns the last startup in history
                    if (list.get(list.size() - 1).equals("!!")) {
                        pb.command(history.get(history.size() - 2));

                    }//!<integer value i> startup
                    else if (list.get(list.size() - 1).charAt(0) == '!') {
                        int b = Character.getNumericValue(list.get(list.size() - 1).charAt(1));
                        if (b <= history.size())//check if integer entered isn't bigger than history size
                        {
                            pb.command(history.get(b));
                        }
                    } else {
                        pb.command(list);
                    }

                    Process process = pb.start();

                    //obtain the input stream
                    InputStream is = process.getInputStream();
                    InputStreamReader isr = new InputStreamReader(is);
                    BufferedReader br = new BufferedReader(isr);

                    //read output of the process
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                    br.close();

                    //if the user entered a return, just loop again
                    if (commandLine.equals(" ")) {
                        continue;
                    }
                } //catch ioexception, output appropriate message, resume waiting for input //catch ioexception, output appropriate message, resume waiting for input //catch ioexception, output appropriate message, resume waiting for input //catch ioexception, output appropriate message, resume waiting for input //catch ioexception, output appropriate message, resume waiting for input //catch ioexception, output appropriate message, resume waiting for input //catch ioexception, output appropriate message, resume waiting for input //catch ioexception, output appropriate message, resume waiting for input
                catch (IOException e) {
                    System.out.println("i don't want to do that");
                }

            } catch (IOException ex) {
                Logger.getLogger(exGirlfriendAssistent.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
