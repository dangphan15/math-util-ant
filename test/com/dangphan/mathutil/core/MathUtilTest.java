package com.dangphan.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ACER
 */
public class MathUtilTest {

    //kiểm thử tình huống cà chớn, đưa data vào cà chớn 
    //thì nhận về cú tát EXCEPTION
    //hàm getFactorial() đc thiết kế để:
    //- nếu đưa vào n tử tế 0..20 -> sure phải ra 1 con n! đúng đắn
    //- nếu đưa vào n cà chớn n < 0 || n > 20
    //CHỬI CHỬI VÀ CHỬI = NÉM RA EXCEPTION/
    // BÂY GIỜ, nếu tui đưa -5 cho hàm, tui nhận về gì??? ngoại lệ
    //thấy ngoại lệ mừng rơi nước mắt
    //THẤY NGOẠI LỆ NHƯ KÌ VỌNG Ở -5! -> VIẾT CODE ĐÚNG RỒI, MÀU XANH
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        
        //Test case #7
        //n = -5, -5!, hy vọng bị vả vào mặt cái EXCEPTION
                    // thực tế nó có vả mặt hay ko, đoán xem, chạy hàm đã
        //ko xài assertEquals() vì nó dùng cho các giá trị cụ thể
        //còn ngoại lệ là 1 thứ đo lường = cách mày có xuất hiện hay ko
        //mày ko là 1 giá trị kiểu 5 10 15 20
        MathUtil.getFactorial(-5); // ngoại lệ cầm chắc trong tay
        //nhưng phải đo/dòm xem mày có hiện nguyên hình hem????
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {

        //Test case #4
        //n = 3, 3!
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //Test case #5
        //n = 4, 4!
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        //Test case #6
        //n = 5, 5!
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }

    @Test
    public void tryAssertion() {
        Assert.assertEquals(100, 100);
    }

    @Test // quy tac dat ten ham kiem thu phai mang y nghia cua cac test
    //case minh muon test ham - CODING CONVENTION
    public void testFactorialGivenRightArgumentReturnsWell() {
        //Test case #1
        //n = 0, 0!
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        //phải so sánh 2 giá trị này !!! dung Framework, hok xì sout()
        Assert.assertEquals(expected, actual);
        //Vietsub: so sánh xem 0! có đúng là trả về 1 hay hem?

        //Test case #2
        //n = 1, 1!
        expected = 1;
        actual = MathUtil.getFactorial(1);
        Assert.assertEquals(expected, actual);

        //Test case #3
        //n = 2, 2!
        Assert.assertEquals(2, MathUtil.getFactorial(2));
    }
    
}

// TRONG CLASS NÀY CHỨA CÁI GÌ???
//CLASS NÀY CHỨA CÁC ĐOẠN CODE DÙNG ĐỂ TEST CODE CHÍNH Ở BÊN THƯ MỤC
//SOURCE PACKAGES
//CÁC ĐOẠN CODE Ở ĐÂY SẼ DÙNG ĐỂ TEST CÁI HÀM GETFACTORIAL() COI MÀY
//CHẠY CÓ ĐÚNG KO
//VIẾT CODE ĐỂ TEST CODE
// NHỮNG ĐOẠN CODE Ở TTRONG NÀY DO DEVELOPER VIẾT RA DÙNG ĐỂ TEST CHÍNH
//CÁI CODE Ở BÊN THƯ MỤC SOURCE PACKAGES ĐỂ ĐẢM BẢO RẰNG HÀM/CLASS VIẾT RA
//PHẢI CHẠY ĐÚNG
//ĐOẠN CODE DÙNG ĐỂ TEST CODE THÙ ĐC GỌI LÀ TEST TEST SCRIPT
//CÁC TEST SCRIPT NÀY SẼ CÓ LỆNH CƠ BẢN: SO SÁNH GIỮA EXPECTED VÀ ACTUAL
//NHƯ BÊN HÀM MAIN() ĐÃ LÀM THỬ!!!
//NHỮNG ĐOẠN CODE NÀY KO DUNG LỆNH SOUT() TRUYỀN THỐNG MÀ DÙNG NHỮNG
//THƯ VIỆN ĐẶC BIỆT ĐỂ
//-Khi hàm sai, khi expected ko giống như actual,thì nó sẽ NÉM RA MÀU ĐỎ
//-khi hàm đúng, tức là expected == actual, thì nó NÉM RA MÀU XANH
//-Các thư viện giúp thảy ra màu xanh đỏ, tự so sánh giùm expected
//và actual để kết luận hàm đúng sai, mắt lúc này chỉ cần nhìn đúng 2 màu
//xanh đỏ, ko xần xem chi tiết các dòng so sánh bên main()
//BỘ THƯ VIỆN NÀY CÒN GỌI LÀ UNIT TEST FRAMEWORK
//MỖI NGÔN NGỮ LẬP TRÌNH ĐỀU CÓ VÀI BỘ THƯ VIỆN ĐỂ TEST CODE CỦA RIÊNG NGÔN 
//NGỮ ĐÓ
//VD:
//JAVA, JUNIT
//C#: XUNIT, NUNIT,MSTEST
//PHP: PHPUNIT
//JAVASCRIPT
//PYTHON
//@Test DC GOI LA 1 FLAG/CỜ ĐÁNH DẤU - ANNOTATION
//BÁO HIỆU CHO THƯ VIỆN JUNIT BIẾT CẦN GENERATE HÀM ĐI KÈM @Test
//BIẾN HÀM NÀY THÀNH HÀM MAIN() VÀ GỬI MAIN() NÀY CHO JVM - JAVA
//VIRTUAL MACHINE BIẾT ĐỂ CHẠY, KHI CHẠY THÌ SO SÁNH 2 ĐỨA
//EXPECTED VÀ ACTUAL, COI NẾU CHÚNG == NHAU, THẢY MÀU XANH
//              NẾU CHÚNG != NHAU, THẢY MÀU ĐỎ
//NẾU KO CÓ @Test, CHẢ CÓ HÀM MAIN() ĐC GENERATE NO RUNABLE TEST method
//VIỆC XÀI THƯ VIỆN BỊ ÉP PHẢI LÀ TRONG KHUÔN KHỔ HAY THEO QUY TẮC NÀO ĐÓ GỌI LÀ FRAMEWORK

//CHỐT DEAL XANH ĐỎ
//NẾU VIỆC CHẠY BỘ TEST CASE RA MÀU XANH, KHI VÀ CHỈ KHI TẤT CẢ ĐỀU XANH
//XANH: KHI TẤT CẢ TEST CASE CÙNG XANH
//XANH: KHI TẤT CẢ CÁC VIỆC SO SÁNH EXPECTED ĐỀU == ACTUAL

//ĐỎ: CHỈ CẦN 1 THẰNG TRONG ĐÁM TEST CASE MÀU ĐỎ, TẤT CẢ MÀU ĐỎ
//ĐỎ: CHỈ CẦN 1 VIỆC SO SÁNH EXPECTED != ACTUAL XUẤT HIỆN, MÀU ĐỎ FOR ALL

//LOGIC: HÀM NẾU ĐÃ ĐÚNG, THÌ PHẢI ĐÚNG VỚI TẤT CẢ CÁC CASE ĐẪ ĐC LIỆT KÊ RA
//HÀM NGON VỚI CÁC CASE ĐÃ TEST
//CỐ GẮNG LIỆT KÊ ĐC ĐỦ CASE LÀ TỐT NHẤT!!!
//NGUYÊN LÝ SỐ 2

//CHỐT DEAL 2:
//KHI RA MÀU XANH TỔNG, HÀM ỔN VỚI CÁC TEST CASE
//KHI RA MÀU ĐỎ, NGHĨA LÀ CÓ ÍT NHẤT 1 VIỆC SP SÁNH EXPECTED != ACTUAL
//MÀU ĐỎ VÌ LÍ DO GÌ PHÍA SAU
//- DO ACTUAL TRẢ VỀ KHÔNG ĐÚNG NHƯ KÌ VỌNG -> BUG
//- DO EXPECTED TÍNH TOÁN KO ĐÚNG LUÔN!!! QC BỊ NGÁO