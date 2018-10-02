public class CountingValleys {

        public int solution(int n, String s) {

            int valleys = 0;

            int direction = 0;

            String [] steps = s.split("");

            boolean seaLevel = true;

            for (int i=0; i<n; i++) {
                if (steps[i].equalsIgnoreCase("U"))
                    direction++;
                else
                    direction--;

                if ((direction<0) && (seaLevel)) {
                    valleys++;
                    seaLevel = false;
                }

                if (direction >= 0)
                    seaLevel = true;
            }
return valleys;
        }
}
