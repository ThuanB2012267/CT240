/***********************************************************************
 * Module:  ThucDon.java
 * Author:  admin
 * Purpose: Defines the Class ThucDon
 ***********************************************************************/

import java.util.*;

/** @pdOid ff3ec2bd-5cf5-4f14-ad5c-aa8bd6e1299f */
public class ThucDon {
   /** @pdOid 29a70665-ef98-4dd8-9d0e-9946e2cd84fd */
   private int iDMonAn;
   /** @pdOid ef04d6b7-9f39-4b80-9f39-ae5a49b2157d */
   private String tenMon;
   /** @pdOid 07975755-3f43-428b-b4dd-0b0c8819991f */
   private float gia;
   /** @pdOid bd7016ed-3bfb-43cb-813a-a8951c6247eb */
   private int soLuong;
   
   /** @pdRoleInfo migr=no name=BanGhe assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<BanGhe> banGhe;
   
   /** @pdOid 01bb0187-fec2-4af6-90bd-443723266ab6 */
   public void themVaoHoaDon() {
      // TODO: implement
   }
   
   /** @pdOid 2f036b5f-4f72-47eb-af19-b222a82fea9c */
   public void xoaKhoiHoaDon() {
      // TODO: implement
   }
   
   /** @pdOid 002224b5-94d6-48f3-87f5-9d19221d9ebe */
   public void themMonAn() {
      // TODO: implement
   }
   
   /** @pdOid 75af70cc-dcd0-4419-bad7-5929bf8b723f */
   public void xoaMonAn() {
      // TODO: implement
   }
   
   /** @pdOid a5ee9db9-b4cd-4531-a92c-c64992720084 */
   public void chinhSuaMonAn() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<BanGhe> getBanGhe() {
      if (banGhe == null)
         banGhe = new java.util.HashSet<BanGhe>();
      return banGhe;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBanGhe() {
      if (banGhe == null)
         banGhe = new java.util.HashSet<BanGhe>();
      return banGhe.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBanGhe */
   public void setBanGhe(java.util.Collection<BanGhe> newBanGhe) {
      removeAllBanGhe();
      for (java.util.Iterator iter = newBanGhe.iterator(); iter.hasNext();)
         addBanGhe((BanGhe)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBanGhe */
   public void addBanGhe(BanGhe newBanGhe) {
      if (newBanGhe == null)
         return;
      if (this.banGhe == null)
         this.banGhe = new java.util.HashSet<BanGhe>();
      if (!this.banGhe.contains(newBanGhe))
         this.banGhe.add(newBanGhe);
   }
   
   /** @pdGenerated default remove
     * @param oldBanGhe */
   public void removeBanGhe(BanGhe oldBanGhe) {
      if (oldBanGhe == null)
         return;
      if (this.banGhe != null)
         if (this.banGhe.contains(oldBanGhe))
            this.banGhe.remove(oldBanGhe);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBanGhe() {
      if (banGhe != null)
         banGhe.clear();
   }

}