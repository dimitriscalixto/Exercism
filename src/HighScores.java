import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
class HighScores {
    private final List<Integer> list;

    public static void main(String[] args) {
        HighScores highScores = new HighScores(Arrays.asList(30, 70));
        System.out.println(highScores.personalTopThree());
        System.out.println(highScores.scores());
    }
    public HighScores(List<Integer> highScores) {
        this.list = highScores;
    }

    List<Integer> scores() {
        return this.list;
    }

    Integer latest() {
        return this.list.get(this.list.size()-1);
    }

    Integer personalBest() {
        return Collections.max(this.list);
    }

    List<Integer> personalTopThree() {
        List<Integer> newList = new ArrayList<>(this.list);

        if(newList.size() == 1){
            return Collections.singletonList(newList.get(0 ));
        } else if (newList.size() == 2) {
            newList.sort(Collections.reverseOrder());
            return newList.subList(0,2);
        }
        else {
            newList.sort(Collections.reverseOrder());

        return newList.subList(0,3);
        }
        }

}

