/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dangphan.mathutil.main;

import com.dangphan.mathutil.core.MathUtil;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This message comes from main() method");
        System.out.println("This far file is built based on ANT co-operating with JUnit");
        tryTDDFirst();
    }
    //hàm này dùng để demo/ minh họa cách TDD đc triển khai thế nào
    // viết code song song với viết test
    //Test        Driven      Development
    //kiểm thử    hướng về   viết code
    public static void tryTDDFirst(){
        
        //Test case #1: (tình huống xài hàm số #1)
        //input n = 0; ta muốn thử tính 0! coi hàm chạy ra sao
        //expected = 1; // ta muốn 0! hàm phải trả về 1 !!!
        // thực tế actual = ? mấy, chạy thử hàm mới biết đc
        long expected = 1;// mình muốn 0! phải trả về 1
        long actual = MathUtil.getFactorial(0);
        //kiểm thử pm là so sánh giữa expected và actual để luận đúng sai
        System.out.println("0! Status | expected: " + expected +
                                       " | actual:" + actual);
        //Test case #2
        //kiểm tra hàm có chạy đúng với 2!, hy vọng nhận về số 2
        //input n = 2;
        //gọi hàm getFactorial(2)
        //excepted nhận về phải là 2
        // thực tế là mấy ??? chạy mới biết
        System.out.println("2! Status | expected: 2" +
                                       " | actual:" + MathUtil.getFactorial(2));
        
        //Test case #3:
        // n = 5, 5! hy vọng trả về 120
        System.out.println("5! Status | expected: 120" +
                                       " | actual:" + MathUtil.getFactorial(5));
        
        //Test case #4
//        // n = -5, -5 hy vọng bị đập vào mặt câu, CÀ CHỚN, N KO HỢP LỆ  
//        System.out.println("-5! Status | expected: NGOẠI LỆ XUẤT HIỆN" +
//                                       " | actual:" + MathUtil.getFactorial(-5));
//
//        System.out.println("-5! Status | expected: NGOẠI LỆ XUẤT HIỆN" +
//                                       " | actual:"); 
//        MathUtil.getFactorial(-5);
    }
}

// tổng kết:
// TEST CASE LÀ GÌ ??? TÌNH HUỐNG KIỂM THỬ
// LÀ NHỮNG TÌNH HUỐNG XÀI APP/ KIỂM THỬ APP XEM APP CHẠY ĐÚNG HAY KO
// TEST CASE BAO GỒM 
//- DATA ĐƯA VÀO HÀM/ APP, VÍ DỤ 5 ĐƯA VÀO HÀM GIAI THỪA
//- GỌI HÀM ĐỂ XỬ LÍ DATA ĐƯA VÀO, GETFACTORIAL(5)
//- GIÁ TRỊ KÌ VỌNG HÀM SẼ TRẢ VỀ EXPECTED VALUE == 120???
//- STATUS: HÀM CHẠY ĐÚNG HAY SAI

// MỘT TEST CASE LÀ 1 TÌNH HUỐNG XÀI APP/KIỂM THỬ APP ĐÚNG HAY SAI SO VỚI 
// KÌ VỌNG KHI TA ĐƯA DATA CỤ THỂ NÀO ĐÓ VÀO APP/VÀO HÀM