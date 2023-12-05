/***********************************************************************
 * Module:  QuayOrder.java
 * Author:  admin
 * Purpose: Defines the Class QuayOrder
 ***********************************************************************/

import java.util.*;

/** @pdOid 6d456f51-8220-4437-9003-a1572b210a32 */
public class QuayOrder {
   /** @pdRoleInfo migr=no name=ThanhToan assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<ThanhToan> thanhToan;
   /** @pdRoleInfo migr=no name=BanGhe assc=association7 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<BanGhe> banGhe;
   /** @pdRoleInfo migr=no name=ThucDon assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<ThucDon> thucDon;
   
   /** @pdOid 5818f900-8e82-4858-8200-b6420b0da318 */
   public void hienThiMenu() {
      // TODO: implement
   }
   
   /** @pdOid 347eb9d4-9298-4303-a481-b01e564ddb0a */
   public void goiMon() {
      // TODO: implement
   }
   
   /** @pdOid d79be080-d5e4-4c34-8def-0171fca92756 */
   public void xemBan() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<ThanhToan> getThanhToan() {
      if (thanhToan == null)
         thanhToan = new java.util.HashSet<ThanhToan>();
      return thanhToan;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorThanhToan() {
      if (thanhToan == null)
         thanhToan = new java.util.HashSet<ThanhToan>();
      return thanhToan.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newThanhToan */
   public void setThanhToan(java.util.Collection<ThanhToan> newThanhToan) {
      removeAllThanhToan();
      for (java.util.Iterator iter = newThanhToan.iterator(); iter.hasNext();)
         addThanhToan((ThanhToan)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newThanhToan */
   public void addThanhToan(ThanhToan newThanhToan) {
      if (newThanhToan == null)
         return;
      if (this.thanhToan == null)
         this.thanhToan = new java.util.HashSet<ThanhToan>();
      if (!this.thanhToan.contains(newThanhToan))
         this.thanhToan.add(newThanhToan);
   }
   
   /** @pdGenerated default remove
     * @param oldThanhToan */
   public void removeThanhToan(ThanhToan oldThanhToan) {
      if (oldThanhToan == null)
         return;
      if (this.thanhToan != null)
         if (this.thanhToan.contains(oldThanhToan))
            this.thanhToan.remove(oldThanhToan);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllThanhToan() {
      if (thanhToan != null)
         thanhToan.clear();
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
   /** @pdGenerated default getter */
   public java.util.Collection<ThucDon> getThucDon() {
      if (thucDon == null)
         thucDon = new java.util.HashSet<ThucDon>();
      return thucDon;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorThucDon() {
      if (thucDon == null)
         thucDon = new java.util.HashSet<ThucDon>();
      return thucDon.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newThucDon */
   public void setThucDon(java.util.Collection<ThucDon> newThucDon) {
      removeAllThucDon();
      for (java.util.Iterator iter = newThucDon.iterator(); iter.hasNext();)
         addThucDon((ThucDon)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newThucDon */
   public void addThucDon(ThucDon newThucDon) {
      if (newThucDon == null)
         return;
      if (this.thucDon == null)
         this.thucDon = new java.util.HashSet<ThucDon>();
      if (!this.thucDon.contains(newThucDon))
         this.thucDon.add(newThucDon);
   }
   
   /** @pdGenerated default remove
     * @param oldThucDon */
   public void removeThucDon(ThucDon oldThucDon) {
      if (oldThucDon == null)
         return;
      if (this.thucDon != null)
         if (this.thucDon.contains(oldThucDon))
            this.thucDon.remove(oldThucDon);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllThucDon() {
      if (thucDon != null)
         thucDon.clear();
   }

}