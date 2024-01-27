public class LwCaseToUpCase_Viseversa {
    public static void main(String args[]){
        String str = "Abilasha Subramani";
        StringBuffer sb = new StringBuffer(str);

        //output = aBILASHA sUBRAMANI

        for(int i=0; i<str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))){
                sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }

            if(Character.isUpperCase(str.charAt(i))){
                sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }

        System.out.println(sb);
    }
}
