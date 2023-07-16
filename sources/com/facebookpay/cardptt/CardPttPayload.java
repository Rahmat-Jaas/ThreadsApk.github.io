package com.facebookpay.cardptt;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C86104wH;
import com.fbpay.ptt.Sensitive;
import com.fbpay.ptt.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CardPttPayload {
    @SerializedName("app_id")
    public final String appId;
    @SerializedName("auth_ticket_type")
    public final String authTicketType;
    @SerializedName("caps")
    public List caps;
    @Sensitive
    @SerializedName("credit_card")
    public final String cardNumber;
    @SerializedName("credential_id")
    public final String credId;
    @Sensitive
    @SerializedName("csc")
    public final String csc;
    @SerializedName("device_id")
    public final String deviceId;
    @SerializedName("expiry_month")
    public final String expiryMonth;
    @SerializedName("expiry_year")
    public final String expiryYear;
    @SerializedName("first_name")
    public final String firstName;
    @SerializedName("last_name")
    public final String lastName;
    @SerializedName("public_key")
    public final String publicKey;

    public static /* synthetic */ CardPttPayload copy$default(CardPttPayload cardPttPayload, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardPttPayload.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = cardPttPayload.appId;
        }
        if ((i & 4) != 0) {
            str3 = cardPttPayload.firstName;
        }
        if ((i & 8) != 0) {
            str4 = cardPttPayload.lastName;
        }
        if ((i & 16) != 0) {
            str5 = cardPttPayload.cardNumber;
        }
        if ((i & 32) != 0) {
            str6 = cardPttPayload.csc;
        }
        if ((i & 64) != 0) {
            str7 = cardPttPayload.expiryMonth;
        }
        if ((i & 128) != 0) {
            str8 = cardPttPayload.expiryYear;
        }
        if ((i & 256) != 0) {
            str9 = cardPttPayload.publicKey;
        }
        if ((i & 512) != 0) {
            str10 = cardPttPayload.credId;
        }
        if ((i & 1024) != 0) {
            str11 = cardPttPayload.authTicketType;
        }
        if ((i & 2048) != 0) {
            list = cardPttPayload.caps;
        }
        return cardPttPayload.copy(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final String component10() {
        return this.credId;
    }

    public final String component11() {
        return this.authTicketType;
    }

    public final List component12() {
        return this.caps;
    }

    public final String component2() {
        return this.appId;
    }

    public final String component3() {
        return this.firstName;
    }

    public final String component4() {
        return this.lastName;
    }

    public final String component5() {
        return this.cardNumber;
    }

    public final String component6() {
        return this.csc;
    }

    public final String component7() {
        return this.expiryMonth;
    }

    public final String component8() {
        return this.expiryYear;
    }

    public final String component9() {
        return this.publicKey;
    }

    public final CardPttPayload copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list) {
        AnonymousClass0wJ.A1N(str, str2);
        String str12 = str5;
        String str13 = str6;
        C18190wL.A1S(str12, 4, str13);
        String str14 = str7;
        String str15 = str8;
        C86104wH.A1P(str14, 6, str15);
        return new CardPttPayload(str, str2, str3, str4, str12, str13, str14, str15, str9, str10, str11, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CardPttPayload) {
                CardPttPayload cardPttPayload = (CardPttPayload) obj;
                if (!C04220Ms.A0I(this.deviceId, cardPttPayload.deviceId) || !C04220Ms.A0I(this.appId, cardPttPayload.appId) || !C04220Ms.A0I(this.firstName, cardPttPayload.firstName) || !C04220Ms.A0I(this.lastName, cardPttPayload.lastName) || !C04220Ms.A0I(this.cardNumber, cardPttPayload.cardNumber) || !C04220Ms.A0I(this.csc, cardPttPayload.csc) || !C04220Ms.A0I(this.expiryMonth, cardPttPayload.expiryMonth) || !C04220Ms.A0I(this.expiryYear, cardPttPayload.expiryYear) || !C04220Ms.A0I(this.publicKey, cardPttPayload.publicKey) || !C04220Ms.A0I(this.credId, cardPttPayload.credId) || !C04220Ms.A0I(this.authTicketType, cardPttPayload.authTicketType) || !C04220Ms.A0I(this.caps, cardPttPayload.caps)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAuthTicketType() {
        return this.authTicketType;
    }

    public final List getCaps() {
        return this.caps;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCredId() {
        return this.credId;
    }

    public final String getCsc() {
        return this.csc;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    public final String getExpiryYear() {
        return this.expiryYear;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        int A03 = C18180wK.A03(this.deviceId);
        return ((((((AnonymousClass0wJ.A07(this.expiryYear, AnonymousClass0wJ.A07(this.expiryMonth, AnonymousClass0wJ.A07(this.csc, AnonymousClass0wJ.A07(this.cardNumber, (((AnonymousClass0wJ.A07(this.appId, A03) + AnonymousClass0wJ.A06(this.firstName)) * 31) + AnonymousClass0wJ.A06(this.lastName)) * 31)))) + AnonymousClass0wJ.A06(this.publicKey)) * 31) + AnonymousClass0wJ.A06(this.credId)) * 31) + AnonymousClass0wJ.A06(this.authTicketType)) * 31) + C18200wM.A07(this.caps);
    }

    public String toString() {
        StringBuilder A0s = C18190wL.A0s("CardPttPayload(deviceId=");
        A0s.append(this.deviceId);
        A0s.append(", appId=");
        A0s.append(this.appId);
        A0s.append(", firstName=");
        A0s.append(this.firstName);
        A0s.append(", lastName=");
        A0s.append(this.lastName);
        A0s.append(", cardNumber=");
        A0s.append(this.cardNumber);
        A0s.append(", csc=");
        A0s.append(this.csc);
        A0s.append(", expiryMonth=");
        A0s.append(this.expiryMonth);
        A0s.append(", expiryYear=");
        A0s.append(this.expiryYear);
        A0s.append(", publicKey=");
        A0s.append(this.publicKey);
        A0s.append(", credId=");
        A0s.append(this.credId);
        A0s.append(", authTicketType=");
        A0s.append(this.authTicketType);
        A0s.append(", caps=");
        return C86104wH.A0y(this.caps, A0s);
    }

    public CardPttPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list) {
        AnonymousClass0wJ.A1O(str, str2);
        C04220Ms.A0B(str5, 5);
        C18180wK.A1S(str6, str7, str8);
        this.deviceId = str;
        this.appId = str2;
        this.firstName = str3;
        this.lastName = str4;
        this.cardNumber = str5;
        this.csc = str6;
        this.expiryMonth = str7;
        this.expiryYear = str8;
        this.publicKey = str9;
        this.credId = str10;
        this.authTicketType = str11;
        this.caps = list;
    }

    public final void setCaps(List list) {
        this.caps = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardPttPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : list);
    }
}
