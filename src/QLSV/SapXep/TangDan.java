package QLSV.SapXep;

import java.util.Comparator;
import QLSV.thongTinSV;

public class TangDan implements Comparator<thongTinSV> {
    @Override
    public int compare(thongTinSV o1, thongTinSV o2) {
        if (o1.getDiemTB() == o2.getDiemTB()){
            return 0;
        }else if (o1.getDiemTB() >  o2.getDiemTB()) {
            return 1;
        } else {
            return -1;
        }
    }
}
