package reservation;

public class ReservationDTO {
   String user_name;
   String user_tel;
   String number;
   String store_name;
   String reservation_date;
   
   public ReservationDTO(String user_name, String user_tel,  String number, String store_name, String reservation_date) {
      super();
      this.user_name = user_name;
      this.user_tel = user_tel;
      this.number = number;
      this.store_name = store_name;
      this.reservation_date = reservation_date;
   }
   
   public String getUser_name() {
      return user_name;
   }
   public void setUser_name(String user_name) {
      this.user_name = user_name;
   }
   public String getUser_tel() {
      return user_tel;
   }
   public void setUser_tel(String user_tel) {
      this.user_tel = user_tel;
   }
   public String getNumber() {
      return number;
   }
   public void setNumber(String number) {
      this.number = number;
   }
   public String getStore_name() {
      return store_name;
   }
   public void setStore_name(String store_name) {
      this.store_name = store_name;
   }
   public String getReservation_date() {
      return reservation_date;
   }
   public void setReservation_date(String reservation_date) {
      this.reservation_date = reservation_date;
   }
   

}