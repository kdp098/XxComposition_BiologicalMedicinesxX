package textmanipulation.miniprosessing;

/**
 * ���p�A�S�p�p���L���ϊ�����
 */
public class StringConv {
    // ���p�����S�p�ϊ��e�[�u��
    private static String eisukigoHanZenTbl[][] =
        {
             {"!","�I"},{"\"","�h"},{"#","��"},{"$","��"},{"%","��"}
            ,{"&","��"},{"'","�f"},{"(","�i"},{")","�j"},{"*","��"}
            ,{"+","�{"},{".","�D"},{"-","�|"},{".","�D"},{"/","�^"}
            ,{":","�F"},{";","�G"},{">","��"},{"=","��"},{"<","��"}
            ,{"?","�H"},{"@","��"},{"[","�m"},{"\\","��"},{"]","�n"}
            ,{"^","�O"},{"_","�Q"},{"`","�e"},{"{","�o"},{"|","�b"}
            ,{"}","�p"},{"~","�`"},{",","�C"}
            ,{"1","�P"},{"2","�Q"},{"3","�R"},{"4","�S"},{"5","�T"}
            ,{"6","�U"},{"7","�V"},{"8","�W"},{"9","�X"},{"0","�O"}
            ,{"A","�`"},{"B","�a"},{"C","�b"},{"D","�c"},{"E","�d"}
            ,{"F","�e"},{"G","�f"},{"H","�g"},{"I","�h"},{"J","�i"}
            ,{"K","�j"},{"L","�k"},{"M","�l"},{"N","�m"},{"O","�n"}
            ,{"P","�o"},{"Q","�p"},{"R","�q"},{"S","�r"},{"T","�s"}
            ,{"U","�t"},{"V","�u"},{"W","�v"},{"X","�w"},{"Y","�x"}
            ,{"Z","�y"}
            ,{"a","��"},{"b","��"},{"c","��"},{"d","��"},{"e","��"}
            ,{"f","��"},{"g","��"},{"h","��"},{"i","��"},{"j","��"}
            ,{"k","��"},{"l","��"},{"m","��"},{"n","��"},{"o","��"}
            ,{"p","��"},{"q","��"},{"r","��"},{"s","��"},{"t","��"}
            ,{"u","��"},{"v","��"},{"w","��"},{"x","��"},{"y","��"}
            ,{"z","��"}
        };
    /**
     * ���p�p���L����S�p�p���L���ɕϊ�����
     * @param   String str  ������
     * @return  String �ϊ���̕�����
     */
    public static String eisukigoHanToZen(String str) {
        String zenstr = "";
        String chkstr = "";
        // str��1�����Â� eisukigouHanZenTbl�ƏƂ炵���킹�ĕϊ�����
        for (int i = 0; i < str.length(); i++) {
            chkstr = str.substring(i, i+1);
            for (int j = 0; j < eisukigoHanZenTbl.length; j++) {
                if (chkstr.equals(eisukigoHanZenTbl[j][0])) {
                    chkstr = eisukigoHanZenTbl[j][1];
                    break;
                }
            }
            zenstr = zenstr + chkstr;
        }
        return zenstr;
    }

    /**
     * �S�p�p���L���𔼊p�p���L���ɕϊ�����
     * @param   String str  ������
     * @return  String �ϊ���̕�����
     */
    public static String eisukigoZenToHan(String str) {
        String hanstr = "";
        String chkstr = "";
        // str��1�����Â� eisukigouHanZenTbl�ƏƂ炵���킹�ĕϊ�����
        for (int i = 0; i < str.length(); i++) {
            chkstr = str.substring(i, i+1);
            for (int j = 0; j < eisukigoHanZenTbl.length; j++) {
                if (chkstr.equals(eisukigoHanZenTbl[j][1])) {
                    chkstr = eisukigoHanZenTbl[j][0];
                    break;
                }
            }
            hanstr = hanstr + chkstr;
        }
        return hanstr;
    }
}

