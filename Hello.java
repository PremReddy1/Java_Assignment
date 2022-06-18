import java.sql.SQLOutput;

public class Hello {
    public static void main(String args[]){
        for (int i=1; i<6; i++){
            for (int j=1;j<34;j++){
                if (i!=1 & j==1|| i!=1 & j==2|| i!=1 & j==4|| i!=1 & j==5|| j==6|| //T
                        i==2 & j==8 || i==2 & j==9 || i==2 & j==10 ||i==4 & j==8 || i==4 & j==9 || i==4 & j==10 ||j==11  //E
                        || i!=5 & j==13 || i!=5 & j==14 || i!=5 & j==15 || i!=5 & j==16 || j==17||  //L
                        i==4 & j==18 || i==4 & j==19 || i==4 & j==20 || i==2 & j==19 || i==2 & j==20 || i==2 & j==21 || j ==22//S
                        || i!=2 & i !=4 & j==25 || i!=1 &  i!= 5 & j==26 || i!=3 & j==24 || j==27 //K
                        || i!=1 & i!=5 & j==29  || i!=1 & i!=5 & j==30 || i!=1 & i!=5 & j==31 || i!=1 & i!=5 & j==32  //O
                        ||  i==1 & j==28 || i==1 & j==33 || i==5 & j==28 || i==5 & j==33
                ) {
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }

                }
            System.out.println();
       }
    }
}
