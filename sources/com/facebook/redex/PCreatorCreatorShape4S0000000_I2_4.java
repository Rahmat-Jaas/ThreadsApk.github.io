package com.facebook.redex;

import android.os.Parcelable;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.impl.client.cache.CacheConfig;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.fbpay.hub.paymentmethods.api.FbPayAdditionalField;
import com.fbpay.hub.paymentmethods.api.FbPayBankAccount;
import com.fbpay.hub.paymentmethods.api.FbPayCreditCard;
import com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption;
import com.fbpay.hub.paymentmethods.api.FbPayNewPayPalOption;
import com.fbpay.hub.paymentmethods.api.FbPayPayPal;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentDefaultInfo;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod;
import com.fbpay.hub.paymentmethods.api.FbPayShopPay;
import com.fbpay.hub.riskenforcement.api.FBPayHubRiskEnforcementData;
import com.fbpay.hub.transactions.api.UpcomingPayout;
import com.fbpay.logging.ClientSuppressionPolicy;
import com.fbpay.logging.FBPayLoggerData;
import com.fbpay.logging.LoggingContext;
import com.fbpay.logging.LoggingPolicy;
import com.fbpay.theme.FBPayIcon;
import com.fbpay.util.tooltip.TooltipInfo;
import com.fbpay.w3c.Address;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.Contact;
import com.fbpay.w3c.Email;
import com.fbpay.w3c.Phone;
import com.fbpay.w3c.models.W3CCardDetail;
import com.google.android.exoplayer2.FbFormatExtension;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import com.google.android.exoplayer2.metadata.vr.CameraMotionData;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzp;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.clearcut.zze;
import com.instagram.debug.devoptions.cam.AnimationSpecKt;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.debug.devoptions.debughead.linechart.LineChartView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

public class PCreatorCreatorShape4S0000000_I2_4 implements Parcelable.Creator {
    public final int A00;

    public PCreatorCreatorShape4S0000000_I2_4(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 985 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r29) {
        /*
            r28 = this;
            r0 = r28
            int r1 = r0.A00
            r0 = r29
            switch(r1) {
                case 0: goto L_0x0065;
                case 1: goto L_0x006b;
                case 2: goto L_0x0071;
                case 3: goto L_0x0077;
                case 4: goto L_0x007d;
                case 5: goto L_0x0083;
                case 6: goto L_0x0089;
                case 7: goto L_0x008f;
                case 8: goto L_0x0095;
                case 9: goto L_0x009b;
                case 10: goto L_0x00a1;
                case 11: goto L_0x00a7;
                case 12: goto L_0x00c9;
                case 13: goto L_0x00cf;
                case 14: goto L_0x011d;
                case 15: goto L_0x0139;
                case 16: goto L_0x0142;
                case 17: goto L_0x0160;
                case 18: goto L_0x0166;
                case 19: goto L_0x016c;
                case 20: goto L_0x0172;
                case 21: goto L_0x0178;
                case 22: goto L_0x017e;
                case 23: goto L_0x0184;
                case 24: goto L_0x0206;
                case 25: goto L_0x020c;
                case 26: goto L_0x0212;
                case 27: goto L_0x0218;
                case 28: goto L_0x021e;
                case 29: goto L_0x0224;
                case 30: goto L_0x022a;
                case 31: goto L_0x0230;
                case 32: goto L_0x0236;
                case 33: goto L_0x023c;
                case 34: goto L_0x0242;
                case 35: goto L_0x0248;
                case 36: goto L_0x024e;
                case 37: goto L_0x0254;
                case 38: goto L_0x025a;
                case 39: goto L_0x0260;
                case 40: goto L_0x0266;
                case 41: goto L_0x026c;
                case 42: goto L_0x0272;
                case 43: goto L_0x0278;
                case 44: goto L_0x027e;
                case 45: goto L_0x0284;
                case 46: goto L_0x028a;
                case 47: goto L_0x0290;
                case 48: goto L_0x0296;
                case 49: goto L_0x029c;
                case 50: goto L_0x02aa;
                case 51: goto L_0x02b0;
                case 52: goto L_0x02b6;
                case 53: goto L_0x02c0;
                case 54: goto L_0x02c6;
                case 55: goto L_0x02cc;
                case 56: goto L_0x02d2;
                case 57: goto L_0x02d8;
                case 58: goto L_0x02de;
                case 59: goto L_0x02e4;
                case 60: goto L_0x0346;
                case 61: goto L_0x0389;
                case 62: goto L_0x03f2;
                case 63: goto L_0x045f;
                case 64: goto L_0x04a8;
                case 65: goto L_0x04fe;
                case 66: goto L_0x0554;
                case 67: goto L_0x05c3;
                case 68: goto L_0x0627;
                case 69: goto L_0x064f;
                case 70: goto L_0x06a2;
                case 71: goto L_0x06bb;
                case 72: goto L_0x06e0;
                case 73: goto L_0x0727;
                case 74: goto L_0x077c;
                case 75: goto L_0x07b1;
                case 76: goto L_0x07ca;
                case 77: goto L_0x0811;
                case 78: goto L_0x082a;
                case 79: goto L_0x0865;
                case 80: goto L_0x087e;
                case 81: goto L_0x08dd;
                case 82: goto L_0x0905;
                case 83: goto L_0x0959;
                case 84: goto L_0x09b0;
                case 85: goto L_0x09e7;
                case 86: goto L_0x0a19;
                case 87: goto L_0x0a8b;
                case 88: goto L_0x0b1d;
                case 89: goto L_0x0b54;
                case 90: goto L_0x0b7c;
                case 91: goto L_0x0bae;
                case 92: goto L_0x0be0;
                case 93: goto L_0x0c10;
                case 94: goto L_0x0c46;
                case 95: goto L_0x0c8a;
                case 96: goto L_0x0cce;
                case 97: goto L_0x0cfe;
                case 98: goto L_0x0d60;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r11 = r9
            r14 = r9
            r12 = r9
            r15 = r9
            r13 = r9
            r16 = 1
        L_0x0016:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x005c
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x0031;
                case 3: goto L_0x003a;
                case 4: goto L_0x003f;
                case 5: goto L_0x0044;
                case 6: goto L_0x0049;
                case 7: goto L_0x004e;
                case 8: goto L_0x0028;
                case 9: goto L_0x0053;
                default: goto L_0x0024;
            }
        L_0x0024:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0016
        L_0x0028:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r16 = X.C18180wK.A1V(r1)
            goto L_0x0016
        L_0x0031:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.clearcut.zzr.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.internal.clearcut.zzr r9 = (com.google.android.gms.internal.clearcut.zzr) r9
            goto L_0x0016
        L_0x003a:
            byte[] r10 = X.AnonymousClass7Kw.A0O(r0, r2)
            goto L_0x0016
        L_0x003f:
            int[] r11 = X.AnonymousClass7Kw.A0P(r0, r2)
            goto L_0x0016
        L_0x0044:
            java.lang.String[] r14 = X.AnonymousClass7Kw.A0R(r0, r2)
            goto L_0x0016
        L_0x0049:
            int[] r12 = X.AnonymousClass7Kw.A0P(r0, r2)
            goto L_0x0016
        L_0x004e:
            byte[][] r15 = X.AnonymousClass7Kw.A0S(r0, r2)
            goto L_0x0016
        L_0x0053:
            android.os.Parcelable$Creator r1 = com.google.android.gms.phenotype.ExperimentTokens.CREATOR
            java.lang.Object[] r13 = X.AnonymousClass7Kw.A0Q(r0, r1, r2)
            com.google.android.gms.phenotype.ExperimentTokens[] r13 = (com.google.android.gms.phenotype.ExperimentTokens[]) r13
            goto L_0x0016
        L_0x005c:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.clearcut.zze r8 = new com.google.android.gms.clearcut.zze
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
        L_0x0065:
            com.fbpay.hub.paymentmethods.api.FbPayAdditionalField r8 = new com.fbpay.hub.paymentmethods.api.FbPayAdditionalField
            r8.<init>(r0)
            return r8
        L_0x006b:
            com.fbpay.hub.paymentmethods.api.FbPayBankAccount r8 = new com.fbpay.hub.paymentmethods.api.FbPayBankAccount
            r8.<init>((android.os.Parcel) r0)
            return r8
        L_0x0071:
            com.fbpay.hub.paymentmethods.api.FbPayCreditCard r8 = new com.fbpay.hub.paymentmethods.api.FbPayCreditCard
            r8.<init>(r0)
            return r8
        L_0x0077:
            com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption r8 = new com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption
            r8.<init>((android.os.Parcel) r0)
            return r8
        L_0x007d:
            com.fbpay.hub.paymentmethods.api.FbPayNewPayPalOption r8 = new com.fbpay.hub.paymentmethods.api.FbPayNewPayPalOption
            r8.<init>((android.os.Parcel) r0)
            return r8
        L_0x0083:
            com.fbpay.hub.paymentmethods.api.FbPayPayPal r8 = new com.fbpay.hub.paymentmethods.api.FbPayPayPal
            r8.<init>(r0)
            return r8
        L_0x0089:
            com.fbpay.hub.paymentmethods.api.FbPayPaymentDefaultInfo r8 = new com.fbpay.hub.paymentmethods.api.FbPayPaymentDefaultInfo
            r8.<init>(r0)
            return r8
        L_0x008f:
            com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod r8 = new com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod
            r8.<init>(r0)
            return r8
        L_0x0095:
            com.fbpay.hub.paymentmethods.api.FbPayShopPay r8 = new com.fbpay.hub.paymentmethods.api.FbPayShopPay
            r8.<init>(r0)
            return r8
        L_0x009b:
            com.fbpay.hub.riskenforcement.api.FBPayHubRiskEnforcementData r8 = new com.fbpay.hub.riskenforcement.api.FBPayHubRiskEnforcementData
            r8.<init>(r0)
            return r8
        L_0x00a1:
            com.fbpay.hub.transactions.api.UpcomingPayout r8 = new com.fbpay.hub.transactions.api.UpcomingPayout
            r8.<init>(r0)
            return r8
        L_0x00a7:
            java.lang.String r2 = X.C86104wH.A0q(r0)
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x00c0
            r1 = 0
        L_0x00b2:
            java.lang.String r0 = r0.readString()
            X.67J r0 = X.AnonymousClass67J.valueOf(r0)
            com.fbpay.logging.ClientSuppressionPolicy r8 = new com.fbpay.logging.ClientSuppressionPolicy
            r8.<init>(r0, r1, r2)
            return r8
        L_0x00c0:
            java.lang.String r1 = r0.readString()
            X.LcA r1 = X.C40304LcA.valueOf(r1)
            goto L_0x00b2
        L_0x00c9:
            com.fbpay.logging.FBPayLoggerData r8 = new com.fbpay.logging.FBPayLoggerData
            r8.<init>(r0)
            return r8
        L_0x00cf:
            java.lang.String r10 = X.C86104wH.A0q(r0)
            long r13 = r0.readLong()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x00f6
            r9 = 0
        L_0x00de:
            com.fbpay.logging.LoggingPolicy r9 = (com.fbpay.logging.LoggingPolicy) r9
            int r3 = r0.readInt()
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>(r3)
            r2 = 0
        L_0x00ea:
            if (r2 == r3) goto L_0x00fd
            java.lang.String r1 = r0.readString()
            r11.add(r1)
            int r2 = r2 + 1
            goto L_0x00ea
        L_0x00f6:
            android.os.Parcelable$Creator r1 = com.fbpay.logging.LoggingPolicy.CREATOR
            java.lang.Object r9 = r1.createFromParcel(r0)
            goto L_0x00de
        L_0x00fd:
            int r3 = r0.readInt()
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>(r3)
            r2 = 0
        L_0x0107:
            if (r2 == r3) goto L_0x0113
            java.lang.String r1 = r0.readString()
            r12.add(r1)
            int r2 = r2 + 1
            goto L_0x0107
        L_0x0113:
            boolean r15 = X.C86104wH.A1W(r0)
            com.fbpay.logging.LoggingContext r8 = new com.fbpay.logging.LoggingContext
            r8.<init>(r9, r10, r11, r12, r13, r15)
            return r8
        L_0x011d:
            java.lang.String r5 = X.C86104wH.A0q(r0)
            int r4 = r0.readInt()
            java.util.ArrayList r3 = X.C18240wQ.A0k(r4)
            r2 = 0
        L_0x012a:
            if (r2 == r4) goto L_0x0133
            android.os.Parcelable$Creator r1 = com.fbpay.logging.ClientSuppressionPolicy.CREATOR
            int r2 = X.C86124wJ.A0B(r0, r1, r3, r2)
            goto L_0x012a
        L_0x0133:
            com.fbpay.logging.LoggingPolicy r8 = new com.fbpay.logging.LoggingPolicy
            r8.<init>(r5, r3)
            return r8
        L_0x0139:
            java.lang.String r0 = X.C86104wH.A0q(r0)
            com.fbpay.theme.FBPayIcon r8 = com.fbpay.theme.FBPayIcon.valueOf(r0)
            return r8
        L_0x0142:
            int r9 = X.C86104wH.A09(r0)
            int r10 = r0.readInt()
            int r11 = r0.readInt()
            int r12 = r0.readInt()
            int r13 = r0.readInt()
            int r14 = r0.readInt()
            com.fbpay.util.tooltip.TooltipInfo r8 = new com.fbpay.util.tooltip.TooltipInfo
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x0160:
            com.fbpay.w3c.Address r8 = new com.fbpay.w3c.Address
            r8.<init>(r0)
            return r8
        L_0x0166:
            com.fbpay.w3c.CardDetails r8 = new com.fbpay.w3c.CardDetails
            r8.<init>(r0)
            return r8
        L_0x016c:
            com.fbpay.w3c.Contact r8 = new com.fbpay.w3c.Contact
            r8.<init>(r0)
            return r8
        L_0x0172:
            com.fbpay.w3c.Email r8 = new com.fbpay.w3c.Email
            r8.<init>(r0)
            return r8
        L_0x0178:
            com.fbpay.w3c.Phone r8 = new com.fbpay.w3c.Phone
            r8.<init>(r0)
            return r8
        L_0x017e:
            com.fbpay.w3c.models.W3CCardDetail r8 = new com.fbpay.w3c.models.W3CCardDetail
            r8.<init>(r0)
            return r8
        L_0x0184:
            java.lang.String r13 = r0.readString()
            int r1 = r0.readInt()
            boolean r24 = X.C18180wK.A1V(r1)
            int r1 = r0.readInt()
            boolean r25 = X.C18180wK.A1V(r1)
            int r1 = r0.readInt()
            boolean r21 = X.C18180wK.A1V(r1)
            int r1 = r0.readInt()
            boolean r20 = X.C18180wK.A1V(r1)
            int r1 = r0.readInt()
            boolean r19 = X.C18180wK.A1V(r1)
            int r1 = r0.readInt()
            boolean r18 = X.C18180wK.A1V(r1)
            int r1 = r0.readInt()
            boolean r17 = X.C18180wK.A1V(r1)
            int r1 = r0.readInt()
            boolean r16 = X.C18180wK.A1V(r1)
            int r1 = r0.readInt()
            boolean r26 = X.C18180wK.A1V(r1)
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            java.lang.String r10 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r9 = r0.readString()
            int r1 = r0.readInt()
            boolean r23 = X.C18180wK.A1V(r1)
            int r15 = r0.readInt()
            int r1 = r0.readInt()
            boolean r22 = X.C18180wK.A1V(r1)
            int r0 = r0.readInt()
            boolean r27 = X.C18180wK.A1V(r0)
            com.google.android.exoplayer2.FbFormatExtension r8 = new com.google.android.exoplayer2.FbFormatExtension
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r8
        L_0x0206:
            com.google.android.exoplayer2.drm.DrmInitData r8 = new com.google.android.exoplayer2.drm.DrmInitData
            r8.<init>(r0)
            return r8
        L_0x020c:
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r8 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            r8.<init>(r0)
            return r8
        L_0x0212:
            com.google.android.exoplayer2.extractor.mp4.MdtaMetadataEntry r8 = new com.google.android.exoplayer2.extractor.mp4.MdtaMetadataEntry
            r8.<init>(r0)
            return r8
        L_0x0218:
            com.google.android.exoplayer2.metadata.Metadata r8 = new com.google.android.exoplayer2.metadata.Metadata
            r8.<init>((android.os.Parcel) r0)
            return r8
        L_0x021e:
            com.google.android.exoplayer2.metadata.emsg.EventMessage r8 = new com.google.android.exoplayer2.metadata.emsg.EventMessage
            r8.<init>(r0)
            return r8
        L_0x0224:
            com.google.android.exoplayer2.metadata.flac.PictureFrame r8 = new com.google.android.exoplayer2.metadata.flac.PictureFrame
            r8.<init>(r0)
            return r8
        L_0x022a:
            com.google.android.exoplayer2.metadata.flac.VorbisComment r8 = new com.google.android.exoplayer2.metadata.flac.VorbisComment
            r8.<init>(r0)
            return r8
        L_0x0230:
            com.google.android.exoplayer2.metadata.icy.IcyHeaders r8 = new com.google.android.exoplayer2.metadata.icy.IcyHeaders
            r8.<init>(r0)
            return r8
        L_0x0236:
            com.google.android.exoplayer2.metadata.icy.IcyInfo r8 = new com.google.android.exoplayer2.metadata.icy.IcyInfo
            r8.<init>(r0)
            return r8
        L_0x023c:
            com.google.android.exoplayer2.metadata.id3.ApicFrame r8 = new com.google.android.exoplayer2.metadata.id3.ApicFrame
            r8.<init>(r0)
            return r8
        L_0x0242:
            com.google.android.exoplayer2.metadata.id3.BinaryFrame r8 = new com.google.android.exoplayer2.metadata.id3.BinaryFrame
            r8.<init>(r0)
            return r8
        L_0x0248:
            com.google.android.exoplayer2.metadata.id3.ChapterFrame r8 = new com.google.android.exoplayer2.metadata.id3.ChapterFrame
            r8.<init>(r0)
            return r8
        L_0x024e:
            com.google.android.exoplayer2.metadata.id3.ChapterTocFrame r8 = new com.google.android.exoplayer2.metadata.id3.ChapterTocFrame
            r8.<init>(r0)
            return r8
        L_0x0254:
            com.google.android.exoplayer2.metadata.id3.CommentFrame r8 = new com.google.android.exoplayer2.metadata.id3.CommentFrame
            r8.<init>(r0)
            return r8
        L_0x025a:
            com.google.android.exoplayer2.metadata.id3.GeobFrame r8 = new com.google.android.exoplayer2.metadata.id3.GeobFrame
            r8.<init>(r0)
            return r8
        L_0x0260:
            com.google.android.exoplayer2.metadata.id3.InternalFrame r8 = new com.google.android.exoplayer2.metadata.id3.InternalFrame
            r8.<init>(r0)
            return r8
        L_0x0266:
            com.google.android.exoplayer2.metadata.id3.MlltFrame r8 = new com.google.android.exoplayer2.metadata.id3.MlltFrame
            r8.<init>(r0)
            return r8
        L_0x026c:
            com.google.android.exoplayer2.metadata.id3.PrivFrame r8 = new com.google.android.exoplayer2.metadata.id3.PrivFrame
            r8.<init>(r0)
            return r8
        L_0x0272:
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r8 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            r8.<init>(r0)
            return r8
        L_0x0278:
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r8 = new com.google.android.exoplayer2.metadata.id3.UrlLinkFrame
            r8.<init>(r0)
            return r8
        L_0x027e:
            com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry r8 = new com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry
            r8.<init>(r0)
            return r8
        L_0x0284:
            com.google.android.exoplayer2.metadata.scte35.PrivateCommand r8 = new com.google.android.exoplayer2.metadata.scte35.PrivateCommand
            r8.<init>(r0)
            return r8
        L_0x028a:
            com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand r8 = new com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand
            r8.<init>(r0)
            return r8
        L_0x0290:
            com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand r8 = new com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand
            r8.<init>()
            return r8
        L_0x0296:
            com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand r8 = new com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand
            r8.<init>((android.os.Parcel) r0)
            return r8
        L_0x029c:
            long r2 = r0.readLong()
            long r0 = r0.readLong()
            com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand r8 = new com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand
            r8.<init>(r2, r0)
            return r8
        L_0x02aa:
            com.google.android.exoplayer2.metadata.vr.CameraMotionData r8 = new com.google.android.exoplayer2.metadata.vr.CameraMotionData
            r8.<init>(r0)
            return r8
        L_0x02b0:
            com.google.android.exoplayer2.offline.StreamKey r8 = new com.google.android.exoplayer2.offline.StreamKey
            r8.<init>(r0)
            return r8
        L_0x02b6:
            int r0 = r0.readInt()
            com.google.android.exoplayer2.scheduler.Requirements r8 = new com.google.android.exoplayer2.scheduler.Requirements
            r8.<init>(r0)
            return r8
        L_0x02c0:
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r8 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters
            r8.<init>((android.os.Parcel) r0)
            return r8
        L_0x02c6:
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride r8 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride
            r8.<init>(r0)
            return r8
        L_0x02cc:
            com.google.android.exoplayer2.video.ColorInfo r8 = new com.google.android.exoplayer2.video.ColorInfo
            r8.<init>(r0)
            return r8
        L_0x02d2:
            com.google.android.flexbox.FlexboxLayout$LayoutParams r8 = new com.google.android.flexbox.FlexboxLayout$LayoutParams
            r8.<init>(r0)
            return r8
        L_0x02d8:
            com.google.android.flexbox.FlexboxLayoutManager$LayoutParams r8 = new com.google.android.flexbox.FlexboxLayoutManager$LayoutParams
            r8.<init>(r0)
            return r8
        L_0x02de:
            com.google.android.flexbox.FlexboxLayoutManager$SavedState r8 = new com.google.android.flexbox.FlexboxLayoutManager$SavedState
            r8.<init>((android.os.Parcel) r0)
            return r8
        L_0x02e4:
            int r4 = X.AnonymousClass7Kw.A02(r0)
            java.util.HashSet r11 = X.C18200wM.A0u()
            r10 = 0
            r12 = 0
            r9 = r10
            r13 = 0
        L_0x02f0:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x0328
            int r3 = r0.readInt()
            char r1 = (char) r3
            r2 = 1
            if (r1 == r2) goto L_0x031b
            r2 = 2
            if (r1 == r2) goto L_0x0314
            r2 = 3
            if (r1 == r2) goto L_0x0320
            r2 = 4
            if (r1 == r2) goto L_0x030b
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x02f0
        L_0x030b:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.accounttransfer.zzp.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r3)
            com.google.android.gms.auth.api.accounttransfer.zzp r9 = (com.google.android.gms.auth.api.accounttransfer.zzp) r9
            goto L_0x0324
        L_0x0314:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.accounttransfer.zzs.CREATOR
            java.util.ArrayList r10 = X.AnonymousClass7Kw.A0H(r0, r1, r3)
            goto L_0x0324
        L_0x031b:
            int r12 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x0324
        L_0x0320:
            int r13 = X.AnonymousClass7Kw.A04(r0, r3)
        L_0x0324:
            X.C18200wM.A1U(r11, r2)
            goto L_0x02f0
        L_0x0328:
            int r1 = r0.dataPosition()
            if (r1 != r4) goto L_0x0334
            com.google.android.gms.auth.api.accounttransfer.zzl r8 = new com.google.android.gms.auth.api.accounttransfer.zzl
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x0334:
            r1 = 37
            java.lang.StringBuilder r2 = X.C86114wI.A0s(r1)
            java.lang.String r1 = "Overread allowed size end="
            java.lang.String r2 = X.C86104wH.A10(r1, r2, r4)
            X.88N r1 = new X.88N
            r1.<init>(r0, r2)
            throw r1
        L_0x0346:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = 0
        L_0x0350:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0380
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x037b;
                case 2: goto L_0x0362;
                case 3: goto L_0x0367;
                case 4: goto L_0x036c;
                case 5: goto L_0x0371;
                case 6: goto L_0x0376;
                default: goto L_0x035e;
            }
        L_0x035e:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0350
        L_0x0362:
            java.util.ArrayList r9 = X.AnonymousClass7Kw.A0G(r0, r2)
            goto L_0x0350
        L_0x0367:
            java.util.ArrayList r10 = X.AnonymousClass7Kw.A0G(r0, r2)
            goto L_0x0350
        L_0x036c:
            java.util.ArrayList r11 = X.AnonymousClass7Kw.A0G(r0, r2)
            goto L_0x0350
        L_0x0371:
            java.util.ArrayList r12 = X.AnonymousClass7Kw.A0G(r0, r2)
            goto L_0x0350
        L_0x0376:
            java.util.ArrayList r13 = X.AnonymousClass7Kw.A0G(r0, r2)
            goto L_0x0350
        L_0x037b:
            int r14 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0350
        L_0x0380:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.auth.api.accounttransfer.zzp r8 = new com.google.android.gms.auth.api.accounttransfer.zzp
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x0389:
            int r4 = X.AnonymousClass7Kw.A02(r0)
            java.util.HashSet r13 = X.C18200wM.A0u()
            r9 = 0
            r14 = 0
            r10 = r9
            r11 = r9
            r12 = r9
        L_0x0396:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x03d4
            int r3 = r0.readInt()
            char r1 = (char) r3
            r2 = 1
            if (r1 == r2) goto L_0x03c7
            r2 = 2
            if (r1 == r2) goto L_0x03be
            r2 = 3
            if (r1 == r2) goto L_0x03b9
            r2 = 4
            if (r1 == r2) goto L_0x03cc
            r2 = 5
            if (r1 == r2) goto L_0x03b4
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0396
        L_0x03b4:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x03d0
        L_0x03b9:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x03d0
        L_0x03be:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.accounttransfer.zzt.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r3)
            com.google.android.gms.auth.api.accounttransfer.zzt r9 = (com.google.android.gms.auth.api.accounttransfer.zzt) r9
            goto L_0x03d0
        L_0x03c7:
            int r14 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x03d0
        L_0x03cc:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r3)
        L_0x03d0:
            X.C18200wM.A1U(r13, r2)
            goto L_0x0396
        L_0x03d4:
            int r1 = r0.dataPosition()
            if (r1 != r4) goto L_0x03e0
            com.google.android.gms.auth.api.accounttransfer.zzs r8 = new com.google.android.gms.auth.api.accounttransfer.zzs
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x03e0:
            r1 = 37
            java.lang.StringBuilder r2 = X.C86114wI.A0s(r1)
            java.lang.String r1 = "Overread allowed size end="
            java.lang.String r2 = X.C86104wH.A10(r1, r2, r4)
            X.88N r1 = new X.88N
            r1.<init>(r0, r2)
            throw r1
        L_0x03f2:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            java.util.HashSet r12 = X.C18200wM.A0u()
            r11 = 0
            r13 = r11
            r9 = r11
            r10 = r11
            r14 = 0
            r15 = 0
        L_0x0400:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0441
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x0432;
                case 2: goto L_0x0412;
                case 3: goto L_0x0438;
                case 4: goto L_0x0418;
                case 5: goto L_0x041e;
                case 6: goto L_0x0428;
                default: goto L_0x040e;
            }
        L_0x040e:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0400
        L_0x0412:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r2)
            r1 = 2
            goto L_0x043d
        L_0x0418:
            byte[] r13 = X.AnonymousClass7Kw.A0O(r0, r2)
            r1 = 4
            goto L_0x043d
        L_0x041e:
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
            r1 = 5
            goto L_0x043d
        L_0x0428:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.accounttransfer.DeviceMetaData.CREATOR
            android.os.Parcelable r10 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.auth.api.accounttransfer.DeviceMetaData r10 = (com.google.android.gms.auth.api.accounttransfer.DeviceMetaData) r10
            r1 = 6
            goto L_0x043d
        L_0x0432:
            int r14 = X.AnonymousClass7Kw.A04(r0, r2)
            r1 = 1
            goto L_0x043d
        L_0x0438:
            int r15 = X.AnonymousClass7Kw.A04(r0, r2)
            r1 = 3
        L_0x043d:
            X.C18200wM.A1U(r12, r1)
            goto L_0x0400
        L_0x0441:
            int r1 = r0.dataPosition()
            if (r1 != r3) goto L_0x044d
            com.google.android.gms.auth.api.accounttransfer.zzt r8 = new com.google.android.gms.auth.api.accounttransfer.zzt
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L_0x044d:
            r1 = 37
            java.lang.StringBuilder r2 = X.C86114wI.A0s(r1)
            java.lang.String r1 = "Overread allowed size end="
            java.lang.String r2 = X.C86104wH.A10(r1, r2, r3)
            X.88N r1 = new X.88N
            r1.<init>(r0, r2)
            throw r1
        L_0x045f:
            int r4 = X.AnonymousClass7Kw.A02(r0)
            r10 = 0
            r9 = 0
            r12 = 0
            r13 = 0
        L_0x0468:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x049f
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x049a
            r1 = 2
            if (r2 == r1) goto L_0x0491
            r1 = 3
            if (r2 == r1) goto L_0x048c
            r1 = 4
            if (r2 == r1) goto L_0x0483
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0468
        L_0x0483:
            int r1 = X.AnonymousClass7Kw.A04(r0, r3)
            boolean r13 = X.C18180wK.A1V(r1)
            goto L_0x0468
        L_0x048c:
            long r10 = X.AnonymousClass7Kw.A07(r0, r3)
            goto L_0x0468
        L_0x0491:
            int r1 = X.AnonymousClass7Kw.A04(r0, r3)
            boolean r12 = X.C18180wK.A1V(r1)
            goto L_0x0468
        L_0x049a:
            int r9 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x0468
        L_0x049f:
            X.AnonymousClass7Kw.A0I(r0, r4)
            com.google.android.gms.auth.api.accounttransfer.DeviceMetaData r8 = new com.google.android.gms.auth.api.accounttransfer.DeviceMetaData
            r8.<init>(r9, r10, r12, r13)
            return r8
        L_0x04a8:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r10 = 0
            r11 = r10
            r9 = r10
            r16 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
        L_0x04b5:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x04f5
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x04c7;
                case 2: goto L_0x04cc;
                case 3: goto L_0x04d1;
                case 4: goto L_0x04da;
                case 5: goto L_0x04e1;
                case 6: goto L_0x04e6;
                case 7: goto L_0x04c3;
                case 8: goto L_0x04c3;
                case 9: goto L_0x04eb;
                case 10: goto L_0x04f0;
                default: goto L_0x04c3;
            }
        L_0x04c3:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x04b5
        L_0x04c7:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x04b5
        L_0x04cc:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x04b5
        L_0x04d1:
            android.os.Parcelable$Creator r1 = android.net.Uri.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            android.net.Uri r9 = (android.net.Uri) r9
            goto L_0x04b5
        L_0x04da:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.credentials.IdToken.CREATOR
            java.util.ArrayList r16 = X.AnonymousClass7Kw.A0H(r0, r1, r2)
            goto L_0x04b5
        L_0x04e1:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x04b5
        L_0x04e6:
            java.lang.String r13 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x04b5
        L_0x04eb:
            java.lang.String r14 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x04b5
        L_0x04f0:
            java.lang.String r15 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x04b5
        L_0x04f5:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.auth.api.credentials.Credential r8 = new com.google.android.gms.auth.api.credentials.Credential
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
        L_0x04fe:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r10 = 0
        L_0x0507:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x054b
            int r4 = r0.readInt()
            char r2 = (char) r4
            r1 = 1
            if (r2 == r1) goto L_0x0542
            r1 = 2
            if (r2 == r1) goto L_0x0539
            r1 = 3
            if (r2 == r1) goto L_0x0530
            r1 = 4
            if (r2 == r1) goto L_0x052b
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r1) goto L_0x0526
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x0507
        L_0x0526:
            int r9 = X.AnonymousClass7Kw.A03(r0, r4)
            goto L_0x0507
        L_0x052b:
            int r10 = X.AnonymousClass7Kw.A03(r0, r4)
            goto L_0x0507
        L_0x0530:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r13 = X.C18180wK.A1V(r1)
            goto L_0x0507
        L_0x0539:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r12 = X.C18180wK.A1V(r1)
            goto L_0x0507
        L_0x0542:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r11 = X.C18180wK.A1V(r1)
            goto L_0x0507
        L_0x054b:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.auth.api.credentials.CredentialPickerConfig r8 = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x0554:
            int r2 = X.AnonymousClass7Kw.A02(r0)
            r13 = 0
            r9 = r13
            r10 = r13
            r11 = r13
            r12 = r13
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0563:
            int r1 = r0.dataPosition()
            if (r1 >= r2) goto L_0x05ba
            int r4 = r0.readInt()
            char r3 = (char) r4
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r3 == r1) goto L_0x05b5
            switch(r3) {
                case 1: goto L_0x0579;
                case 2: goto L_0x0594;
                case 3: goto L_0x0599;
                case 4: goto L_0x05a2;
                case 5: goto L_0x0582;
                case 6: goto L_0x05ab;
                case 7: goto L_0x05b0;
                case 8: goto L_0x058b;
                default: goto L_0x0575;
            }
        L_0x0575:
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x0563
        L_0x0579:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r15 = X.C18180wK.A1V(r1)
            goto L_0x0563
        L_0x0582:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r16 = X.C18180wK.A1V(r1)
            goto L_0x0563
        L_0x058b:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r17 = X.C18180wK.A1V(r1)
            goto L_0x0563
        L_0x0594:
            java.lang.String[] r13 = X.AnonymousClass7Kw.A0R(r0, r4)
            goto L_0x0563
        L_0x0599:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.credentials.CredentialPickerConfig.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.auth.api.credentials.CredentialPickerConfig r9 = (com.google.android.gms.auth.api.credentials.CredentialPickerConfig) r9
            goto L_0x0563
        L_0x05a2:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.credentials.CredentialPickerConfig.CREATOR
            android.os.Parcelable r10 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.auth.api.credentials.CredentialPickerConfig r10 = (com.google.android.gms.auth.api.credentials.CredentialPickerConfig) r10
            goto L_0x0563
        L_0x05ab:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x0563
        L_0x05b0:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x0563
        L_0x05b5:
            int r14 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x0563
        L_0x05ba:
            X.AnonymousClass7Kw.A0I(r0, r2)
            com.google.android.gms.auth.api.credentials.CredentialRequest r8 = new com.google.android.gms.auth.api.credentials.CredentialRequest
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r8
        L_0x05c3:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r12 = r9
            r10 = r9
            r11 = r9
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x05d0:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x061e
            int r4 = r0.readInt()
            char r2 = (char) r4
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r1) goto L_0x0619
            switch(r2) {
                case 1: goto L_0x0601;
                case 2: goto L_0x05e6;
                case 3: goto L_0x05ef;
                case 4: goto L_0x060a;
                case 5: goto L_0x05f8;
                case 6: goto L_0x060f;
                case 7: goto L_0x0614;
                default: goto L_0x05e2;
            }
        L_0x05e2:
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x05d0
        L_0x05e6:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r14 = X.C18180wK.A1V(r1)
            goto L_0x05d0
        L_0x05ef:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r15 = X.C18180wK.A1V(r1)
            goto L_0x05d0
        L_0x05f8:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r16 = X.C18180wK.A1V(r1)
            goto L_0x05d0
        L_0x0601:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.credentials.CredentialPickerConfig.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.auth.api.credentials.CredentialPickerConfig r9 = (com.google.android.gms.auth.api.credentials.CredentialPickerConfig) r9
            goto L_0x05d0
        L_0x060a:
            java.lang.String[] r12 = X.AnonymousClass7Kw.A0R(r0, r4)
            goto L_0x05d0
        L_0x060f:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x05d0
        L_0x0614:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x05d0
        L_0x0619:
            int r13 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x05d0
        L_0x061e:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.auth.api.credentials.HintRequest r8 = new com.google.android.gms.auth.api.credentials.HintRequest
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
        L_0x0627:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r5 = 0
            r4 = r5
        L_0x062d:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x0646
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0641
            r1 = 2
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x062d
        L_0x0641:
            java.lang.String r5 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x062d
        L_0x0646:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.auth.api.credentials.IdToken r8 = new com.google.android.gms.auth.api.credentials.IdToken
            r8.<init>(r5, r4)
            return r8
        L_0x064f:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r11 = 0
            r9 = r11
            r12 = r11
            r10 = r11
            r14 = 0
            r13 = 0
        L_0x0659:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0699
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x0674;
                case 2: goto L_0x067d;
                case 3: goto L_0x0686;
                case 4: goto L_0x066b;
                case 5: goto L_0x0694;
                case 6: goto L_0x068b;
                default: goto L_0x0667;
            }
        L_0x0667:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0659
        L_0x066b:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r14 = X.C18180wK.A1V(r1)
            goto L_0x0659
        L_0x0674:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.CREATOR
            android.os.Parcelable r11 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions r11 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions) r11
            goto L_0x0659
        L_0x067d:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions r9 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions) r9
            goto L_0x0659
        L_0x0686:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0659
        L_0x068b:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.CREATOR
            android.os.Parcelable r10 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions r10 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions) r10
            goto L_0x0659
        L_0x0694:
            int r13 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0659
        L_0x0699:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.auth.api.identity.BeginSignInRequest r8 = new com.google.android.gms.auth.api.identity.BeginSignInRequest
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x06a2:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r2 = 0
        L_0x06a7:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x06b2
            android.app.PendingIntent r2 = X.AnonymousClass7Kw.A08(r2, r0)
            goto L_0x06a7
        L_0x06b2:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.auth.api.identity.BeginSignInResult r8 = new com.google.android.gms.auth.api.identity.BeginSignInResult
            r8.<init>(r2)
            return r8
        L_0x06bb:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
        L_0x06c0:
            int r2 = r0.dataPosition()
            if (r2 >= r5) goto L_0x06d7
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x06d2
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x06c0
        L_0x06d2:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x06c0
        L_0x06d7:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest r8 = new com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest
            r8.<init>(r1)
            return r8
        L_0x06e0:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r11 = r9
            r12 = r9
            r14 = 0
            r13 = 0
        L_0x06ea:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x071e
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x0705;
                case 2: goto L_0x070a;
                case 3: goto L_0x070f;
                case 4: goto L_0x0714;
                case 5: goto L_0x06fc;
                case 6: goto L_0x0719;
                default: goto L_0x06f8;
            }
        L_0x06f8:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x06ea
        L_0x06fc:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r14 = X.C18180wK.A1V(r1)
            goto L_0x06ea
        L_0x0705:
            java.lang.String r9 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x06ea
        L_0x070a:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x06ea
        L_0x070f:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x06ea
        L_0x0714:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x06ea
        L_0x0719:
            int r13 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x06ea
        L_0x071e:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.auth.api.identity.GetSignInIntentRequest r8 = new com.google.android.gms.auth.api.identity.GetSignInIntentRequest
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x0727:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0732:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0773
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x0744;
                case 2: goto L_0x075f;
                case 3: goto L_0x0764;
                case 4: goto L_0x074d;
                case 5: goto L_0x0769;
                case 6: goto L_0x076e;
                case 7: goto L_0x0756;
                default: goto L_0x0740;
            }
        L_0x0740:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0732
        L_0x0744:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r13 = X.C18180wK.A1V(r1)
            goto L_0x0732
        L_0x074d:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r14 = X.C18180wK.A1V(r1)
            goto L_0x0732
        L_0x0756:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r15 = X.C18180wK.A1V(r1)
            goto L_0x0732
        L_0x075f:
            java.lang.String r9 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0732
        L_0x0764:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0732
        L_0x0769:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0732
        L_0x076e:
            java.util.ArrayList r12 = X.AnonymousClass7Kw.A0G(r0, r2)
            goto L_0x0732
        L_0x0773:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions r8 = new com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L_0x077c:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r6 = 0
            r5 = r6
            r1 = 0
        L_0x0783:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x07a8
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x079f
            r2 = 2
            if (r3 == r2) goto L_0x079a
            r2 = 3
            java.lang.String r5 = X.AnonymousClass7Kw.A0F(r0, r5, r3, r2, r4)
            goto L_0x0783
        L_0x079a:
            byte[] r6 = X.AnonymousClass7Kw.A0O(r0, r4)
            goto L_0x0783
        L_0x079f:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r1 = X.C18180wK.A1V(r1)
            goto L_0x0783
        L_0x07a8:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions r8 = new com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions
            r8.<init>(r5, r6, r1)
            return r8
        L_0x07b1:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r2 = 0
        L_0x07b6:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x07c1
            boolean r2 = X.AnonymousClass7Kw.A0N(r0, r2)
            goto L_0x07b6
        L_0x07c1:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions r8 = new com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions
            r8.<init>(r2)
            return r8
        L_0x07ca:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r11 = r9
            r13 = r9
            r12 = r9
            r14 = 0
        L_0x07d4:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0808
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x07e6;
                case 2: goto L_0x07ef;
                case 3: goto L_0x07f4;
                case 4: goto L_0x07f9;
                case 5: goto L_0x07fe;
                case 6: goto L_0x0803;
                default: goto L_0x07e2;
            }
        L_0x07e2:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x07d4
        L_0x07e6:
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
            goto L_0x07d4
        L_0x07ef:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x07d4
        L_0x07f4:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x07d4
        L_0x07f9:
            java.util.ArrayList r13 = X.AnonymousClass7Kw.A0G(r0, r2)
            goto L_0x07d4
        L_0x07fe:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x07d4
        L_0x0803:
            int r14 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x07d4
        L_0x0808:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest r8 = new com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x0811:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r2 = 0
        L_0x0816:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0821
            android.app.PendingIntent r2 = X.AnonymousClass7Kw.A08(r2, r0)
            goto L_0x0816
        L_0x0821:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult r8 = new com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult
            r8.<init>(r2)
            return r8
        L_0x082a:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r6 = r1
            r2 = 0
        L_0x0831:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x085c
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x0853
            r3 = 2
            if (r4 == r3) goto L_0x084e
            r3 = 3
            if (r4 == r3) goto L_0x0849
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x0831
        L_0x0849:
            int r2 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x0831
        L_0x084e:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r5)
            goto L_0x0831
        L_0x0853:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.identity.SignInPassword.CREATOR
            android.os.Parcelable r1 = X.AnonymousClass7Kw.A0B(r0, r1, r5)
            com.google.android.gms.auth.api.identity.SignInPassword r1 = (com.google.android.gms.auth.api.identity.SignInPassword) r1
            goto L_0x0831
        L_0x085c:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.auth.api.identity.SavePasswordRequest r8 = new com.google.android.gms.auth.api.identity.SavePasswordRequest
            r8.<init>(r1, r6, r2)
            return r8
        L_0x0865:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r2 = 0
        L_0x086a:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0875
            android.app.PendingIntent r2 = X.AnonymousClass7Kw.A08(r2, r0)
            goto L_0x086a
        L_0x0875:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.auth.api.identity.SavePasswordResult r8 = new com.google.android.gms.auth.api.identity.SavePasswordResult
            r8.<init>(r2)
            return r8
        L_0x087e:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r11 = 0
            r12 = r11
            r13 = r11
            r14 = r11
            r9 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r10 = r11
        L_0x088d:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x08d4
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x089f;
                case 2: goto L_0x08a4;
                case 3: goto L_0x08a9;
                case 4: goto L_0x08ae;
                case 5: goto L_0x08b3;
                case 6: goto L_0x08bc;
                case 7: goto L_0x08c1;
                case 8: goto L_0x08c6;
                case 9: goto L_0x08cb;
                default: goto L_0x089b;
            }
        L_0x089b:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x088d
        L_0x089f:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x088d
        L_0x08a4:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x088d
        L_0x08a9:
            java.lang.String r13 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x088d
        L_0x08ae:
            java.lang.String r14 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x088d
        L_0x08b3:
            android.os.Parcelable$Creator r1 = android.net.Uri.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            android.net.Uri r9 = (android.net.Uri) r9
            goto L_0x088d
        L_0x08bc:
            java.lang.String r15 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x088d
        L_0x08c1:
            java.lang.String r16 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x088d
        L_0x08c6:
            java.lang.String r17 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x088d
        L_0x08cb:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.CREATOR
            android.os.Parcelable r10 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r10 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) r10
            goto L_0x088d
        L_0x08d4:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.auth.api.identity.SignInCredential r8 = new com.google.android.gms.auth.api.identity.SignInCredential
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r8
        L_0x08dd:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r5 = 0
            r4 = r5
        L_0x08e3:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x08fc
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x08f7
            r1 = 2
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x08e3
        L_0x08f7:
            java.lang.String r5 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x08e3
        L_0x08fc:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.auth.api.identity.SignInPassword r8 = new com.google.android.gms.auth.api.identity.SignInPassword
            r8.<init>(r5, r4)
            return r8
        L_0x0905:
            int r4 = X.AnonymousClass7Kw.A02(r0)
            r10 = 0
            r11 = r10
            r9 = r10
            r14 = 0
            r12 = 0
            r13 = 0
        L_0x0910:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x0950
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x094b
            r1 = 2
            if (r2 == r1) goto L_0x0946
            r1 = 3
            if (r2 == r1) goto L_0x0941
            r1 = 4
            if (r2 == r1) goto L_0x093c
            r1 = 5
            if (r2 == r1) goto L_0x0937
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r1) goto L_0x0932
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0910
        L_0x0932:
            int r12 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x0910
        L_0x0937:
            android.os.Bundle r9 = X.AnonymousClass7Kw.A09(r0, r3)
            goto L_0x0910
        L_0x093c:
            byte[] r11 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x0910
        L_0x0941:
            long r14 = X.AnonymousClass7Kw.A07(r0, r3)
            goto L_0x0910
        L_0x0946:
            int r13 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x0910
        L_0x094b:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x0910
        L_0x0950:
            X.AnonymousClass7Kw.A0I(r0, r4)
            com.google.android.gms.auth.api.proxy.ProxyRequest r8 = new com.google.android.gms.auth.api.proxy.ProxyRequest
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x0959:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r11 = r9
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0963:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x09a7
            int r2 = r0.readInt()
            char r4 = (char) r2
            r1 = 1
            if (r4 == r1) goto L_0x09a2
            r1 = 2
            if (r4 == r1) goto L_0x0999
            r1 = 3
            if (r4 == r1) goto L_0x0994
            r1 = 4
            if (r4 == r1) goto L_0x098f
            r1 = 5
            if (r4 == r1) goto L_0x098a
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r4 == r1) goto L_0x0985
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0963
        L_0x0985:
            int r12 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0963
        L_0x098a:
            byte[] r11 = X.AnonymousClass7Kw.A0O(r0, r2)
            goto L_0x0963
        L_0x098f:
            android.os.Bundle r10 = X.AnonymousClass7Kw.A09(r0, r2)
            goto L_0x0963
        L_0x0994:
            int r14 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0963
        L_0x0999:
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
            goto L_0x0963
        L_0x09a2:
            int r13 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0963
        L_0x09a7:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.auth.api.proxy.ProxyResponse r8 = new com.google.android.gms.auth.api.proxy.ProxyResponse
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x09b0:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r6 = 0
            r2 = 0
        L_0x09b7:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x09de
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x09d9
            r3 = 2
            if (r4 == r3) goto L_0x09d4
            r3 = 3
            if (r4 == r3) goto L_0x09cf
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x09b7
        L_0x09cf:
            android.os.Bundle r6 = X.AnonymousClass7Kw.A09(r0, r5)
            goto L_0x09b7
        L_0x09d4:
            int r2 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x09b7
        L_0x09d9:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x09b7
        L_0x09de:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable r8 = new com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable
            r8.<init>(r6, r1, r2)
            return r8
        L_0x09e7:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r5 = 0
            r1 = r5
        L_0x09ed:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0a10
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x0a0b
            r2 = 5
            if (r3 == r2) goto L_0x0a02
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x09ed
        L_0x0a02:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.CREATOR
            android.os.Parcelable r1 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r1
            goto L_0x09ed
        L_0x0a0b:
            java.lang.String r5 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x09ed
        L_0x0a10:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.auth.api.signin.internal.SignInConfiguration r8 = new com.google.android.gms.auth.api.signin.internal.SignInConfiguration
            r8.<init>(r1, r5)
            return r8
        L_0x0a19:
            int r2 = X.AnonymousClass7Kw.A02(r0)
            r10 = 0
            r11 = r10
            r12 = r10
            r13 = r10
            r9 = r10
            r14 = r10
            r15 = r10
            r18 = r10
            r16 = r10
            r17 = r10
            r20 = 0
            r19 = 0
        L_0x0a2e:
            int r1 = r0.dataPosition()
            if (r1 >= r2) goto L_0x0a82
            int r1 = r0.readInt()
            char r3 = (char) r1
            switch(r3) {
                case 1: goto L_0x0a78;
                case 2: goto L_0x0a40;
                case 3: goto L_0x0a45;
                case 4: goto L_0x0a4a;
                case 5: goto L_0x0a4f;
                case 6: goto L_0x0a54;
                case 7: goto L_0x0a5d;
                case 8: goto L_0x0a7d;
                case 9: goto L_0x0a62;
                case 10: goto L_0x0a67;
                case 11: goto L_0x0a6e;
                case 12: goto L_0x0a73;
                default: goto L_0x0a3c;
            }
        L_0x0a3c:
            X.AnonymousClass7Kw.A0J(r0, r1)
            goto L_0x0a2e
        L_0x0a40:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0a2e
        L_0x0a45:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0a2e
        L_0x0a4a:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0a2e
        L_0x0a4f:
            java.lang.String r13 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0a2e
        L_0x0a54:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r3, r1)
            android.net.Uri r9 = (android.net.Uri) r9
            goto L_0x0a2e
        L_0x0a5d:
            java.lang.String r14 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0a2e
        L_0x0a62:
            java.lang.String r15 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0a2e
        L_0x0a67:
            android.os.Parcelable$Creator r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r18 = X.AnonymousClass7Kw.A0H(r0, r3, r1)
            goto L_0x0a2e
        L_0x0a6e:
            java.lang.String r16 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0a2e
        L_0x0a73:
            java.lang.String r17 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0a2e
        L_0x0a78:
            int r19 = X.AnonymousClass7Kw.A04(r0, r1)
            goto L_0x0a2e
        L_0x0a7d:
            long r20 = X.AnonymousClass7Kw.A07(r0, r1)
            goto L_0x0a2e
        L_0x0a82:
            X.AnonymousClass7Kw.A0I(r0, r2)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r8 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r8
        L_0x0a8b:
            int r2 = X.AnonymousClass7Kw.A02(r0)
            r13 = 0
            r9 = r13
            r10 = r13
            r11 = r13
            r3 = r13
            r12 = r13
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x0a9c:
            int r1 = r0.dataPosition()
            if (r1 >= r2) goto L_0x0af4
            int r4 = r0.readInt()
            char r1 = (char) r4
            switch(r1) {
                case 1: goto L_0x0aef;
                case 2: goto L_0x0ac9;
                case 3: goto L_0x0ad0;
                case 4: goto L_0x0aae;
                case 5: goto L_0x0ab7;
                case 6: goto L_0x0ac0;
                case 7: goto L_0x0ad9;
                case 8: goto L_0x0ade;
                case 9: goto L_0x0ae3;
                case 10: goto L_0x0aea;
                default: goto L_0x0aaa;
            }
        L_0x0aaa:
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x0a9c
        L_0x0aae:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r16 = X.C18180wK.A1V(r1)
            goto L_0x0a9c
        L_0x0ab7:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r17 = X.C18180wK.A1V(r1)
            goto L_0x0a9c
        L_0x0ac0:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r18 = X.C18180wK.A1V(r1)
            goto L_0x0a9c
        L_0x0ac9:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r13 = X.AnonymousClass7Kw.A0H(r0, r1, r4)
            goto L_0x0a9c
        L_0x0ad0:
            android.os.Parcelable$Creator r1 = android.accounts.Account.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            android.accounts.Account r9 = (android.accounts.Account) r9
            goto L_0x0a9c
        L_0x0ad9:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x0a9c
        L_0x0ade:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x0a9c
        L_0x0ae3:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable.CREATOR
            java.util.ArrayList r3 = X.AnonymousClass7Kw.A0H(r0, r1, r4)
            goto L_0x0a9c
        L_0x0aea:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x0a9c
        L_0x0aef:
            int r15 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x0a9c
        L_0x0af4:
            X.AnonymousClass7Kw.A0I(r0, r2)
            java.util.HashMap r14 = X.AnonymousClass0wJ.A0y()
            if (r3 == 0) goto L_0x0b17
            java.util.Iterator r2 = r3.iterator()
        L_0x0b01:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0b17
            java.lang.Object r1 = r2.next()
            com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable r1 = (com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable) r1
            int r0 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.put(r0, r1)
            goto L_0x0b01
        L_0x0b17:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r8 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r8
        L_0x0b1d:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            java.lang.String r6 = ""
            r5 = 0
            r4 = r6
        L_0x0b25:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x0b4b
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 4
            if (r2 == r1) goto L_0x0b46
            r1 = 7
            if (r2 == r1) goto L_0x0b3d
            r1 = 8
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x0b25
        L_0x0b3d:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r5 = X.AnonymousClass7Kw.A0B(r0, r1, r3)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r5 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r5
            goto L_0x0b25
        L_0x0b46:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x0b25
        L_0x0b4b:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.auth.api.signin.SignInAccount r8 = new com.google.android.gms.auth.api.signin.SignInAccount
            r8.<init>(r5, r6, r4)
            return r8
        L_0x0b54:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r5 = 0
            r4 = r5
        L_0x0b5a:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x0b73
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0b6e
            r1 = 2
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x0b5a
        L_0x0b6e:
            byte[] r5 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x0b5a
        L_0x0b73:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.auth.blockstore.RetrieveBytesResponse$BlockstoreData r8 = new com.google.android.gms.auth.blockstore.RetrieveBytesResponse$BlockstoreData
            r8.<init>(r5, r4)
            return r8
        L_0x0b7c:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r5 = 0
        L_0x0b82:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0ba5
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0ba0
            r2 = 2
            if (r3 == r2) goto L_0x0b97
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x0b82
        L_0x0b97:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r1 = X.C18180wK.A1V(r1)
            goto L_0x0b82
        L_0x0ba0:
            java.util.ArrayList r5 = X.AnonymousClass7Kw.A0G(r0, r4)
            goto L_0x0b82
        L_0x0ba5:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.auth.blockstore.DeleteBytesRequest r8 = new com.google.android.gms.auth.blockstore.DeleteBytesRequest
            r8.<init>(r5, r1)
            return r8
        L_0x0bae:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r5 = 0
        L_0x0bb4:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0bd7
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0bd2
            r2 = 2
            if (r3 == r2) goto L_0x0bc9
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x0bb4
        L_0x0bc9:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r1 = X.C18180wK.A1V(r1)
            goto L_0x0bb4
        L_0x0bd2:
            java.util.ArrayList r5 = X.AnonymousClass7Kw.A0G(r0, r4)
            goto L_0x0bb4
        L_0x0bd7:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.auth.blockstore.RetrieveBytesRequest r8 = new com.google.android.gms.auth.blockstore.RetrieveBytesRequest
            r8.<init>(r5, r1)
            return r8
        L_0x0be0:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r5 = 0
            r4 = r5
        L_0x0be6:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x0c07
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0c02
            r1 = 2
            if (r2 == r1) goto L_0x0bfb
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0be6
        L_0x0bfb:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.blockstore.RetrieveBytesResponse.BlockstoreData.CREATOR
            java.util.ArrayList r4 = X.AnonymousClass7Kw.A0H(r0, r1, r3)
            goto L_0x0be6
        L_0x0c02:
            android.os.Bundle r5 = X.AnonymousClass7Kw.A09(r0, r3)
            goto L_0x0be6
        L_0x0c07:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.auth.blockstore.RetrieveBytesResponse r8 = new com.google.android.gms.auth.blockstore.RetrieveBytesResponse
            r8.<init>(r5, r4)
            return r8
        L_0x0c10:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            java.lang.String r6 = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY"
            r1 = 0
            r5 = 0
        L_0x0c18:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x0c3d
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0c38
            r2 = 2
            if (r3 == r2) goto L_0x0c2f
            r2 = 3
            java.lang.String r6 = X.AnonymousClass7Kw.A0F(r0, r6, r3, r2, r4)
            goto L_0x0c18
        L_0x0c2f:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r1 = X.C18180wK.A1V(r1)
            goto L_0x0c18
        L_0x0c38:
            byte[] r5 = X.AnonymousClass7Kw.A0O(r0, r4)
            goto L_0x0c18
        L_0x0c3d:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.auth.blockstore.StoreBytesData r8 = new com.google.android.gms.auth.blockstore.StoreBytesData
            r8.<init>(r6, r5, r1)
            return r8
        L_0x0c46:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r14 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0c51:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0c81
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x0c6d;
                case 2: goto L_0x0c72;
                case 3: goto L_0x0c63;
                case 4: goto L_0x0c77;
                case 5: goto L_0x0c7c;
                case 6: goto L_0x0c68;
                default: goto L_0x0c5f;
            }
        L_0x0c5f:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0c51
        L_0x0c63:
            java.lang.String r9 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0c51
        L_0x0c68:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0c51
        L_0x0c6d:
            int r11 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0c51
        L_0x0c72:
            long r14 = X.AnonymousClass7Kw.A07(r0, r2)
            goto L_0x0c51
        L_0x0c77:
            int r12 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0c51
        L_0x0c7c:
            int r13 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0c51
        L_0x0c81:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.auth.AccountChangeEvent r8 = new com.google.android.gms.auth.AccountChangeEvent
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x0c8a:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r7 = 0
            r3 = r7
            r1 = 0
            r2 = 0
        L_0x0c92:
            int r4 = r0.dataPosition()
            if (r4 >= r8) goto L_0x0cc5
            int r6 = r0.readInt()
            char r5 = (char) r6
            r4 = 1
            if (r5 == r4) goto L_0x0cc0
            r4 = 2
            if (r5 == r4) goto L_0x0cbb
            r4 = 3
            if (r5 == r4) goto L_0x0cb6
            r4 = 4
            if (r5 == r4) goto L_0x0cad
            X.AnonymousClass7Kw.A0J(r0, r6)
            goto L_0x0c92
        L_0x0cad:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r3 = X.AnonymousClass7Kw.A0B(r0, r3, r6)
            android.accounts.Account r3 = (android.accounts.Account) r3
            goto L_0x0c92
        L_0x0cb6:
            java.lang.String r7 = X.AnonymousClass7Kw.A0E(r0, r6)
            goto L_0x0c92
        L_0x0cbb:
            int r2 = X.AnonymousClass7Kw.A04(r0, r6)
            goto L_0x0c92
        L_0x0cc0:
            int r1 = X.AnonymousClass7Kw.A04(r0, r6)
            goto L_0x0c92
        L_0x0cc5:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.auth.AccountChangeEventsRequest r8 = new com.google.android.gms.auth.AccountChangeEventsRequest
            r8.<init>(r3, r7, r1, r2)
            return r8
        L_0x0cce:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r5 = 0
        L_0x0cd4:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0cf5
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0cf0
            r2 = 2
            if (r3 == r2) goto L_0x0ce9
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x0cd4
        L_0x0ce9:
            android.os.Parcelable$Creator r2 = com.google.android.gms.auth.AccountChangeEvent.CREATOR
            java.util.ArrayList r5 = X.AnonymousClass7Kw.A0H(r0, r2, r4)
            goto L_0x0cd4
        L_0x0cf0:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x0cd4
        L_0x0cf5:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.auth.AccountChangeEventsResponse r8 = new com.google.android.gms.auth.AccountChangeEventsResponse
            r8.<init>(r5, r1)
            return r8
        L_0x0cfe:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r12 = r9
            r11 = r9
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0d09:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0d57
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x0d3c;
                case 2: goto L_0x0d2d;
                case 3: goto L_0x0d41;
                case 4: goto L_0x0d1b;
                case 5: goto L_0x0d24;
                case 6: goto L_0x0d32;
                case 7: goto L_0x0d37;
                default: goto L_0x0d17;
            }
        L_0x0d17:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0d09
        L_0x0d1b:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r14 = X.C18180wK.A1V(r1)
            goto L_0x0d09
        L_0x0d24:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r15 = X.C18180wK.A1V(r1)
            goto L_0x0d09
        L_0x0d2d:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0d09
        L_0x0d32:
            java.util.ArrayList r12 = X.AnonymousClass7Kw.A0G(r0, r2)
            goto L_0x0d09
        L_0x0d37:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0d09
        L_0x0d3c:
            int r13 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0d09
        L_0x0d41:
            int r2 = X.AnonymousClass7Kw.A05(r0, r2)
            if (r2 != 0) goto L_0x0d49
            r9 = 0
            goto L_0x0d09
        L_0x0d49:
            r1 = 8
            X.AnonymousClass7Kw.A0K(r0, r2, r1)
            long r1 = r0.readLong()
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            goto L_0x0d09
        L_0x0d57:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.auth.TokenData r8 = new com.google.android.gms.auth.TokenData
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L_0x0d60:
            int r4 = X.AnonymousClass7Kw.A02(r0)
            r10 = 0
            r12 = 0
            r9 = 0
        L_0x0d69:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x0d94
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0d8b
            r1 = 2
            if (r2 == r1) goto L_0x0d86
            r1 = 3
            if (r2 == r1) goto L_0x0d81
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0d69
        L_0x0d81:
            long r10 = X.AnonymousClass7Kw.A07(r0, r3)
            goto L_0x0d69
        L_0x0d86:
            long r12 = X.AnonymousClass7Kw.A07(r0, r3)
            goto L_0x0d69
        L_0x0d8b:
            int r1 = X.AnonymousClass7Kw.A04(r0, r3)
            boolean r9 = X.C18180wK.A1V(r1)
            goto L_0x0d69
        L_0x0d94:
            X.AnonymousClass7Kw.A0I(r0, r4)
            com.google.android.gms.clearcut.zzc r8 = new com.google.android.gms.clearcut.zzc
            r8.<init>(r9, r10, r12)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.PCreatorCreatorShape4S0000000_I2_4.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new FbPayAdditionalField[i];
            case 1:
                return new FbPayBankAccount[i];
            case 2:
                return new FbPayCreditCard[i];
            case 3:
                return new FbPayNewCreditCardOption[i];
            case 4:
                return new FbPayNewPayPalOption[i];
            case 5:
                return new FbPayPayPal[i];
            case 6:
                return new FbPayPaymentDefaultInfo[i];
            case 7:
                return new FbPayPaymentMethod[i];
            case 8:
                return new FbPayShopPay[i];
            case 9:
                return new FBPayHubRiskEnforcementData[i];
            case 10:
                return new UpcomingPayout[i];
            case 11:
                return new ClientSuppressionPolicy[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new FBPayLoggerData[i];
            case 13:
                return new LoggingContext[i];
            case 14:
                return new LoggingPolicy[i];
            case 15:
                return new FBPayIcon[i];
            case 16:
                return new TooltipInfo[i];
            case LangUtils.HASH_SEED /*17*/:
                return new Address[i];
            case 18:
                return new CardDetails[i];
            case 19:
                return new Contact[i];
            case 20:
                return new Email[i];
            case 21:
                return new Phone[i];
            case 22:
                return new W3CCardDetail[i];
            case 23:
                return new FbFormatExtension[i];
            case 24:
                return new DrmInitData[i];
            case 25:
                return new DrmInitData.SchemeData[i];
            case Rfc3492Idn.tmax /*26*/:
                return new MdtaMetadataEntry[i];
            case 27:
                return new Metadata[i];
            case 28:
                return new EventMessage[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new PictureFrame[i];
            case 30:
                return new VorbisComment[i];
            case 31:
                return new IcyHeaders[i];
            case 32:
                return new IcyInfo[i];
            case 33:
                return new ApicFrame[i];
            case 34:
                return new BinaryFrame[i];
            case 35:
                return new ChapterFrame[i];
            case Rfc3492Idn.base /*36*/:
                return new ChapterTocFrame[i];
            case LangUtils.HASH_OFFSET /*37*/:
                return new CommentFrame[i];
            case Rfc3492Idn.skew /*38*/:
                return new GeobFrame[i];
            case 39:
                return new InternalFrame[i];
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                return new MlltFrame[i];
            case Seq.NULL_REFNUM /*41*/:
                return new PrivFrame[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new TextInformationFrame[i];
            case 43:
                return new UrlLinkFrame[i];
            case 44:
                return new SmtaMetadataEntry[i];
            case 45:
                return new PrivateCommand[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return new SpliceInsertCommand[i];
            case 47:
                return new SpliceNullCommand[i];
            case 48:
                return new SpliceScheduleCommand[i];
            case 49:
                return new TimeSignalCommand[i];
            case AnimationSpecKt.IDLE_DURATION /*50*/:
                return new CameraMotionData[i];
            case 51:
                return new StreamKey[i];
            case 52:
                return new Requirements[i];
            case 53:
                return new DefaultTrackSelector$Parameters[i];
            case 54:
                return new DefaultTrackSelector$SelectionOverride[i];
            case 55:
                return new ColorInfo[i];
            case 56:
                return new FlexboxLayout$LayoutParams[i];
            case 57:
                return new FlexboxLayoutManager.LayoutParams[i];
            case 58:
                return new FlexboxLayoutManager.SavedState[i];
            case 59:
                return new zzl[i];
            case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /*60*/:
                return new zzp[i];
            case 61:
                return new zzs[i];
            case 62:
                return new zzt[i];
            case StringTreeSet.PAYLOAD_MASK:
                return new DeviceMetaData[i];
            case 64:
                return new Credential[i];
            case 65:
                return new CredentialPickerConfig[i];
            case 66:
                return new CredentialRequest[i];
            case 67:
                return new HintRequest[i];
            case 68:
                return new IdToken[i];
            case 69:
                return new BeginSignInRequest[i];
            case LineChartView.MARGIN_TICKS /*70*/:
                return new BeginSignInResult[i];
            case 71:
                return new GetPhoneNumberHintIntentRequest[i];
            case Rfc3492Idn.initial_bias /*72*/:
                return new GetSignInIntentRequest[i];
            case 73:
                return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
            case 74:
                return new BeginSignInRequest.PasskeysRequestOptions[i];
            case 75:
                return new BeginSignInRequest.PasswordRequestOptions[i];
            case 76:
                return new SaveAccountLinkingTokenRequest[i];
            case 77:
                return new SaveAccountLinkingTokenResult[i];
            case 78:
                return new SavePasswordRequest[i];
            case 79:
                return new SavePasswordResult[i];
            case 80:
                return new SignInCredential[i];
            case 81:
                return new SignInPassword[i];
            case 82:
                return new ProxyRequest[i];
            case 83:
                return new ProxyResponse[i];
            case 84:
                return new GoogleSignInOptionsExtensionParcelable[i];
            case 85:
                return new SignInConfiguration[i];
            case 86:
                return new GoogleSignInAccount[i];
            case 87:
                return new GoogleSignInOptions[i];
            case 88:
                return new SignInAccount[i];
            case 89:
                return new RetrieveBytesResponse.BlockstoreData[i];
            case 90:
                return new DeleteBytesRequest[i];
            case 91:
                return new RetrieveBytesRequest[i];
            case 92:
                return new RetrieveBytesResponse[i];
            case 93:
                return new StoreBytesData[i];
            case 94:
                return new AccountChangeEvent[i];
            case 95:
                return new AccountChangeEventsRequest[i];
            case 96:
                return new AccountChangeEventsResponse[i];
            case 97:
                return new TokenData[i];
            case 98:
                return new zzc[i];
            default:
                return new zze[i];
        }
    }
}
