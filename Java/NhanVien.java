/***********************************************************************
 * Module:  NhanVien.java
 * Author:  admin
 * Purpose: Defines the Class NhanVien
 ***********************************************************************/

import java.util.*;

/** @pdOid 26b4b30b-2a34-42fa-b4ff-f1d4e8464aed */
public class NhanVien {
   /** @pdOid d318b87f-1f68-4de8-9fc2-920908883ae6 */
   private String ten;
   /** @pdOid aedf0322-636c-4266-8d85-76507af479a5 */
   private String gioiTinh;
   /** @pdOid 4b79d082-07f6-418d-a04f-22ce4235d55c */
   private int id;
   /** @pdOid f03a4061-28bd-4e4d-a374-5654995abbdc */
   private String soDienThoai;
   /** @pdOid ba3284ad-e5e0-4910-a422-bb9ef79358ba */
   private String viTri;
   /** @pdOid 187363c8-6a13-4fec-ad58-1861ff6ef199 */
   private float luong;
   
   /** @pdRoleInfo migr=no name=QuayOrder assc=association3 mult=1 */
   public QuayOrder quayOrder;
   
   /** @pdOid 6b7d1d72-d208-450f-b74d-465e79e833b4 */
   public void capNhatLuong() {
      // TODO: implement
   }

}