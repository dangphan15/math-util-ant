package com.dangphan.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.dangphan.mathutil.core.MathUtil.*;

/**
 *
 * @author ACER
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    // chuẩn bị data, mảng 2 chiều vì nó có n đưa vào và expected [2]
    // và nhiều cặp như thế [7]
    // mảng 2 chiều[7][2]
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20, 25};
        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
        int c[][] = {{1, 0},
                     {1, 1},
                     {2, 2},
                     {6, 3},
                     {24, 4},
                     {120, 5},
                     {720, 6}
                    };
        return new Integer[][] {{1, 0},
                                {1, 1},
                                {2, 2},
                                {6, 3},
                                {24, 4},
                                {120, 5},
                                {720, 6}
                                };
    }
    
    //sau khi co bo data qua mang 2 chieu, JUnit se tu lap for
    //de loi ra tung cap data
    //nhoi cap nay vao trong ham o sanh...
    //nhung nhoi = cach nao, gan value nay vao bien nao do
    //gan vao bien - THAM SO HOA PARAMETERIZED
    //TA SE MAP/ANH XA 2 COT UNG VOI 2 BIEN: COT 0 - EXPECTED
    //                                       COT 1 - N DUA VAO HAM GETF()
    
    @Parameterized.Parameter(value = 0)
    public long expected;
    
    @Parameterized.Parameter(value = 1)
    public int n;
    
    //test hoy da co cac test case va data
    @Test
    public void testFacorialGivenRightArgumentRetunWell(){
        assertEquals(expected, getFactorial(n));
        
    }
}
// CLASS NÀY SẼ CHỨA CODE DÙNG ĐỂ TEST CODE CHÍNH Ở BÊN CLASS MATHUTIL
// CLASS NÀY SẼ CHỨA CODE DÙNG ĐỂ TEST HAMG getF() COI HÀM CHẠY ĐÚNG KO?
// CODE VIẾT RA DÙNG ĐỂ TEST CODE KHÁC (HÀM KHÁC/CLASS KHÁC)
// THÌ ĐOẠN CODE NÀY, CLASS NÀY GỌI LÀ: TEST SCRIPT
// TRONG TEST SCRIPT SẼ CÓ NHỮNG TÌNH HUỐNG XÀI APP, ĐƯA DATA CỤ THỂ VÀO
// CHỜ XEM HÀM XỬ LÍ KẾT QUẢ CÓ NHƯ KỲ VỌNG HAY KO?
// MỘT TEST SCRIPT SẼ CHỨA NHIỀU TEST CASES 
//                          MỖI TEST CASE ỨNG VỚI 1 TÌNH HUỐNG XÀI HÀM

// PHÂN TÍCH TEST SCRIPT CŨ - HÔM QUA KIA
// TRONG TEST SCRIPT CŨ XUẤT HIỆN BAD SMELL, SỰ TRÙN LẶP VỀ CÂU LỆNH DƯỚI ĐÂY
// Assert.assertEquals(120, MathUtil.getFactorial(5));
// LỆNH SO SÁNH GIÁ TRỊ, LỆNH GỌI HÀM ĐC LẶP ĐI LẶP LẠI VỚI MỖI BỘ TEST
// CŨNG HÀM NÀY NHƯNG VIẾT LẠI CHO CÁC BỘ DATA SAU:
// NẾU TA TÁCH ĐC TOÀN BỘ DATA TRONG CÁC CÂU LỆNH SO SÁNH Ở TRÊN
// RA 1 CHỖ RIÊNG BIỆT NHƯ HÀNG CỘT Ở TRÊN, SAU ĐÓ
// TA CHỈ VIỆC PICK/LẤY/TỈA DATA NÀY NẠP DẦN VÀO/NHỒI DẦN VÀO CÁI LỆNH 
// GỌI HÀM, THÌ TA SẼ ĐẠT ĐC:
// - CODE GỌN GÀNG HƠN KO BỊ TRÙNG LẶP
// - NHÌN TỔNG QUÁT BIẾT CÓ BN TEST CASE VÀ LIỆU RẰNG CHÚNG ĐÃ ĐỦ HAY CHƯA?
// KĨ THUẬT VIẾT TEST SCRIPT(CÂU LỆNH TEST) MÀ TÁCH BIỆT DATA RA KHỎI LỆNH 
// SO SÁNH ĐC GỌI = NHỮNG TÊN SAU:
// - PARAMETERIZED - THAM SỐ HÓA, BIẾN DATA RA 1 CHỖ, ĐẶT CHO CHÚNG CÁI TÊN 
// BIẾN, LÁT HỒI NHỒI CHÚNG TRỞ LẠI LỆNH SO SÁNH
// - DDT - DATA DRIVEN TESTING: VIẾT CODE KIỂM THỬ THEO STYLE TÁCH DATA 
// junit fw hỗ trợ sẵn ta vụ tách data, duyệt vòng for trên data
// nhồi vào hàm tương ứng
// để chơi với ddt, ta cần
// - tách data ra 1 chỗ
// - map cái data này vào các biến tương ứng
// - nhồi cái biến tương ứng này vào câu lệnh so sánh/ gọi hàm
