package QLSV.SapXep;
import QLSV.thongTinSV;

import java.util.Comparator;

public class GiamDan implements Comparator<thongTinSV> {
    @Override
    public int compare(thongTinSV o1, thongTinSV o2) {
        if (o2.getDiemTB() == o1.getDiemTB()){
            return 0;
        }else if (o2.getDiemTB() >  o1.getDiemTB()) {
            return 1;
        } else {
            return -1;
        }
    }
}
