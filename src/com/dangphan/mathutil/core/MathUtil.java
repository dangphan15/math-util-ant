/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dangphan.mathutil.core;

// Ta sẽ mô phỏng/clone class Math của JDK
//Class của ta viết sẽ cung cấp các hàm/metho tiện ích dùng chung cho nhiều nơi khác nhau
//Thường cái gì mà là tiện ích/tool dùng cho các nơi thì nó sẽ được thiết kế là static
public class MathUtil {

    public static final double PI = 3.141592653589793;

    //hàm tiện ích dùng chung tính giai thừa!!!
    //Quy ước n!=1.2.3....n
    //ko tính được giai thừa âm
    //0!=1!=1
    //21! cực kì to, vượt 18 số 0 => tràn kiểu long
    //ta quy ước không tính 21! trở lên, vì tràn kiểu long
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        if (n == 0 || n == 1)
            return 1;
        
        //sống sót đến đây, sure, n chạy từ 2..20
        long product = 1; //khởi đầu của giai thừa là 1
                          //biến tích lũy/gửi góp/nhân dồn/con heo đất
                          //acc-accumulation
        for(int i = 2; i <= n; i++)
            product*=i;// product = product * i;
        
        return product;
    }

}

//KĨ THUẬT TDD - TEST DRIVEN DEVELOPMENT - DÀNH CHO DÂN DEVELOPER
//LÀ KĨ THUẬT LẬP TRÌNH/PHONG CÁCH LẬP TRÌNH MÀ KHI VIẾT CODE THÌ PHẢI
//VIẾT LUÔN CÁC BỘ KIỂM THỬ - TEST CASE ĐỂ KIỂM TRA NGAY KHI CODE CỦA
//MÌNH CHẠY ĐÚNG HAY SAI
//LÀ KĨ THUẬT LẬP TRÌNH VIẾT CODE SONG SONG VỚI VIẾT CÁC TEST CASE
//KĨ THUẬT NÀY GIÚP CODE LIÊN TỤC ĐƯỢC KIỂM TRA XEM MÀY CHẠY CÓ ĐÚNG 
//NHƯ KÌ VỌNG HAY KO?
//NẾU TA XÀI TDD, NÓ GIÚP TA ĐI VÀO QUY TRÌNH CI - CONTINUOUS INTEGRATION
//ĐỂ LÀM TDD TA:
//1. VIẾT PHÁC THẢO PROTOTYPE CỦA HÀM/METHOD/CLASS
//2. VIẾT CÁC BỘ KIỂM THỬ/TEST CASE LÀ CÁC ĐOẠN CODE BỔ SUNG THÊM
//   NHƯNG LÀ CODE ĐỂ XÀI CÁI HÀM VỪA VIẾT, ĐỂ CHECK XEM HÀM VỪA VIẾT
//   ỔN KO?
//3. CHẠY THỬ HÀM VỪA VIẾT VỚI BỘ TEST CASE VỪA TẠO, XEM TÌNH HÌNH
//   HÀM ĐÚNG SAI RA SAO? Sai -> refactor, sửa code
//                        Đúng-> hoàn thiện code khác
//          Liên tục
