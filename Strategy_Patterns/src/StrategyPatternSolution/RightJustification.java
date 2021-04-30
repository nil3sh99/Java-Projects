package StrategyPatternSolution;

public class RightJustification implements JustificationStrategy{

    public void justify(String line, int width) {
        String buf = new String();
        int offset = width - line.length();
        for (int i = 0; i < offset; i++)
            buf = buf + " ";
        buf = buf + line;
        System.out.println(buf);
    }

}
