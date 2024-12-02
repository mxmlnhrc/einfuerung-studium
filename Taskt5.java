public class ExamTask5
{

    public int getCountOfMostUsedCharacter(final String p_str)
    {
        if(p_str == null || p_str.isEmpty()){
            return 0;
        }

        char[] p_char_array = p_str.toCharArray();
        int highest_count = 0;
        for(int i = 0; i < p_char_array.length; ++i){
            if(p_char_array[i] != ' '){
                int current_count = 0;
                for(int j = 0; j < p_char_array.length; ++j){
                    if(p_char_array[i] == p_char_array[j]){
                        current_count = current_count + 1;
                    }
                }
                if(current_count > highest_count){
                    highest_count = current_count;
                }
            }
        }
        return highest_count;
    }

    public static void main(String[] args)
    {
        // Hier koennen sie ihren eigenen Code zum Testen der Methode hinterlegen
        String[] tester = {"", null, "aaBBbbccDDeDDee", "Das ist ein Test     "};
        ExamTask5 task5 = new ExamTask5();
        for(int i = 0; i < tester.length; ++i){
            System.out.println(task5.getCountOfMostUsedCharacter(tester[i]));
        }


    }
}
