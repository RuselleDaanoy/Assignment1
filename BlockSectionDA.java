import java.util.*;
import java.io.*;

public class BlockSectionDA {
    private ArrayList<BlockSection> blockSectionList;

    public BlockSectionDA() throws FileNotFoundException {
        blockSectionList = new ArrayList<>();
        Scanner blockSectionScanner = new Scanner(new FileReader("blockSection.csv"));

        while (blockSectionScanner.hasNextLine()) {
            String blockSectionLine = blockSectionScanner.nextLine();
            String[] blockSectionData = blockSectionLine.split(",");

            BlockSection blockSection = new BlockSection();
            blockSection.setBlockCode(blockSectionData[0].trim());
            blockSection.setDescription(blockSectionData[1].trim());
            blockSection.setAdviser(blockSectionData[2].trim());

            StudentDA studentDA = new StudentDA(blockSection.getBlockCode());
            ArrayList<Student> students = studentDA.getStudents(); 
            for (Student student : students) {
                blockSection.addStudent(student); 
            }
            blockSectionList.add(blockSection);
        }
        blockSectionScanner.close();
    }

    public ArrayList<BlockSection> getBlockSectionList() {
        return blockSectionList;
    }
}