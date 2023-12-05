/***********************************************************************
 * Module:  ThanhToan.java
 * Author:  admin
 * Purpose: Defines the Class ThanhToan
 ***********************************************************************/

import java.util.*;

/** @pdOid 6dca38b4-7661-4f40-972e-dd2a21a7bbb7 */
public class ThanhToan {
   /** @pdOid f5abafd0-5713-48a8-9243-b232c1cf9452 */
   private int iDDonHang;
   /** @pdOid 7fbda891-80e2-4b9a-b36a-03271f53d9a8 */
   private Date ngayDatHang;
   /** @pdOid 379ee6e4-89ee-4dd7-b354-894ae102a870 */
   private String chiTietDonHang;
   
   /** @pdRoleInfo migr=no name=HoaDon assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Aggregation */
   public java.util.Collection<HoaDon> hoaDon;
   
   /** @pdOid bef2ec81-287b-4b7e-b28d-3e167ebd1cf0 */
   public float soTienCuaDonHang() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 5b15053d-424f-45dc-a194-ec5420a150e4 */
   public void thanhToan() {
      // TODO: implement
   }
   
   /** @pdOid fa5b7cce-e7e6-49cf-8ea6-69e68d865e14 */
   public float soTienThua() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<HoaDon> getHoaDon() {
      if (hoaDon == null)
         hoaDon = new java.util.HashSet<HoaDon>();
      return hoaDon;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorHoaDon() {
      if (hoaDon == null)
         hoaDon = new java.util.HashSet<HoaDon>();
      return hoaDon.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newHoaDon */
   public void setHoaDon(java.util.Collection<HoaDon> newHoaDon) {
      removeAllHoaDon();
      for (java.util.Iterator iter = newHoaDon.iterator(); iter.hasNext();)
         addHoaDon((HoaDon)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newHoaDon */
   public void addHoaDon(HoaDon newHoaDon) {
      if (newHoaDon == null)
         return;
      if (this.hoaDon == null)
         this.hoaDon = new java.util.HashSet<HoaDon>();
      if (!this.hoaDon.contains(newHoaDon))
         this.hoaDon.add(newHoaDon);
   }
   
   /** @pdGenerated default remove
     * @param oldHoaDon */
   public void removeHoaDon(HoaDon oldHoaDon) {
      if (oldHoaDon == null)
         return;
      if (this.hoaDon != null)
         if (this.hoaDon.contains(oldHoaDon))
            this.hoaDon.remove(oldHoaDon);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllHoaDon() {
      if (hoaDon != null)
         hoaDon.clear();
   }

}