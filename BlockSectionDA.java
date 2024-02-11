import java.util.*;
import java.io.*;

public class BlockSectionDA {
    private ArrayList<BlockSection> blockSectionList;

    public ArrayList<BlockSection> getBlockSectionList() {
        return blockSectionList;
    }

    public BlockSectionDA() throws FileNotFoundException {
        blockSectionList = new ArrayList<>();

        try (Scanner blockSectionScanner = new Scanner(new FileReader("blockSection.csv"))) {
            while (blockSectionScanner.hasNextLine()) {
                BlockSection blockSection = new BlockSection();

                String blockSectionLine = blockSectionScanner.nextLine();
                String[] blockSectionData = blockSectionLine.split(",");

                blockSection.setBlockCode(blockSectionData[0].trim());
                blockSection.setDescription(blockSectionData[1].trim());
                blockSection.setAdviser(blockSectionData[2].trim());

                StudentDA studentDA = new StudentDA(blockSection.getBlockCode());
                blockSection.setStudents(studentDA.getStudents());

                blockSectionList.add(blockSection);
            }
        }
    }
}
