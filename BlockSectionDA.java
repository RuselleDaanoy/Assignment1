import java.util.*;
import java.io.*;

class BlockSectionDA {
    private ArrayList<BlockSection> blockSectionList;

    public BlockSectionDA() throws FileNotFoundException {
        blockSectionList = new ArrayList<>();
        Scanner blockSectionScanner = new Scanner(new FileReader("blockSection.csv"));

        while (blockSectionScanner.hasNextLine()) {
            String blockSectionLine = blockSectionScanner.nextLine();
            String[] blockSectionData = blockSectionLine.split(",");

            BlockSection blockSection = new BlockSection(blockSectionData[0].trim(), blockSectionData[1].trim(), blockSectionData[2].trim());
            StudentDA studentDA = new StudentDA(blockSection.getBlockCode());
            ArrayList<Student> students = studentDA.getStudents(); // Get students for the block section
            for (Student student : students) {
                blockSection.addStudent(student); // Add each student to the block section
            }
            blockSectionList.add(blockSection);
        }
        blockSectionScanner.close();
    }

    public ArrayList<BlockSection> getBlockSectionList() {
        return blockSectionList;
    }
}
