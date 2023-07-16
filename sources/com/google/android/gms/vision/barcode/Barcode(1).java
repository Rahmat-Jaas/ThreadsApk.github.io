package com.google.android.gms.vision.barcode;

import X.C122167Ky;
import X.C86134wK;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Barcode extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(41);
    public int A00;
    public int A01;
    public CalendarEvent A02;
    public ContactInfo A03;
    public DriverLicense A04;
    public Email A05;
    public GeoPoint A06;
    public Phone A07;
    public Sms A08;
    public UrlBookmark A09;
    public WiFi A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public byte[] A0E;
    public Point[] A0F;

    public class Address extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C86134wK.A0R(40);
        public int A00;
        public String[] A01;

        public Address(int i, String[] strArr) {
            this.A00 = i;
            this.A01 = strArr;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C122167Ky.A00(parcel);
            C122167Ky.A08(parcel, 2, this.A00);
            C122167Ky.A0N(parcel, this.A01, 3);
            C122167Ky.A05(parcel, A002);
        }

        public Address() {
        }
    }

    public class CalendarDateTime extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C86134wK.A0R(42);
        public int A00;
        public int A01;
        public int A02;
        public int A03;
        public int A04;
        public int A05;
        public String A06;
        public boolean A07;

        public CalendarDateTime(String str, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
            this.A05 = i;
            this.A03 = i2;
            this.A00 = i3;
            this.A01 = i4;
            this.A02 = i5;
            this.A04 = i6;
            this.A07 = z;
            this.A06 = str;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C122167Ky.A00(parcel);
            C122167Ky.A08(parcel, 2, this.A05);
            C122167Ky.A08(parcel, 3, this.A03);
            C122167Ky.A08(parcel, 4, this.A00);
            C122167Ky.A08(parcel, 5, this.A01);
            C122167Ky.A08(parcel, 6, this.A02);
            C122167Ky.A08(parcel, 7, this.A04);
            C122167Ky.A0B(parcel, 8, this.A07);
            C122167Ky.A0H(parcel, this.A06, 9, false);
            C122167Ky.A05(parcel, A002);
        }

        public CalendarDateTime() {
        }
    }

    public class CalendarEvent extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C86134wK.A0R(44);
        public CalendarDateTime A00;
        public CalendarDateTime A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public String A06;

        public CalendarEvent(CalendarDateTime calendarDateTime, CalendarDateTime calendarDateTime2, String str, String str2, String str3, String str4, String str5) {
            this.A06 = str;
            this.A02 = str2;
            this.A03 = str3;
            this.A04 = str4;
            this.A05 = str5;
            this.A01 = calendarDateTime;
            this.A00 = calendarDateTime2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C122167Ky.A00(parcel);
            boolean A0S = C122167Ky.A0S(parcel, this.A06);
            C122167Ky.A0H(parcel, this.A02, 3, A0S);
            C122167Ky.A0H(parcel, this.A03, 4, A0S);
            C122167Ky.A0H(parcel, this.A04, 5, A0S);
            C122167Ky.A0H(parcel, this.A05, 6, A0S);
            C122167Ky.A0D(parcel, this.A01, 7, i, A0S);
            C122167Ky.A0D(parcel, this.A00, 8, i, A0S);
            C122167Ky.A05(parcel, A002);
        }

        public CalendarEvent() {
        }
    }

    public class ContactInfo extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C86134wK.A0R(43);
        public PersonName A00;
        public String A01;
        public String A02;
        public Address[] A03;
        public Email[] A04;
        public Phone[] A05;
        public String[] A06;

        public ContactInfo(PersonName personName, String str, String str2, Address[] addressArr, Email[] emailArr, Phone[] phoneArr, String[] strArr) {
            this.A00 = personName;
            this.A01 = str;
            this.A02 = str2;
            this.A05 = phoneArr;
            this.A04 = emailArr;
            this.A06 = strArr;
            this.A03 = addressArr;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C122167Ky.A00(parcel);
            boolean A0Q = C122167Ky.A0Q(parcel, this.A00, i);
            C122167Ky.A0H(parcel, this.A01, 3, A0Q);
            C122167Ky.A0H(parcel, this.A02, 4, A0Q);
            C122167Ky.A0M(parcel, this.A05, 5, i);
            C122167Ky.A0M(parcel, this.A04, 6, i);
            C122167Ky.A0N(parcel, this.A06, 7);
            C122167Ky.A0M(parcel, this.A03, 8, i);
            C122167Ky.A05(parcel, A002);
        }

        public ContactInfo() {
        }
    }

    public class DriverLicense extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C86134wK.A0R(46);
        public String A00;
        public String A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public String A06;
        public String A07;
        public String A08;
        public String A09;
        public String A0A;
        public String A0B;
        public String A0C;
        public String A0D;

        public DriverLicense(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.A05 = str;
            this.A07 = str2;
            this.A0D = str3;
            this.A0B = str4;
            this.A08 = str5;
            this.A02 = str6;
            this.A00 = str7;
            this.A01 = str8;
            this.A03 = str9;
            this.A0C = str10;
            this.A09 = str11;
            this.A06 = str12;
            this.A04 = str13;
            this.A0A = str14;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C122167Ky.A00(parcel);
            boolean A0S = C122167Ky.A0S(parcel, this.A05);
            C122167Ky.A0H(parcel, this.A07, 3, A0S);
            C122167Ky.A0H(parcel, this.A0D, 4, A0S);
            C122167Ky.A0H(parcel, this.A0B, 5, A0S);
            C122167Ky.A0H(parcel, this.A08, 6, A0S);
            C122167Ky.A0H(parcel, this.A02, 7, A0S);
            C122167Ky.A0H(parcel, this.A00, 8, A0S);
            C122167Ky.A0H(parcel, this.A01, 9, A0S);
            C122167Ky.A0H(parcel, this.A03, 10, A0S);
            C122167Ky.A0H(parcel, this.A0C, 11, A0S);
            C122167Ky.A0H(parcel, this.A09, 12, A0S);
            C122167Ky.A0H(parcel, this.A06, 13, A0S);
            C122167Ky.A0H(parcel, this.A04, 14, A0S);
            C122167Ky.A0H(parcel, this.A0A, 15, A0S);
            C122167Ky.A05(parcel, A002);
        }

        public DriverLicense() {
        }
    }

    public class Email extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C86134wK.A0R(45);
        public int A00;
        public String A01;
        public String A02;
        public String A03;

        public Email(int i, String str, String str2, String str3) {
            this.A00 = i;
            this.A01 = str;
            this.A03 = str2;
            this.A02 = str3;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C122167Ky.A00(parcel);
            C122167Ky.A08(parcel, 2, this.A00);
            C122167Ky.A0H(parcel, this.A01, 3, false);
            C122167Ky.A0H(parcel, this.A03, 4, false);
            C122167Ky.A0H(parcel, this.A02, 5, false);
            C122167Ky.A05(parcel, A002);
        }

        public Email() {
        }
    }

    public class GeoPoint extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C86134wK.A0R(48);
        public double A00;
        public double A01;

        public GeoPoint(double d, double d2) {
            this.A00 = d;
            this.A01 = d2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C122167Ky.A00(parcel);
            double d = this.A00;
            parcel.writeInt(524290);
            parcel.writeDouble(d);
            double d2 = this.A01;
            parcel.writeInt(524291);
            parcel.writeDouble(d2);
            C122167Ky.A05(parcel, A002);
        }

        public GeoPoint() {
        }
    }

    public class PersonName extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C86134wK.A0R(47);
        public String A00;
        public String A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public String A06;

        public PersonName(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.A01 = str;
            this.A05 = str2;
            this.A04 = str3;
            this.A00 = str4;
            this.A03 = str5;
            this.A02 = str6;
            this.A06 = str7;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C122167Ky.A00(parcel);
            boolean A0S = C122167Ky.A0S(parcel, this.A01);
            C122167Ky.A0H(parcel, this.A05, 3, A0S);
            C122167Ky.A0H(parcel, this.A04, 4, A0S);
            C122167Ky.A0H(parcel, this.A00, 5, A0S);
            C122167Ky.A0H(parcel, this.A03, 6, A0S);
            C122167Ky.A0H(parcel, this.A02, 7, A0S);
            C122167Ky.A0H(parcel, this.A06, 8, A0S);
            C122167Ky.A05(parcel, A002);
        }

        public PersonName() {
        }
    }

    public class Phone extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C86134wK.A0R(50);
        public int A00;
        public String A01;

        public Phone(int i, String str) {
            this.A00 = i;
            this.A01 = str;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C122167Ky.A00(parcel);
            C122167Ky.A08(parcel, 2, this.A00);
            C122167Ky.A0H(parcel, this.A01, 3, false);
            C122167Ky.A05(parcel, A002);
        }

        public Phone() {
        }
    }

    public class Sms extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C86134wK.A0R(49);
        public String A00;
        public String A01;

        public Sms(String str, String str2) {
            this.A00 = str;
            this.A01 = str2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C122167Ky.A0F(parcel, this.A01, C122167Ky.A00(parcel), C122167Ky.A0S(parcel, this.A00));
        }

        public Sms() {
        }
    }

    public class UrlBookmark extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C86134wK.A0R(52);
        public String A00;
        public String A01;

        public UrlBookmark(String str, String str2) {
            this.A00 = str;
            this.A01 = str2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C122167Ky.A0F(parcel, this.A01, C122167Ky.A00(parcel), C122167Ky.A0S(parcel, this.A00));
        }

        public UrlBookmark() {
        }
    }

    public class WiFi extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C86134wK.A0R(51);
        public int A00;
        public String A01;
        public String A02;

        public WiFi(String str, String str2, int i) {
            this.A02 = str;
            this.A01 = str2;
            this.A00 = i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C122167Ky.A00(parcel);
            C122167Ky.A0H(parcel, this.A01, 3, C122167Ky.A0S(parcel, this.A02));
            C122167Ky.A08(parcel, 4, this.A00);
            C122167Ky.A05(parcel, A002);
        }

        public WiFi() {
        }
    }

    public Barcode(CalendarEvent calendarEvent, ContactInfo contactInfo, DriverLicense driverLicense, Email email, GeoPoint geoPoint, Phone phone, Sms sms, UrlBookmark urlBookmark, WiFi wiFi, String str, String str2, byte[] bArr, Point[] pointArr, int i, int i2, boolean z) {
        this.A00 = i;
        this.A0C = str;
        this.A0E = bArr;
        this.A0B = str2;
        this.A01 = i2;
        this.A0F = pointArr;
        this.A0D = z;
        this.A05 = email;
        this.A07 = phone;
        this.A08 = sms;
        this.A0A = wiFi;
        this.A09 = urlBookmark;
        this.A06 = geoPoint;
        this.A02 = calendarEvent;
        this.A03 = contactInfo;
        this.A04 = driverLicense;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 2, this.A00);
        C122167Ky.A0H(parcel, this.A0C, 3, false);
        C122167Ky.A0H(parcel, this.A0B, 4, false);
        C122167Ky.A08(parcel, 5, this.A01);
        C122167Ky.A0M(parcel, this.A0F, 6, i);
        C122167Ky.A0D(parcel, this.A05, 7, i, false);
        C122167Ky.A0D(parcel, this.A07, 8, i, false);
        C122167Ky.A0D(parcel, this.A08, 9, i, false);
        C122167Ky.A0D(parcel, this.A0A, 10, i, false);
        C122167Ky.A0D(parcel, this.A09, 11, i, false);
        C122167Ky.A0D(parcel, this.A06, 12, i, false);
        C122167Ky.A0D(parcel, this.A02, 13, i, false);
        C122167Ky.A0D(parcel, this.A03, 14, i, false);
        C122167Ky.A0D(parcel, this.A04, 15, i, false);
        C122167Ky.A0L(parcel, this.A0E, 16, false);
        C122167Ky.A0B(parcel, 17, this.A0D);
        C122167Ky.A05(parcel, A002);
    }

    public Barcode() {
    }
}
