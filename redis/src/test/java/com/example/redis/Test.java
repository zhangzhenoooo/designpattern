package com.example.redis;

import org.springframework.boot.test.context.SpringBootTest;

/**
 * Create by zhangz on 2021/1/12
 */
@SpringBootTest
public class Test {
    @org.junit.jupiter.api.Test
    public void  test(){
        String sql = "SELECT" +
                " id," +
                " mainid," +
                " assetnum," +
                " sapcode," +
                " companycode," +
                " companydesc," +
                " setaccountcode," +
                " setaccount," +
                " costcentercode," +
                " costcenter," +
                " mcompanycode," +
                " mcompanydesc," +
                " msetaccountcode," +
                " msetaccount," +
                " mcostcentercode," +
                " mcostcenter," +
                " usecompanycode," +
                " usecompanydesc," +
                " usesetaccountcode," +
                " usesetaccount," +
                " assetstatus," +
                " assettype," +
                " assettypedes," +
                " assetdesc," +
                " assetmodel," +
                " purchasedate," +
                " remark," +
                " usecostcentercode," +
                " usecostcenter," +
                " checkcharge," +
                " qty," +
                " purchaseprice," +
                " totaldp," +
                " usepeoplesign," +
                " dutypeoplesign," +
                " buildnum," +
                " floornum," +
                " buildunit," +
                " roomnum," +
                " statusvalue," +
                " zsbfyy," +
                " dpdate," +
                " afbnr," +
                " gtahr," +
                " ischeck," +
                " checkstatus," +
                " issupcheck," +
                " checknum," +
                " txbm1," +
                " txbm1_mc," +
                " txbm2," +
                " txbm2_mc," +
                " txbm3," +
                " txbm3_mc," +
                " xmbm," +
                " xmmc," +
                " ytusername," +
                " ytnickname," +
                " startcheckdate," +
                " remark1," +
                " ramark2," +
                " ramark3," +
                " serialnum," +
                " usepeople," +
                " ordertype" +
                " FROM" +
                " v_re_checkassetdetail " +
                " where 1=1 ";

        System.out.println("########################################");
        System.out.println(sql);

    }
}
