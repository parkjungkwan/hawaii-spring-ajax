package kr.co.bitcamp.proxies;
import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class Pager {
    private int rowCount, pageCount, blockCount,
                rowStart, pageStart, prevBlock,
                rowEnd, pageEnd, nextBlock,
                        pageSize, blockSize,
                        pageNow, blockNow;
    private boolean existPrev, existNext;
    private String searchWord;
    public void paging(){
        rowCount = 0;
        rowStart = pageNow * pageSize;
        rowEnd = (pageNow != (pageCount -1)) ? rowStart + (pageSize-1): rowCount - 1;
        pageCount = (rowCount % pageSize != 0) ? rowCount / pageSize +1 :rowCount / pageSize ;
        pageStart = blockNow *  blockSize;
        pageEnd = (blockNow != (blockCount -1)) ? pageStart + (blockSize - 1): pageCount - 1;
        // pageSize = 5;
        // pageNow = 0;
        blockCount = (pageCount % blockSize != 0) ? pageCount / blockSize +1:pageCount / blockSize ;
        prevBlock = pageStart - blockSize;
        nextBlock = pageStart + blockSize;
        // blockSize = 5;
        blockNow = pageNow / blockSize;
        System.out.println("blockNow :: "+blockNow);
        existPrev = blockNow != 0;
        System.out.println("existPrev :: "+existPrev);
        existNext = (blockNow + 1) != blockCount;
        System.out.println("existNext :: "+existNext);
    }

}
