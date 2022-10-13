public class Main{
    public static void main(String args[]){

        String[] words = {"we", "all", "love", "programming", "with", "java"};
        String shortest = words[0];
        for ( int i=0; i<words.length; i++){
            if(words[i].length() <= shortest.length()){
                shortest = words[i];
            }
        }
        System.out.println("მასივში ზომით ყველაზე პატარა String-ია: " + shortest);

    }
}
