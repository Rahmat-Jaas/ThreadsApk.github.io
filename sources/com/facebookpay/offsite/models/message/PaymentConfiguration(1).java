package com.facebookpay.offsite.models.message;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import java.util.Set;

public final class PaymentConfiguration {
    @SerializedName("acquirerCountryCode")
    public final String acquirerCountryCode;
    @SerializedName("containerContext")
    public final String containerContext;
    @SerializedName("eventId")
    public final String eventId;
    @SerializedName("merchantName")
    public final String merchantName;
    @SerializedName("mode")
    public final PaymentMode mode;
    @SerializedName("partnerId")
    public final String partnerId;
    @SerializedName("partnerMerchantId")
    public final String partnerMerchantId;
    @SerializedName("pixelId")
    public final String pixelId;
    @SerializedName("requestId")
    public final String requestId;
    @SerializedName("sessionUsage")
    public final SessionUsageType sessionUsage;
    @SerializedName("shopName")
    public final String shopName;
    @SerializedName("supportedContainers")
    public final Map<PaymentContainerType, Object> supportedContainers;
    @SerializedName("uxFlags")
    public final Set<PaymentUXFlags> uxFlags;

    public final PaymentConfiguration createCopy(String str, String str2, String str3, Map map, PaymentMode paymentMode, String str4, String str5, String str6, String str7, Set set, SessionUsageType sessionUsageType, String str8, String str9) {
        String str10 = str2;
        AnonymousClass0wJ.A1N(str, str10);
        String str11 = str3;
        Map map2 = map;
        AnonymousClass0wJ.A1Q(str11, map2);
        String str12 = str7;
        C04220Ms.A0B(str12, 8);
        return new PaymentConfiguration(str, str10, str11, map2, paymentMode, str4, str5, str6, str12, set, sessionUsageType, str8, str9);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PaymentConfiguration(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.util.Map r7, com.facebookpay.offsite.models.message.PaymentMode r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.Set r13, com.facebookpay.offsite.models.message.SessionUsageType r14, java.lang.String r15, java.lang.String r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r3 = this;
            r2 = r17
            r0 = r2 & 128(0x80, float:1.794E-43)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            r11 = r1
        L_0x0008:
            r0 = r2 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x000d
            r13 = r1
        L_0x000d:
            r0 = r2 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0012
            r14 = r1
        L_0x0012:
            r0 = r2 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0017
            r15 = r1
        L_0x0017:
            r0 = r2 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x001d
            r16 = r1
        L_0x001d:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.models.message.PaymentConfiguration.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.Map, com.facebookpay.offsite.models.message.PaymentMode, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Set, com.facebookpay.offsite.models.message.SessionUsageType, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ PaymentConfiguration createCopy$default(PaymentConfiguration paymentConfiguration, String str, String str2, String str3, Map<PaymentContainerType, Object> map, PaymentMode paymentMode, String str4, String str5, String str6, String str7, Set<PaymentUXFlags> set, SessionUsageType sessionUsageType, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentConfiguration.requestId;
        }
        if ((i & 2) != 0) {
            str2 = paymentConfiguration.partnerId;
        }
        if ((i & 4) != 0) {
            str3 = paymentConfiguration.partnerMerchantId;
        }
        if ((i & 8) != 0) {
            map = paymentConfiguration.supportedContainers;
        }
        if ((i & 16) != 0) {
            paymentMode = paymentConfiguration.mode;
        }
        if ((i & 32) != 0) {
            str4 = paymentConfiguration.shopName;
        }
        if ((i & 64) != 0) {
            str5 = paymentConfiguration.acquirerCountryCode;
        }
        if ((i & 128) != 0) {
            str6 = paymentConfiguration.merchantName;
        }
        if ((i & 256) != 0) {
            str7 = paymentConfiguration.containerContext;
        }
        if ((i & 512) != 0) {
            set = paymentConfiguration.uxFlags;
        }
        if ((i & 1024) != 0) {
            sessionUsageType = paymentConfiguration.sessionUsage;
        }
        if ((i & 2048) != 0) {
            str8 = paymentConfiguration.eventId;
        }
        if ((i & 4096) != 0) {
            str9 = paymentConfiguration.pixelId;
        }
        return paymentConfiguration.createCopy(str, str2, str3, map, paymentMode, str4, str5, str6, str7, set, sessionUsageType, str8, str9);
    }

    public final String getAcquirerCountryCode() {
        return this.acquirerCountryCode;
    }

    public final String getContainerContext() {
        return this.containerContext;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final PaymentMode getMode() {
        return this.mode;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final String getPartnerMerchantId() {
        return this.partnerMerchantId;
    }

    public final String getPixelId() {
        return this.pixelId;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final SessionUsageType getSessionUsage() {
        return this.sessionUsage;
    }

    public final String getShopName() {
        return this.shopName;
    }

    public final Map getSupportedContainers() {
        return this.supportedContainers;
    }

    public final Set getUxFlags() {
        return this.uxFlags;
    }

    public PaymentConfiguration(String str, String str2, String str3, Map map, PaymentMode paymentMode, String str4, String str5, String str6, String str7, Set set, SessionUsageType sessionUsageType, String str8, String str9) {
        AnonymousClass0wJ.A1O(str, str2);
        AnonymousClass0wJ.A1R(str3, map);
        C04220Ms.A0B(str7, 9);
        this.requestId = str;
        this.partnerId = str2;
        this.partnerMerchantId = str3;
        this.supportedContainers = map;
        this.mode = paymentMode;
        this.shopName = str4;
        this.acquirerCountryCode = str5;
        this.merchantName = str6;
        this.containerContext = str7;
        this.uxFlags = set;
        this.sessionUsage = sessionUsageType;
        this.eventId = str8;
        this.pixelId = str9;
    }
}
