package com.facebook.redex;

import X.C122167Ky;
import android.os.Parcel;
import android.os.Parcelable;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.impl.client.cache.CacheConfig;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.common.internal.zax;
import com.google.android.gms.common.internal.zzaj;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.converter.zac;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zam;
import com.google.android.gms.common.server.response.zan;
import com.google.android.gms.common.stats.WakeLockEvent;
import com.google.android.gms.common.zzn;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import com.google.android.gms.fido.fido2.api.common.zzaa;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzat;
import com.google.android.gms.fido.fido2.api.common.zze;
import com.google.android.gms.fido.fido2.api.common.zzp;
import com.google.android.gms.fido.fido2.api.common.zzr;
import com.google.android.gms.fido.fido2.api.common.zzw;
import com.google.android.gms.fido.fido2.api.common.zzy;
import com.google.android.gms.fido.sourcedevice.SourceDirectTransferResult;
import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.auth.zzaz;
import com.google.android.gms.internal.auth.zzbb;
import com.google.android.gms.internal.auth.zzbd;
import com.google.android.gms.internal.auth.zzbf;
import com.google.android.gms.internal.auth.zzcb;
import com.google.android.gms.internal.location.zzac;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzbg;
import com.google.android.gms.internal.location.zzl;
import com.google.android.gms.internal.p001authapi.zbp;
import com.google.android.gms.internal.p001authapi.zbu;
import com.instagram.debug.devoptions.cam.AnimationSpecKt;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.debug.devoptions.debughead.linechart.LineChartView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

public class PCreatorCreatorShape5S0000000_I2_5 implements Parcelable.Creator {
    public final int A00;

    public PCreatorCreatorShape5S0000000_I2_5(int i) {
        this.A00 = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.os.Parcel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: com.google.android.gms.fido.u2f.api.common.ErrorCode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: com.google.android.gms.fido.fido2.api.common.ErrorCode[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: com.google.android.gms.fido.fido2.api.common.ErrorCode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v58, resolved type: com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v53, resolved type: com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v66, resolved type: com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v59, resolved type: com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v67, resolved type: com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v60, resolved type: com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v78, resolved type: com.google.android.gms.fido.fido2.api.common.Attachment[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v73, resolved type: com.google.android.gms.fido.fido2.api.common.Attachment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v79, resolved type: com.google.android.gms.fido.common.Transport[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v74, resolved type: com.google.android.gms.fido.common.Transport} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v110, resolved type: com.google.android.gms.common.data.DataHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v116, resolved type: com.google.android.gms.fido.u2f.api.common.ErrorCode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v117, resolved type: com.google.android.gms.fido.u2f.api.common.ErrorCode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v118, resolved type: com.google.android.gms.fido.u2f.api.common.ErrorCode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v119, resolved type: com.google.android.gms.fido.u2f.api.common.ErrorCode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v120, resolved type: com.google.android.gms.fido.u2f.api.common.ErrorCode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v121, resolved type: com.google.android.gms.fido.u2f.api.common.ErrorCode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v122, resolved type: com.google.android.gms.fido.u2f.api.common.ErrorCode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v123, resolved type: com.google.android.gms.fido.u2f.api.common.ErrorCode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v124, resolved type: com.google.android.gms.fido.u2f.api.common.ErrorCode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v125, resolved type: com.google.android.gms.common.api.Scope} */
    /* JADX WARNING: CFG modification limit reached, blocks count: 1596 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r28) {
        /*
            r27 = this;
            r0 = r27
            int r1 = r0.A00
            r0 = r28
            switch(r1) {
                case 0: goto L_0x004d;
                case 1: goto L_0x006c;
                case 2: goto L_0x00be;
                case 3: goto L_0x00f9;
                case 4: goto L_0x017e;
                case 5: goto L_0x01bb;
                case 6: goto L_0x01e3;
                case 7: goto L_0x0213;
                case 8: goto L_0x026a;
                case 9: goto L_0x02b2;
                case 10: goto L_0x0307;
                case 11: goto L_0x034b;
                case 12: goto L_0x039c;
                case 13: goto L_0x03c1;
                case 14: goto L_0x03c7;
                case 15: goto L_0x040f;
                case 16: goto L_0x045e;
                case 17: goto L_0x04f1;
                case 18: goto L_0x0523;
                case 19: goto L_0x0553;
                case 20: goto L_0x058a;
                case 21: goto L_0x05ed;
                case 22: goto L_0x0628;
                case 23: goto L_0x065b;
                case 24: goto L_0x0694;
                case 25: goto L_0x06e2;
                case 26: goto L_0x0719;
                case 27: goto L_0x079e;
                case 28: goto L_0x07dc;
                case 29: goto L_0x0814;
                case 30: goto L_0x0869;
                case 31: goto L_0x08a4;
                case 32: goto L_0x08ec;
                case 33: goto L_0x091b;
                case 34: goto L_0x0940;
                case 35: goto L_0x0959;
                case 36: goto L_0x0972;
                case 37: goto L_0x0991;
                case 38: goto L_0x0a0e;
                case 39: goto L_0x0a6e;
                case 40: goto L_0x0aa7;
                case 41: goto L_0x0ad9;
                case 42: goto L_0x0b4b;
                case 43: goto L_0x0b7c;
                case 44: goto L_0x0b8b;
                case 45: goto L_0x0bc5;
                case 46: goto L_0x0bee;
                case 47: goto L_0x0c13;
                case 48: goto L_0x0c3b;
                case 49: goto L_0x0c54;
                case 50: goto L_0x0c63;
                case 51: goto L_0x0c8a;
                case 52: goto L_0x0cc3;
                case 53: goto L_0x0ce8;
                case 54: goto L_0x0d1e;
                case 55: goto L_0x0d9b;
                case 56: goto L_0x0dc9;
                case 57: goto L_0x0e12;
                case 58: goto L_0x0e52;
                case 59: goto L_0x0e7a;
                case 60: goto L_0x0ec4;
                case 61: goto L_0x0f03;
                case 62: goto L_0x0f42;
                case 63: goto L_0x0f51;
                case 64: goto L_0x0f92;
                case 65: goto L_0x0fb9;
                case 66: goto L_0x0fd2;
                case 67: goto L_0x0ff4;
                case 68: goto L_0x1013;
                case 69: goto L_0x105e;
                case 70: goto L_0x1077;
                case 71: goto L_0x109d;
                case 72: goto L_0x10cf;
                case 73: goto L_0x111c;
                case 74: goto L_0x113d;
                case 75: goto L_0x116e;
                case 76: goto L_0x118f;
                case 77: goto L_0x11b7;
                case 78: goto L_0x11f9;
                case 79: goto L_0x1208;
                case 80: goto L_0x1242;
                case 81: goto L_0x1297;
                case 82: goto L_0x12c8;
                case 83: goto L_0x12fd;
                case 84: goto L_0x1350;
                case 85: goto L_0x1390;
                case 86: goto L_0x13b9;
                case 87: goto L_0x13e2;
                case 88: goto L_0x140c;
                case 89: goto L_0x1445;
                case 90: goto L_0x146f;
                case 91: goto L_0x14a8;
                case 92: goto L_0x14e5;
                case 93: goto L_0x150d;
                case 94: goto L_0x156c;
                case 95: goto L_0x1595;
                case 96: goto L_0x161d;
                case 97: goto L_0x1668;
                case 98: goto L_0x16c5;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r9 = X.AnonymousClass7Kw.A02(r0)
            r8 = 1
            r2 = 0
            r7 = r2
            r6 = r2
            r1 = 1
        L_0x0012:
            int r3 = r0.dataPosition()
            if (r3 >= r9) goto L_0x0044
            int r5 = r0.readInt()
            char r4 = (char) r5
            if (r4 == r8) goto L_0x003f
            r3 = 2
            if (r4 == r3) goto L_0x0036
            r3 = 3
            if (r4 == r3) goto L_0x0031
            r3 = 4
            if (r4 == r3) goto L_0x002c
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x0012
        L_0x002c:
            android.os.IBinder r6 = X.AnonymousClass7Kw.A0A(r0, r5)
            goto L_0x0012
        L_0x0031:
            android.os.IBinder r7 = X.AnonymousClass7Kw.A0A(r0, r5)
            goto L_0x0012
        L_0x0036:
            android.os.Parcelable$Creator r2 = com.google.android.gms.internal.location.zzj.CREATOR
            android.os.Parcelable r2 = X.AnonymousClass7Kw.A0B(r0, r2, r5)
            com.google.android.gms.internal.location.zzj r2 = (com.google.android.gms.internal.location.zzj) r2
            goto L_0x0012
        L_0x003f:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x0012
        L_0x0044:
            X.AnonymousClass7Kw.A0I(r0, r9)
            com.google.android.gms.internal.location.zzl r8 = new com.google.android.gms.internal.location.zzl
            r8.<init>(r7, r6, r2, r1)
            return r8
        L_0x004d:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r5 = 0
        L_0x0053:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x1183
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0067
            r2 = 2
            java.lang.String r5 = X.AnonymousClass7Kw.A0F(r0, r5, r3, r2, r4)
            goto L_0x0053
        L_0x0067:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x0053
        L_0x006c:
            int r4 = X.AnonymousClass7Kw.A02(r0)
            r11 = 0
            r9 = r11
            r10 = r11
            r12 = 0
            r13 = 0
        L_0x0075:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x00b5
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x00b0
            r1 = 2
            if (r2 == r1) goto L_0x00ab
            r1 = 3
            if (r2 == r1) goto L_0x00a2
            r1 = 4
            if (r2 == r1) goto L_0x0099
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r1) goto L_0x0094
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0075
        L_0x0094:
            int r12 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x0075
        L_0x0099:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.ConnectionResult.CREATOR
            android.os.Parcelable r10 = X.AnonymousClass7Kw.A0B(r0, r1, r3)
            com.google.android.gms.common.ConnectionResult r10 = (com.google.android.gms.common.ConnectionResult) r10
            goto L_0x0075
        L_0x00a2:
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r3)
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
            goto L_0x0075
        L_0x00ab:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x0075
        L_0x00b0:
            int r13 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x0075
        L_0x00b5:
            X.AnonymousClass7Kw.A0I(r0, r4)
            com.google.android.gms.common.api.Status r8 = new com.google.android.gms.common.api.Status
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x00be:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r6 = 0
            r3 = 0
        L_0x00c5:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x00f0
            int r5 = r0.readInt()
            char r4 = (char) r5
            r2 = 1
            if (r4 == r2) goto L_0x00eb
            r2 = 2
            if (r4 == r2) goto L_0x00e2
            r2 = 3
            if (r4 == r2) goto L_0x00dd
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x00c5
        L_0x00dd:
            int r3 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x00c5
        L_0x00e2:
            android.os.Parcelable$Creator r2 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r6 = X.AnonymousClass7Kw.A0B(r0, r2, r5)
            android.os.ParcelFileDescriptor r6 = (android.os.ParcelFileDescriptor) r6
            goto L_0x00c5
        L_0x00eb:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x00c5
        L_0x00f0:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.common.data.BitmapTeleporter r8 = new com.google.android.gms.common.data.BitmapTeleporter
            r8.<init>(r6, r1, r3)
            return r8
        L_0x00f9:
            int r4 = X.AnonymousClass7Kw.A02(r0)
            r11 = 0
            r10 = r11
            r9 = r11
            r12 = 0
            r13 = 0
        L_0x0102:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x013e
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0139
            r1 = 2
            if (r2 == r1) goto L_0x0130
            r1 = 3
            if (r2 == r1) goto L_0x012b
            r1 = 4
            if (r2 == r1) goto L_0x0126
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r1) goto L_0x0121
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0102
        L_0x0121:
            int r12 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x0102
        L_0x0126:
            android.os.Bundle r9 = X.AnonymousClass7Kw.A09(r0, r3)
            goto L_0x0102
        L_0x012b:
            int r13 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x0102
        L_0x0130:
            android.os.Parcelable$Creator r1 = android.database.CursorWindow.CREATOR
            java.lang.Object[] r10 = X.AnonymousClass7Kw.A0Q(r0, r1, r3)
            android.database.CursorWindow[] r10 = (android.database.CursorWindow[]) r10
            goto L_0x0102
        L_0x0139:
            java.lang.String[] r11 = X.AnonymousClass7Kw.A0R(r0, r3)
            goto L_0x0102
        L_0x013e:
            X.AnonymousClass7Kw.A0I(r0, r4)
            com.google.android.gms.common.data.DataHolder r8 = new com.google.android.gms.common.data.DataHolder
            r8.<init>(r9, r10, r11, r12, r13)
            android.os.Bundle r0 = X.C18180wK.A06()
            r8.A00 = r0
            r6 = 0
            r3 = 0
        L_0x014e:
            java.lang.String[] r2 = r8.A07
            int r0 = r2.length
            if (r3 >= r0) goto L_0x015d
            android.os.Bundle r1 = r8.A00
            r0 = r2[r3]
            r1.putInt(r0, r3)
            int r3 = r3 + 1
            goto L_0x014e
        L_0x015d:
            android.database.CursorWindow[] r5 = r8.A06
            int r4 = r5.length
            int[] r0 = new int[r4]
            r8.A02 = r0
            r3 = 0
        L_0x0165:
            if (r6 >= r4) goto L_0x118b
            int[] r0 = r8.A02
            r0[r6] = r3
            r0 = r5[r6]
            int r2 = r0.getStartPosition()
            r0 = r5[r6]
            int r1 = r0.getNumRows()
            int r0 = r3 - r2
            int r1 = r1 - r0
            int r3 = r3 + r1
            int r6 = r6 + 1
            goto L_0x0165
        L_0x017e:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r7 = 0
            r3 = 0
            r6 = 0
        L_0x0186:
            int r2 = r0.dataPosition()
            if (r2 >= r8) goto L_0x01b2
            int r5 = r0.readInt()
            char r4 = (char) r5
            r2 = 1
            if (r4 == r2) goto L_0x01ad
            r2 = 2
            if (r4 == r2) goto L_0x01a4
            r2 = 3
            if (r4 == r2) goto L_0x019f
            int r6 = X.AnonymousClass7Kw.A06(r0, r4, r5, r6)
            goto L_0x0186
        L_0x019f:
            int r3 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x0186
        L_0x01a4:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r7 = X.AnonymousClass7Kw.A0B(r0, r2, r5)
            android.net.Uri r7 = (android.net.Uri) r7
            goto L_0x0186
        L_0x01ad:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x0186
        L_0x01b2:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.common.images.WebImage r8 = new com.google.android.gms.common.images.WebImage
            r8.<init>(r7, r1, r3, r6)
            return r8
        L_0x01bb:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r5 = 0
        L_0x01c1:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x01da
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x01d5
            r2 = 2
            java.lang.String r5 = X.AnonymousClass7Kw.A0F(r0, r5, r3, r2, r4)
            goto L_0x01c1
        L_0x01d5:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x01c1
        L_0x01da:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.common.internal.ClientIdentity r8 = new com.google.android.gms.common.internal.ClientIdentity
            r8.<init>(r1, r5)
            return r8
        L_0x01e3:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r5 = 0
        L_0x01e9:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x020a
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0205
            r2 = 2
            if (r3 == r2) goto L_0x01fe
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x01e9
        L_0x01fe:
            android.os.Parcelable$Creator r2 = com.google.android.gms.common.internal.MethodInvocation.CREATOR
            java.util.ArrayList r5 = X.AnonymousClass7Kw.A0H(r0, r2, r4)
            goto L_0x01e9
        L_0x0205:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x01e9
        L_0x020a:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.common.internal.TelemetryData r8 = new com.google.android.gms.common.internal.TelemetryData
            r8.<init>(r5, r1)
            return r8
        L_0x0213:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r16 = 0
            r18 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = -1
        L_0x0222:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0261
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x023e;
                case 2: goto L_0x0243;
                case 3: goto L_0x0248;
                case 4: goto L_0x024d;
                case 5: goto L_0x0252;
                case 6: goto L_0x0234;
                case 7: goto L_0x0239;
                case 8: goto L_0x0257;
                case 9: goto L_0x025c;
                default: goto L_0x0230;
            }
        L_0x0230:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0222
        L_0x0234:
            java.lang.String r9 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0222
        L_0x0239:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0222
        L_0x023e:
            int r11 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0222
        L_0x0243:
            int r12 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0222
        L_0x0248:
            int r13 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0222
        L_0x024d:
            long r16 = X.AnonymousClass7Kw.A07(r0, r2)
            goto L_0x0222
        L_0x0252:
            long r18 = X.AnonymousClass7Kw.A07(r0, r2)
            goto L_0x0222
        L_0x0257:
            int r14 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0222
        L_0x025c:
            int r15 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0222
        L_0x0261:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.common.internal.MethodInvocation r8 = new com.google.android.gms.common.internal.MethodInvocation
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r18)
            return r8
        L_0x026a:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r2 = 0
            r4 = r2
            r1 = 0
            r3 = 0
        L_0x0272:
            int r5 = r0.dataPosition()
            if (r5 >= r8) goto L_0x02a9
            int r7 = r0.readInt()
            char r6 = (char) r7
            r5 = 1
            if (r6 == r5) goto L_0x02a4
            r5 = 2
            if (r6 == r5) goto L_0x029b
            r5 = 3
            if (r6 == r5) goto L_0x0296
            r5 = 4
            if (r6 == r5) goto L_0x028d
            X.AnonymousClass7Kw.A0J(r0, r7)
            goto L_0x0272
        L_0x028d:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r4 = X.AnonymousClass7Kw.A0B(r0, r4, r7)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r4 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r4
            goto L_0x0272
        L_0x0296:
            int r3 = X.AnonymousClass7Kw.A04(r0, r7)
            goto L_0x0272
        L_0x029b:
            android.os.Parcelable$Creator r2 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = X.AnonymousClass7Kw.A0B(r0, r2, r7)
            android.accounts.Account r2 = (android.accounts.Account) r2
            goto L_0x0272
        L_0x02a4:
            int r1 = X.AnonymousClass7Kw.A04(r0, r7)
            goto L_0x0272
        L_0x02a9:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.common.internal.zat r8 = new com.google.android.gms.common.internal.zat
            r8.<init>(r2, r4, r1, r3)
            return r8
        L_0x02b2:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x02bb:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x02fe
            int r4 = r0.readInt()
            char r2 = (char) r4
            r1 = 1
            if (r2 == r1) goto L_0x02f9
            r1 = 2
            if (r2 == r1) goto L_0x02f4
            r1 = 3
            if (r2 == r1) goto L_0x02eb
            r1 = 4
            if (r2 == r1) goto L_0x02e2
            r1 = 5
            if (r2 == r1) goto L_0x02d9
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x02bb
        L_0x02d9:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r13 = X.C18180wK.A1V(r1)
            goto L_0x02bb
        L_0x02e2:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r12 = X.C18180wK.A1V(r1)
            goto L_0x02bb
        L_0x02eb:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.ConnectionResult.CREATOR
            android.os.Parcelable r10 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.common.ConnectionResult r10 = (com.google.android.gms.common.ConnectionResult) r10
            goto L_0x02bb
        L_0x02f4:
            android.os.IBinder r9 = X.AnonymousClass7Kw.A0A(r0, r4)
            goto L_0x02bb
        L_0x02f9:
            int r11 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x02bb
        L_0x02fe:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.common.internal.zav r8 = new com.google.android.gms.common.internal.zav
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x0307:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r7 = 0
            r2 = 0
            r3 = 0
        L_0x030f:
            int r4 = r0.dataPosition()
            if (r4 >= r8) goto L_0x0342
            int r6 = r0.readInt()
            char r5 = (char) r6
            r4 = 1
            if (r5 == r4) goto L_0x033d
            r4 = 2
            if (r5 == r4) goto L_0x0338
            r4 = 3
            if (r5 == r4) goto L_0x0333
            r4 = 4
            if (r5 == r4) goto L_0x032a
            X.AnonymousClass7Kw.A0J(r0, r6)
            goto L_0x030f
        L_0x032a:
            android.os.Parcelable$Creator r4 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r7 = X.AnonymousClass7Kw.A0Q(r0, r4, r6)
            com.google.android.gms.common.api.Scope[] r7 = (com.google.android.gms.common.api.Scope[]) r7
            goto L_0x030f
        L_0x0333:
            int r3 = X.AnonymousClass7Kw.A04(r0, r6)
            goto L_0x030f
        L_0x0338:
            int r2 = X.AnonymousClass7Kw.A04(r0, r6)
            goto L_0x030f
        L_0x033d:
            int r1 = X.AnonymousClass7Kw.A04(r0, r6)
            goto L_0x030f
        L_0x0342:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.common.internal.zax r8 = new com.google.android.gms.common.internal.zax
            r8.<init>(r7, r1, r2, r3)
            return r8
        L_0x034b:
            int r4 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r12 = 0
            r13 = 0
            r10 = 0
            r11 = 0
        L_0x0354:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x0393
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x038e
            r1 = 2
            if (r2 == r1) goto L_0x0385
            r1 = 3
            if (r2 == r1) goto L_0x037c
            r1 = 4
            if (r2 == r1) goto L_0x0377
            r1 = 5
            if (r2 == r1) goto L_0x0372
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0354
        L_0x0372:
            int r11 = X.AnonymousClass7Kw.A03(r0, r3)
            goto L_0x0354
        L_0x0377:
            int r10 = X.AnonymousClass7Kw.A03(r0, r3)
            goto L_0x0354
        L_0x037c:
            int r1 = X.AnonymousClass7Kw.A04(r0, r3)
            boolean r13 = X.C18180wK.A1V(r1)
            goto L_0x0354
        L_0x0385:
            int r1 = X.AnonymousClass7Kw.A04(r0, r3)
            boolean r12 = X.C18180wK.A1V(r1)
            goto L_0x0354
        L_0x038e:
            int r9 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x0354
        L_0x0393:
            X.AnonymousClass7Kw.A0I(r0, r4)
            com.google.android.gms.common.internal.RootTelemetryConfiguration r8 = new com.google.android.gms.common.internal.RootTelemetryConfiguration
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x039c:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
        L_0x03a1:
            int r2 = r0.dataPosition()
            if (r2 >= r5) goto L_0x03b8
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x03b3
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x03a1
        L_0x03b3:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x03a1
        L_0x03b8:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.common.internal.zzaj r8 = new com.google.android.gms.common.internal.zzaj
            r8.<init>(r1)
            return r8
        L_0x03c1:
            com.google.android.gms.common.internal.BinderWrapper r8 = new com.google.android.gms.common.internal.BinderWrapper
            r8.<init>(r0)
            return r8
        L_0x03c7:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r7 = 0
            r1 = r7
            r3 = r7
            r2 = 0
        L_0x03cf:
            int r4 = r0.dataPosition()
            if (r4 >= r8) goto L_0x0406
            int r6 = r0.readInt()
            char r5 = (char) r6
            r4 = 1
            if (r5 == r4) goto L_0x0401
            r4 = 2
            if (r5 == r4) goto L_0x03f8
            r4 = 3
            if (r5 == r4) goto L_0x03f3
            r4 = 4
            if (r5 == r4) goto L_0x03ea
            X.AnonymousClass7Kw.A0J(r0, r6)
            goto L_0x03cf
        L_0x03ea:
            android.os.Parcelable$Creator r3 = com.google.android.gms.common.internal.ConnectionTelemetryConfiguration.CREATOR
            android.os.Parcelable r3 = X.AnonymousClass7Kw.A0B(r0, r3, r6)
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r3 = (com.google.android.gms.common.internal.ConnectionTelemetryConfiguration) r3
            goto L_0x03cf
        L_0x03f3:
            int r2 = X.AnonymousClass7Kw.A04(r0, r6)
            goto L_0x03cf
        L_0x03f8:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.Feature.CREATOR
            java.lang.Object[] r1 = X.AnonymousClass7Kw.A0Q(r0, r1, r6)
            com.google.android.gms.common.Feature[] r1 = (com.google.android.gms.common.Feature[]) r1
            goto L_0x03cf
        L_0x0401:
            android.os.Bundle r7 = X.AnonymousClass7Kw.A09(r0, r6)
            goto L_0x03cf
        L_0x0406:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.common.internal.zzj r8 = new com.google.android.gms.common.internal.zzj
            r8.<init>(r7, r3, r1, r2)
            return r8
        L_0x040f:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r11 = r9
            r13 = 0
            r14 = 0
            r12 = 0
        L_0x0419:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0455
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x042b;
                case 2: goto L_0x0443;
                case 3: goto L_0x044c;
                case 4: goto L_0x0434;
                case 5: goto L_0x043e;
                case 6: goto L_0x0439;
                default: goto L_0x0427;
            }
        L_0x0427:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0419
        L_0x042b:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.internal.RootTelemetryConfiguration.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.common.internal.RootTelemetryConfiguration r9 = (com.google.android.gms.common.internal.RootTelemetryConfiguration) r9
            goto L_0x0419
        L_0x0434:
            int[] r10 = X.AnonymousClass7Kw.A0P(r0, r2)
            goto L_0x0419
        L_0x0439:
            int[] r11 = X.AnonymousClass7Kw.A0P(r0, r2)
            goto L_0x0419
        L_0x043e:
            int r12 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0419
        L_0x0443:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r13 = X.C18180wK.A1V(r1)
            goto L_0x0419
        L_0x044c:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r14 = X.C18180wK.A1V(r1)
            goto L_0x0419
        L_0x0455:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r8 = new com.google.android.gms.common.internal.ConnectionTelemetryConfiguration
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x045e:
            int r2 = X.AnonymousClass7Kw.A02(r0)
            r12 = 0
            r11 = r12
            r3 = r12
            r10 = r12
            r9 = r12
            r14 = r12
            r15 = r12
            r13 = r12
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r20 = 0
            r22 = 0
        L_0x0476:
            int r1 = r0.dataPosition()
            if (r1 >= r2) goto L_0x04e6
            int r1 = r0.readInt()
            char r4 = (char) r1
            switch(r4) {
                case 1: goto L_0x0488;
                case 2: goto L_0x048d;
                case 3: goto L_0x0492;
                case 4: goto L_0x0497;
                case 5: goto L_0x049c;
                case 6: goto L_0x04a1;
                case 7: goto L_0x04aa;
                case 8: goto L_0x04af;
                case 9: goto L_0x0484;
                case 10: goto L_0x04b8;
                case 11: goto L_0x04c1;
                case 12: goto L_0x04ca;
                case 13: goto L_0x04d3;
                case 14: goto L_0x04d8;
                case 15: goto L_0x04e1;
                default: goto L_0x0484;
            }
        L_0x0484:
            X.AnonymousClass7Kw.A0J(r0, r1)
            goto L_0x0476
        L_0x0488:
            int r17 = X.AnonymousClass7Kw.A04(r0, r1)
            goto L_0x0476
        L_0x048d:
            int r18 = X.AnonymousClass7Kw.A04(r0, r1)
            goto L_0x0476
        L_0x0492:
            int r19 = X.AnonymousClass7Kw.A04(r0, r1)
            goto L_0x0476
        L_0x0497:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0476
        L_0x049c:
            android.os.IBinder r11 = X.AnonymousClass7Kw.A0A(r0, r1)
            goto L_0x0476
        L_0x04a1:
            android.os.Parcelable$Creator r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r3 = X.AnonymousClass7Kw.A0Q(r0, r3, r1)
            com.google.android.gms.common.api.Scope[] r3 = (com.google.android.gms.common.api.Scope[]) r3
            goto L_0x0476
        L_0x04aa:
            android.os.Bundle r10 = X.AnonymousClass7Kw.A09(r0, r1)
            goto L_0x0476
        L_0x04af:
            android.os.Parcelable$Creator r4 = android.accounts.Account.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r4, r1)
            android.accounts.Account r9 = (android.accounts.Account) r9
            goto L_0x0476
        L_0x04b8:
            android.os.Parcelable$Creator r4 = com.google.android.gms.common.Feature.CREATOR
            java.lang.Object[] r14 = X.AnonymousClass7Kw.A0Q(r0, r4, r1)
            com.google.android.gms.common.Feature[] r14 = (com.google.android.gms.common.Feature[]) r14
            goto L_0x0476
        L_0x04c1:
            android.os.Parcelable$Creator r4 = com.google.android.gms.common.Feature.CREATOR
            java.lang.Object[] r15 = X.AnonymousClass7Kw.A0Q(r0, r4, r1)
            com.google.android.gms.common.Feature[] r15 = (com.google.android.gms.common.Feature[]) r15
            goto L_0x0476
        L_0x04ca:
            int r1 = X.AnonymousClass7Kw.A04(r0, r1)
            boolean r21 = X.C18180wK.A1V(r1)
            goto L_0x0476
        L_0x04d3:
            int r20 = X.AnonymousClass7Kw.A04(r0, r1)
            goto L_0x0476
        L_0x04d8:
            int r1 = X.AnonymousClass7Kw.A04(r0, r1)
            boolean r22 = X.C18180wK.A1V(r1)
            goto L_0x0476
        L_0x04e1:
            java.lang.String r13 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0476
        L_0x04e6:
            X.AnonymousClass7Kw.A0I(r0, r2)
            com.google.android.gms.common.internal.GetServiceRequest r8 = new com.google.android.gms.common.internal.GetServiceRequest
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r8
        L_0x04f1:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r2 = 0
        L_0x04f7:
            int r3 = r0.dataPosition()
            if (r3 >= r6) goto L_0x051a
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x0515
            r3 = 2
            if (r4 == r3) goto L_0x050c
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x04f7
        L_0x050c:
            android.os.Parcelable$Creator r2 = com.google.android.gms.common.server.converter.StringToIntConverter.CREATOR
            android.os.Parcelable r2 = X.AnonymousClass7Kw.A0B(r0, r2, r5)
            com.google.android.gms.common.server.converter.StringToIntConverter r2 = (com.google.android.gms.common.server.converter.StringToIntConverter) r2
            goto L_0x04f7
        L_0x0515:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x04f7
        L_0x051a:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.common.server.converter.zaa r8 = new com.google.android.gms.common.server.converter.zaa
            r8.<init>(r2, r1)
            return r8
        L_0x0523:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r5 = 0
        L_0x0529:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x054a
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0545
            r2 = 2
            if (r3 == r2) goto L_0x053e
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x0529
        L_0x053e:
            android.os.Parcelable$Creator r2 = com.google.android.gms.common.server.converter.zac.CREATOR
            java.util.ArrayList r5 = X.AnonymousClass7Kw.A0H(r0, r2, r4)
            goto L_0x0529
        L_0x0545:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x0529
        L_0x054a:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.common.server.converter.StringToIntConverter r8 = new com.google.android.gms.common.server.converter.StringToIntConverter
            r8.<init>(r1, r5)
            return r8
        L_0x0553:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r6 = 0
            r2 = 0
        L_0x055a:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x0581
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x057c
            r3 = 2
            if (r4 == r3) goto L_0x0577
            r3 = 3
            if (r4 == r3) goto L_0x0572
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x055a
        L_0x0572:
            int r2 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x055a
        L_0x0577:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r5)
            goto L_0x055a
        L_0x057c:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x055a
        L_0x0581:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.common.server.converter.zac r8 = new com.google.android.gms.common.server.converter.zac
            r8.<init>(r1, r6, r2)
            return r8
        L_0x058a:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r10 = 0
            r11 = r10
            r9 = r10
            r12 = 0
            r13 = 0
            r16 = 0
            r14 = 0
            r17 = 0
            r15 = 0
        L_0x0599:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x05e4
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x05be;
                case 2: goto L_0x05c3;
                case 3: goto L_0x05d2;
                case 4: goto L_0x05c8;
                case 5: goto L_0x05db;
                case 6: goto L_0x05ab;
                case 7: goto L_0x05cd;
                case 8: goto L_0x05b0;
                case 9: goto L_0x05b5;
                default: goto L_0x05a7;
            }
        L_0x05a7:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0599
        L_0x05ab:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0599
        L_0x05b0:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0599
        L_0x05b5:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.server.converter.zaa.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.common.server.converter.zaa r9 = (com.google.android.gms.common.server.converter.zaa) r9
            goto L_0x0599
        L_0x05be:
            int r12 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0599
        L_0x05c3:
            int r13 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0599
        L_0x05c8:
            int r14 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0599
        L_0x05cd:
            int r15 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0599
        L_0x05d2:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r16 = X.C18180wK.A1V(r1)
            goto L_0x0599
        L_0x05db:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r17 = X.C18180wK.A1V(r1)
            goto L_0x0599
        L_0x05e4:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r8 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r8
        L_0x05ed:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r6 = 0
            r2 = r6
            r1 = 0
        L_0x05f4:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x061f
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x061a
            r3 = 2
            if (r4 == r3) goto L_0x0615
            r3 = 3
            if (r4 == r3) goto L_0x060c
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x05f4
        L_0x060c:
            com.facebook.redex.PCreatorCreatorShape5S0000000_I2_5 r2 = com.google.android.gms.common.server.response.FastJsonResponse$Field.CREATOR
            android.os.Parcelable r2 = X.AnonymousClass7Kw.A0B(r0, r2, r5)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = (com.google.android.gms.common.server.response.FastJsonResponse$Field) r2
            goto L_0x05f4
        L_0x0615:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r5)
            goto L_0x05f4
        L_0x061a:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x05f4
        L_0x061f:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.common.server.response.zam r8 = new com.google.android.gms.common.server.response.zam
            r8.<init>(r2, r6, r1)
            return r8
        L_0x0628:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r6 = 0
            r5 = r6
            r1 = 0
        L_0x062f:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x0652
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x064d
            r2 = 2
            if (r3 == r2) goto L_0x0646
            r2 = 3
            java.lang.String r5 = X.AnonymousClass7Kw.A0F(r0, r5, r3, r2, r4)
            goto L_0x062f
        L_0x0646:
            android.os.Parcelable$Creator r2 = com.google.android.gms.common.server.response.zal.CREATOR
            java.util.ArrayList r6 = X.AnonymousClass7Kw.A0H(r0, r2, r4)
            goto L_0x062f
        L_0x064d:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x062f
        L_0x0652:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.common.server.response.zan r8 = new com.google.android.gms.common.server.response.zan
            r8.<init>(r6, r1, r5)
            return r8
        L_0x065b:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r6 = 0
            r5 = r6
            r1 = 0
        L_0x0662:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x068b
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0686
            r2 = 2
            if (r3 == r2) goto L_0x0681
            r2 = 3
            if (r3 == r2) goto L_0x067a
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x0662
        L_0x067a:
            android.os.Parcelable$Creator r2 = com.google.android.gms.common.server.response.zam.CREATOR
            java.util.ArrayList r5 = X.AnonymousClass7Kw.A0H(r0, r2, r4)
            goto L_0x0662
        L_0x0681:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x0662
        L_0x0686:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x0662
        L_0x068b:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.common.server.response.zal r8 = new com.google.android.gms.common.server.response.zal
            r8.<init>(r5, r1, r6)
            return r8
        L_0x0694:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r2 = 0
            r5 = r2
            r1 = 0
        L_0x069b:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x06d9
            int r6 = r0.readInt()
            char r4 = (char) r6
            r3 = 1
            if (r4 == r3) goto L_0x06d4
            r3 = 2
            if (r4 == r3) goto L_0x06bc
            r3 = 3
            if (r4 == r3) goto L_0x06b3
            X.AnonymousClass7Kw.A0J(r0, r6)
            goto L_0x069b
        L_0x06b3:
            android.os.Parcelable$Creator r3 = com.google.android.gms.common.server.response.zan.CREATOR
            android.os.Parcelable r5 = X.AnonymousClass7Kw.A0B(r0, r3, r6)
            com.google.android.gms.common.server.response.zan r5 = (com.google.android.gms.common.server.response.zan) r5
            goto L_0x069b
        L_0x06bc:
            int r4 = X.AnonymousClass7Kw.A05(r0, r6)
            int r3 = r0.dataPosition()
            if (r4 != 0) goto L_0x06c8
            r2 = 0
            goto L_0x069b
        L_0x06c8:
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r2.appendFrom(r0, r3, r4)
            int r3 = r3 + r4
            r0.setDataPosition(r3)
            goto L_0x069b
        L_0x06d4:
            int r1 = X.AnonymousClass7Kw.A04(r0, r6)
            goto L_0x069b
        L_0x06d9:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.common.server.response.SafeParcelResponse r8 = new com.google.android.gms.common.server.response.SafeParcelResponse
            r8.<init>(r2, r5, r1)
            return r8
        L_0x06e2:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r6 = 0
            r2 = 0
        L_0x06e9:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x0710
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x070b
            r3 = 2
            if (r4 == r3) goto L_0x0706
            r3 = 3
            if (r4 == r3) goto L_0x0701
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x06e9
        L_0x0701:
            int r2 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x06e9
        L_0x0706:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r5)
            goto L_0x06e9
        L_0x070b:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x06e9
        L_0x0710:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.common.server.FavaDiagnosticsEntity r8 = new com.google.android.gms.common.server.FavaDiagnosticsEntity
            r8.<init>(r1, r6, r2)
            return r8
        L_0x0719:
            int r2 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r14 = r9
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r15 = 0
            r26 = 0
        L_0x0734:
            int r1 = r0.dataPosition()
            if (r1 >= r2) goto L_0x0795
            int r1 = r0.readInt()
            char r3 = (char) r1
            switch(r3) {
                case 1: goto L_0x0746;
                case 2: goto L_0x074b;
                case 3: goto L_0x0742;
                case 4: goto L_0x0750;
                case 5: goto L_0x0755;
                case 6: goto L_0x075a;
                case 7: goto L_0x0742;
                case 8: goto L_0x075f;
                case 9: goto L_0x0742;
                case 10: goto L_0x0764;
                case 11: goto L_0x0769;
                case 12: goto L_0x076e;
                case 13: goto L_0x0773;
                case 14: goto L_0x0778;
                case 15: goto L_0x077d;
                case 16: goto L_0x0782;
                case 17: goto L_0x0787;
                case 18: goto L_0x078c;
                default: goto L_0x0742;
            }
        L_0x0742:
            X.AnonymousClass7Kw.A0J(r0, r1)
            goto L_0x0734
        L_0x0746:
            int r16 = X.AnonymousClass7Kw.A04(r0, r1)
            goto L_0x0734
        L_0x074b:
            long r20 = X.AnonymousClass7Kw.A07(r0, r1)
            goto L_0x0734
        L_0x0750:
            java.lang.String r9 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0734
        L_0x0755:
            int r18 = X.AnonymousClass7Kw.A04(r0, r1)
            goto L_0x0734
        L_0x075a:
            java.util.ArrayList r14 = X.AnonymousClass7Kw.A0G(r0, r1)
            goto L_0x0734
        L_0x075f:
            long r22 = X.AnonymousClass7Kw.A07(r0, r1)
            goto L_0x0734
        L_0x0764:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0734
        L_0x0769:
            int r17 = X.AnonymousClass7Kw.A04(r0, r1)
            goto L_0x0734
        L_0x076e:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0734
        L_0x0773:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0734
        L_0x0778:
            int r19 = X.AnonymousClass7Kw.A04(r0, r1)
            goto L_0x0734
        L_0x077d:
            float r15 = X.AnonymousClass7Kw.A01(r0, r1)
            goto L_0x0734
        L_0x0782:
            long r24 = X.AnonymousClass7Kw.A07(r0, r1)
            goto L_0x0734
        L_0x0787:
            java.lang.String r13 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0734
        L_0x078c:
            int r1 = X.AnonymousClass7Kw.A04(r0, r1)
            boolean r26 = X.C18180wK.A1V(r1)
            goto L_0x0734
        L_0x0795:
            X.AnonymousClass7Kw.A0I(r0, r2)
            com.google.android.gms.common.stats.WakeLockEvent r8 = new com.google.android.gms.common.stats.WakeLockEvent
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r24, r26)
            return r8
        L_0x079e:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r3 = 0
            r7 = r3
            r1 = 0
            r2 = 0
        L_0x07a6:
            int r4 = r0.dataPosition()
            if (r4 >= r8) goto L_0x07d3
            int r6 = r0.readInt()
            char r5 = (char) r6
            r4 = 1
            if (r5 == r4) goto L_0x07ce
            r4 = 2
            if (r5 == r4) goto L_0x07c9
            r4 = 3
            if (r5 == r4) goto L_0x07c0
            r4 = 4
            java.lang.String r7 = X.AnonymousClass7Kw.A0F(r0, r7, r5, r4, r6)
            goto L_0x07a6
        L_0x07c0:
            android.os.Parcelable$Creator r3 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r3 = X.AnonymousClass7Kw.A0B(r0, r3, r6)
            android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            goto L_0x07a6
        L_0x07c9:
            int r2 = X.AnonymousClass7Kw.A04(r0, r6)
            goto L_0x07a6
        L_0x07ce:
            int r1 = X.AnonymousClass7Kw.A04(r0, r6)
            goto L_0x07a6
        L_0x07d3:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r3, r7, r1, r2)
            return r8
        L_0x07dc:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r7 = 0
            r1 = 0
            r2 = -1
        L_0x07e4:
            int r4 = r0.dataPosition()
            if (r4 >= r8) goto L_0x080b
            int r6 = r0.readInt()
            char r5 = (char) r6
            r4 = 1
            if (r5 == r4) goto L_0x0806
            r4 = 2
            if (r5 == r4) goto L_0x0801
            r4 = 3
            if (r5 == r4) goto L_0x07fc
            X.AnonymousClass7Kw.A0J(r0, r6)
            goto L_0x07e4
        L_0x07fc:
            long r2 = X.AnonymousClass7Kw.A07(r0, r6)
            goto L_0x07e4
        L_0x0801:
            int r1 = X.AnonymousClass7Kw.A04(r0, r6)
            goto L_0x07e4
        L_0x0806:
            java.lang.String r7 = X.AnonymousClass7Kw.A0E(r0, r6)
            goto L_0x07e4
        L_0x080b:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.common.Feature r8 = new com.google.android.gms.common.Feature
            r8.<init>(r7, r1, r2)
            return r8
        L_0x0814:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r10 = 0
            r9 = r10
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x081d:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0860
            int r4 = r0.readInt()
            char r2 = (char) r4
            r1 = 1
            if (r2 == r1) goto L_0x085b
            r1 = 2
            if (r2 == r1) goto L_0x0852
            r1 = 3
            if (r2 == r1) goto L_0x0849
            r1 = 4
            if (r2 == r1) goto L_0x0844
            r1 = 5
            if (r2 == r1) goto L_0x083b
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x081d
        L_0x083b:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r13 = X.C18180wK.A1V(r1)
            goto L_0x081d
        L_0x0844:
            android.os.IBinder r9 = X.AnonymousClass7Kw.A0A(r0, r4)
            goto L_0x081d
        L_0x0849:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r12 = X.C18180wK.A1V(r1)
            goto L_0x081d
        L_0x0852:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r11 = X.C18180wK.A1V(r1)
            goto L_0x081d
        L_0x085b:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x081d
        L_0x0860:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.common.zzn r8 = new com.google.android.gms.common.zzn
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x0869:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r6 = 0
            r2 = 0
        L_0x0870:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x089b
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x0892
            r3 = 2
            if (r4 == r3) goto L_0x088d
            r3 = 3
            if (r4 == r3) goto L_0x0888
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x0870
        L_0x0888:
            int r2 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x0870
        L_0x088d:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r5)
            goto L_0x0870
        L_0x0892:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            boolean r1 = X.C18180wK.A1V(r1)
            goto L_0x0870
        L_0x089b:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.common.zzq r8 = new com.google.android.gms.common.zzq
            r8.<init>(r2, r6, r1)
            return r8
        L_0x08a4:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r7 = 0
            r6 = r7
            r2 = 0
        L_0x08ac:
            int r3 = r0.dataPosition()
            if (r3 >= r8) goto L_0x08e3
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x08de
            r3 = 2
            if (r4 == r3) goto L_0x08d9
            r3 = 3
            if (r4 == r3) goto L_0x08d0
            r3 = 4
            if (r4 == r3) goto L_0x08c7
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x08ac
        L_0x08c7:
            int r2 = X.AnonymousClass7Kw.A04(r0, r5)
            boolean r2 = X.C18180wK.A1V(r2)
            goto L_0x08ac
        L_0x08d0:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            boolean r1 = X.C18180wK.A1V(r1)
            goto L_0x08ac
        L_0x08d9:
            android.os.IBinder r6 = X.AnonymousClass7Kw.A0A(r0, r5)
            goto L_0x08ac
        L_0x08de:
            java.lang.String r7 = X.AnonymousClass7Kw.A0E(r0, r5)
            goto L_0x08ac
        L_0x08e3:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.common.zzs r8 = new com.google.android.gms.common.zzs
            r8.<init>(r6, r7, r1, r2)
            return r8
        L_0x08ec:
            java.lang.String r4 = r0.readString()
            com.google.android.gms.fido.common.Transport[] r3 = com.google.android.gms.fido.common.Transport.values()     // Catch:{ 6Bs -> 0x0915 }
            int r2 = r3.length     // Catch:{ 6Bs -> 0x0915 }
            r1 = 0
        L_0x08f6:
            if (r1 >= r2) goto L_0x0905
            r8 = r3[r1]     // Catch:{ 6Bs -> 0x0915 }
            java.lang.String r0 = r8.A00     // Catch:{ 6Bs -> 0x0915 }
            boolean r0 = r4.equals(r0)     // Catch:{ 6Bs -> 0x0915 }
            if (r0 != 0) goto L_0x118b
            int r1 = r1 + 1
            goto L_0x08f6
        L_0x0905:
            java.lang.Object[] r1 = new java.lang.Object[]{r4}     // Catch:{ 6Bs -> 0x0915 }
            java.lang.String r0 = "Transport %s not supported"
            java.lang.String r1 = java.lang.String.format(r0, r1)     // Catch:{ 6Bs -> 0x0915 }
            X.6Bs r0 = new X.6Bs     // Catch:{ 6Bs -> 0x0915 }
            r0.<init>(r1)     // Catch:{ 6Bs -> 0x0915 }
            throw r0     // Catch:{ 6Bs -> 0x0915 }
        L_0x0915:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x091b:
            java.lang.String r4 = r0.readString()
            com.google.android.gms.fido.fido2.api.common.Attachment[] r3 = com.google.android.gms.fido.fido2.api.common.Attachment.values()     // Catch:{ 6Bt -> 0x093a }
            int r2 = r3.length     // Catch:{ 6Bt -> 0x093a }
            r1 = 0
        L_0x0925:
            if (r1 >= r2) goto L_0x0934
            r8 = r3[r1]     // Catch:{ 6Bt -> 0x093a }
            java.lang.String r0 = r8.A00     // Catch:{ 6Bt -> 0x093a }
            boolean r0 = r4.equals(r0)     // Catch:{ 6Bt -> 0x093a }
            if (r0 != 0) goto L_0x118b
            int r1 = r1 + 1
            goto L_0x0925
        L_0x0934:
            X.6Bt r0 = new X.6Bt     // Catch:{ 6Bt -> 0x093a }
            r0.<init>(r4)     // Catch:{ 6Bt -> 0x093a }
            throw r0     // Catch:{ 6Bt -> 0x093a }
        L_0x093a:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x0940:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r2 = 0
        L_0x0945:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0950
            boolean r2 = X.AnonymousClass7Kw.A0N(r0, r2)
            goto L_0x0945
        L_0x0950:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.fido.fido2.api.common.zzaa r8 = new com.google.android.gms.fido.fido2.api.common.zzaa
            r8.<init>(r2)
            return r8
        L_0x0959:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r2 = 0
        L_0x095e:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0969
            boolean r2 = X.AnonymousClass7Kw.A0N(r0, r2)
            goto L_0x095e
        L_0x0969:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension r8 = new com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension
            r8.<init>(r2)
            return r8
        L_0x0972:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r4 = 0
        L_0x0977:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x0988
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x0977
        L_0x0988:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.fido.fido2.api.common.zzad r8 = new com.google.android.gms.fido.fido2.api.common.zzad
            r8.<init>(r4)
            return r8
        L_0x0991:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r11 = 0
            r12 = r11
            r19 = r11
            r17 = r11
            r14 = r11
            r18 = r11
            r10 = r11
            r15 = r11
            r13 = r11
            r16 = r11
            r9 = r11
        L_0x09a4:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0a05
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x09b6;
                case 3: goto L_0x09bf;
                case 4: goto L_0x09c8;
                case 5: goto L_0x09cd;
                case 6: goto L_0x09d4;
                case 7: goto L_0x09d9;
                case 8: goto L_0x09e0;
                case 9: goto L_0x09e9;
                case 10: goto L_0x09ee;
                case 11: goto L_0x09f7;
                case 12: goto L_0x09fc;
                default: goto L_0x09b2;
            }
        L_0x09b2:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x09a4
        L_0x09b6:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity.CREATOR
            android.os.Parcelable r11 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r11 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity) r11
            goto L_0x09a4
        L_0x09bf:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity.CREATOR
            android.os.Parcelable r12 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r12 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) r12
            goto L_0x09a4
        L_0x09c8:
            byte[] r19 = X.AnonymousClass7Kw.A0O(r0, r2)
            goto L_0x09a4
        L_0x09cd:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters.CREATOR
            java.util.ArrayList r17 = X.AnonymousClass7Kw.A0H(r0, r1, r2)
            goto L_0x09a4
        L_0x09d4:
            java.lang.Double r14 = X.AnonymousClass7Kw.A0C(r0, r2)
            goto L_0x09a4
        L_0x09d9:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor.CREATOR
            java.util.ArrayList r18 = X.AnonymousClass7Kw.A0H(r0, r1, r2)
            goto L_0x09a4
        L_0x09e0:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.CREATOR
            android.os.Parcelable r10 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r10 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria) r10
            goto L_0x09a4
        L_0x09e9:
            java.lang.Integer r15 = X.AnonymousClass7Kw.A0D(r0, r2)
            goto L_0x09a4
        L_0x09ee:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.TokenBinding.CREATOR
            android.os.Parcelable r13 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.TokenBinding r13 = (com.google.android.gms.fido.fido2.api.common.TokenBinding) r13
            goto L_0x09a4
        L_0x09f7:
            java.lang.String r16 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x09a4
        L_0x09fc:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r9 = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) r9
            goto L_0x09a4
        L_0x0a05:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions r8 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r8
        L_0x0a0e:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r13 = 0
            r14 = r13
            r16 = r13
            r11 = r13
            r10 = r13
            r12 = r13
            r9 = r13
            r15 = r13
        L_0x0a1b:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0a65
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x0a2d;
                case 2: goto L_0x0a32;
                case 3: goto L_0x0a37;
                case 4: goto L_0x0a3c;
                case 5: goto L_0x0a45;
                case 6: goto L_0x0a4e;
                case 7: goto L_0x0a57;
                case 8: goto L_0x0a60;
                default: goto L_0x0a29;
            }
        L_0x0a29:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0a1b
        L_0x0a2d:
            java.lang.String r13 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0a1b
        L_0x0a32:
            java.lang.String r14 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0a1b
        L_0x0a37:
            byte[] r16 = X.AnonymousClass7Kw.A0O(r0, r2)
            goto L_0x0a1b
        L_0x0a3c:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.CREATOR
            android.os.Parcelable r11 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r11 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) r11
            goto L_0x0a1b
        L_0x0a45:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse.CREATOR
            android.os.Parcelable r10 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r10 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) r10
            goto L_0x0a1b
        L_0x0a4e:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse.CREATOR
            android.os.Parcelable r12 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r12 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) r12
            goto L_0x0a1b
        L_0x0a57:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r9 = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs) r9
            goto L_0x0a1b
        L_0x0a60:
            java.lang.String r15 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0a1b
        L_0x0a65:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r8 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredential
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
        L_0x0a6e:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r6 = 0
            r5 = r6
            r4 = r6
        L_0x0a75:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x0a9e
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x0a99
            r1 = 3
            if (r2 == r1) goto L_0x0a94
            r1 = 4
            if (r2 == r1) goto L_0x0a8d
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0a75
        L_0x0a8d:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.common.Transport.CREATOR
            java.util.ArrayList r4 = X.AnonymousClass7Kw.A0H(r0, r1, r3)
            goto L_0x0a75
        L_0x0a94:
            byte[] r5 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x0a75
        L_0x0a99:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x0a75
        L_0x0a9e:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor r8 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor
            r8.<init>(r6, r4, r5)
            return r8
        L_0x0aa7:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r5 = 0
            r4 = r5
        L_0x0aad:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x0acc
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x0ac7
            r1 = 3
            if (r2 == r1) goto L_0x0ac2
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0aad
        L_0x0ac2:
            java.lang.Integer r4 = X.AnonymousClass7Kw.A0D(r0, r3)
            goto L_0x0aad
        L_0x0ac7:
            java.lang.String r5 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x0aad
        L_0x0acc:
            X.AnonymousClass7Kw.A0I(r0, r6)
            int r0 = r4.intValue()
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters r8 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters
            r8.<init>(r5, r0)
            return r8
        L_0x0ad9:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r13 = 0
            r17 = r13
            r11 = r13
            r14 = r13
            r16 = r13
            r12 = r13
            r10 = r13
            r15 = r13
            r9 = r13
        L_0x0ae8:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0b42
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x0afa;
                case 3: goto L_0x0aff;
                case 4: goto L_0x0b04;
                case 5: goto L_0x0b09;
                case 6: goto L_0x0b10;
                case 7: goto L_0x0b15;
                case 8: goto L_0x0b1e;
                case 9: goto L_0x0b23;
                case 10: goto L_0x0b2c;
                default: goto L_0x0af6;
            }
        L_0x0af6:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0ae8
        L_0x0afa:
            byte[] r17 = X.AnonymousClass7Kw.A0O(r0, r2)
            goto L_0x0ae8
        L_0x0aff:
            java.lang.Double r11 = X.AnonymousClass7Kw.A0C(r0, r2)
            goto L_0x0ae8
        L_0x0b04:
            java.lang.String r14 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0ae8
        L_0x0b09:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor.CREATOR
            java.util.ArrayList r16 = X.AnonymousClass7Kw.A0H(r0, r1, r2)
            goto L_0x0ae8
        L_0x0b10:
            java.lang.Integer r12 = X.AnonymousClass7Kw.A0D(r0, r2)
            goto L_0x0ae8
        L_0x0b15:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.TokenBinding.CREATOR
            android.os.Parcelable r10 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.TokenBinding r10 = (com.google.android.gms.fido.fido2.api.common.TokenBinding) r10
            goto L_0x0ae8
        L_0x0b1e:
            java.lang.String r15 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0ae8
        L_0x0b23:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r9 = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) r9
            goto L_0x0ae8
        L_0x0b2c:
            int r2 = X.AnonymousClass7Kw.A05(r0, r2)
            if (r2 != 0) goto L_0x0b34
            r13 = 0
            goto L_0x0ae8
        L_0x0b34:
            r1 = 8
            X.AnonymousClass7Kw.A0K(r0, r2, r1)
            long r1 = r0.readLong()
            java.lang.Long r13 = java.lang.Long.valueOf(r1)
            goto L_0x0ae8
        L_0x0b42:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r8 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r8
        L_0x0b4b:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r6 = 0
            r5 = r6
            r4 = r6
        L_0x0b52:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x0b73
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x0b6e
            r1 = 3
            if (r2 == r1) goto L_0x0b69
            r1 = 4
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x0b52
        L_0x0b69:
            java.lang.String r5 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x0b52
        L_0x0b6e:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x0b52
        L_0x0b73:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r8 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity
            r8.<init>(r6, r5, r4)
            return r8
        L_0x0b7c:
            java.lang.String r0 = r0.readString()
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType r8 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.A00(r0)     // Catch:{ 6Bx -> 0x0b85 }
            return r8
        L_0x0b85:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x0b8b:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r7 = 0
            r6 = r7
            r5 = r7
            r4 = r7
        L_0x0b93:
            int r1 = r0.dataPosition()
            if (r1 >= r8) goto L_0x0bbc
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x0bb7
            r1 = 3
            if (r2 == r1) goto L_0x0bb2
            r1 = 4
            if (r2 == r1) goto L_0x0bad
            r1 = 5
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x0b93
        L_0x0bad:
            java.lang.String r5 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x0b93
        L_0x0bb2:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x0b93
        L_0x0bb7:
            byte[] r7 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x0b93
        L_0x0bbc:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r8 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity
            r8.<init>(r6, r7, r5, r4)
            return r8
        L_0x0bc5:
            java.lang.String r4 = r0.readString()
            if (r4 != 0) goto L_0x0bcd
            java.lang.String r4 = ""
        L_0x0bcd:
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement[] r3 = com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.values()     // Catch:{ 6By -> 0x0be8 }
            int r2 = r3.length     // Catch:{ 6By -> 0x0be8 }
            r1 = 0
        L_0x0bd3:
            if (r1 >= r2) goto L_0x0be2
            r8 = r3[r1]     // Catch:{ 6By -> 0x0be8 }
            java.lang.String r0 = r8.A00     // Catch:{ 6By -> 0x0be8 }
            boolean r0 = r4.equals(r0)     // Catch:{ 6By -> 0x0be8 }
            if (r0 != 0) goto L_0x118b
            int r1 = r1 + 1
            goto L_0x0bd3
        L_0x0be2:
            X.6By r0 = new X.6By     // Catch:{ 6By -> 0x0be8 }
            r0.<init>(r4)     // Catch:{ 6By -> 0x0be8 }
            throw r0     // Catch:{ 6By -> 0x0be8 }
        L_0x0be8:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x0bee:
            java.lang.String r4 = r0.readString()
            com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus[] r3 = com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.values()     // Catch:{ 6Bz -> 0x0c0d }
            int r2 = r3.length     // Catch:{ 6Bz -> 0x0c0d }
            r1 = 0
        L_0x0bf8:
            if (r1 >= r2) goto L_0x0c07
            r8 = r3[r1]     // Catch:{ 6Bz -> 0x0c0d }
            java.lang.String r0 = r8.A00     // Catch:{ 6Bz -> 0x0c0d }
            boolean r0 = r4.equals(r0)     // Catch:{ 6Bz -> 0x0c0d }
            if (r0 != 0) goto L_0x118b
            int r1 = r1 + 1
            goto L_0x0bf8
        L_0x0c07:
            X.6Bz r0 = new X.6Bz     // Catch:{ 6Bz -> 0x0c0d }
            r0.<init>(r4)     // Catch:{ 6Bz -> 0x0c0d }
            throw r0     // Catch:{ 6Bz -> 0x0c0d }
        L_0x0c0d:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x0c13:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r5 = 0
            r4 = r5
        L_0x0c19:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x0c32
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x0c2d
            r1 = 3
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x0c19
        L_0x0c2d:
            java.lang.String r5 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x0c19
        L_0x0c32:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.fido.fido2.api.common.TokenBinding r8 = new com.google.android.gms.fido.fido2.api.common.TokenBinding
            r8.<init>(r5, r4)
            return r8
        L_0x0c3b:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r2 = 0
        L_0x0c40:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0c4b
            boolean r2 = X.AnonymousClass7Kw.A0N(r0, r2)
            goto L_0x0c40
        L_0x0c4b:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension r8 = new com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension
            r8.<init>(r2)
            return r8
        L_0x0c54:
            java.lang.String r0 = r0.readString()
            com.google.android.gms.fido.fido2.api.common.zzat r8 = com.google.android.gms.fido.fido2.api.common.zzat.A00(r0)     // Catch:{ 6C0 -> 0x0c5d }
            return r8
        L_0x0c5d:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x0c63:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r4 = 0
        L_0x0c68:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x0c81
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0c7a
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0c68
        L_0x0c7a:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.UvmEntry.CREATOR
            java.util.ArrayList r4 = X.AnonymousClass7Kw.A0H(r0, r1, r3)
            goto L_0x0c68
        L_0x0c81:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.fido.fido2.api.common.UvmEntries r8 = new com.google.android.gms.fido.fido2.api.common.UvmEntries
            r8.<init>(r4)
            return r8
        L_0x0c8a:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0c91:
            int r4 = r0.dataPosition()
            if (r4 >= r7) goto L_0x0cba
            int r6 = r0.readInt()
            char r5 = (char) r6
            r4 = 1
            if (r5 == r4) goto L_0x0cb5
            r4 = 2
            if (r5 == r4) goto L_0x0caf
            r4 = 3
            if (r5 == r4) goto L_0x0ca9
            X.AnonymousClass7Kw.A0J(r0, r6)
            goto L_0x0c91
        L_0x0ca9:
            int r3 = X.AnonymousClass7Kw.A04(r0, r6)
            short r3 = (short) r3
            goto L_0x0c91
        L_0x0caf:
            int r2 = X.AnonymousClass7Kw.A04(r0, r6)
            short r2 = (short) r2
            goto L_0x0c91
        L_0x0cb5:
            int r1 = X.AnonymousClass7Kw.A04(r0, r6)
            goto L_0x0c91
        L_0x0cba:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.fido.fido2.api.common.UvmEntry r8 = new com.google.android.gms.fido.fido2.api.common.UvmEntry
            r8.<init>(r1, r2, r3)
            return r8
        L_0x0cc3:
            java.lang.String r4 = r0.readString()
            com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference[] r3 = com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.values()     // Catch:{ 6Bu -> 0x0ce2 }
            int r2 = r3.length     // Catch:{ 6Bu -> 0x0ce2 }
            r1 = 0
        L_0x0ccd:
            if (r1 >= r2) goto L_0x0cdc
            r8 = r3[r1]     // Catch:{ 6Bu -> 0x0ce2 }
            java.lang.String r0 = r8.A00     // Catch:{ 6Bu -> 0x0ce2 }
            boolean r0 = r4.equals(r0)     // Catch:{ 6Bu -> 0x0ce2 }
            if (r0 != 0) goto L_0x118b
            int r1 = r1 + 1
            goto L_0x0ccd
        L_0x0cdc:
            X.6Bu r0 = new X.6Bu     // Catch:{ 6Bu -> 0x0ce2 }
            r0.<init>(r4)     // Catch:{ 6Bu -> 0x0ce2 }
            throw r0     // Catch:{ 6Bu -> 0x0ce2 }
        L_0x0ce2:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x0ce8:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r2 = r1
        L_0x0cee:
            int r3 = r0.dataPosition()
            if (r3 >= r6) goto L_0x0d15
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x0d0c
            r3 = 2
            if (r4 == r3) goto L_0x0d03
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x0cee
        L_0x0d03:
            android.os.Parcelable$Creator r2 = com.google.android.gms.fido.fido2.api.common.zze.CREATOR
            android.os.Parcelable r2 = X.AnonymousClass7Kw.A0B(r0, r2, r5)
            com.google.android.gms.fido.fido2.api.common.zze r2 = (com.google.android.gms.fido.fido2.api.common.zze) r2
            goto L_0x0cee
        L_0x0d0c:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.UvmEntries.CREATOR
            android.os.Parcelable r1 = X.AnonymousClass7Kw.A0B(r0, r1, r5)
            com.google.android.gms.fido.fido2.api.common.UvmEntries r1 = (com.google.android.gms.fido.fido2.api.common.UvmEntries) r1
            goto L_0x0cee
        L_0x0d15:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r8 = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs
            r8.<init>(r1, r2)
            return r8
        L_0x0d1e:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r14 = r9
            r11 = r9
            r2 = r9
            r3 = r9
            r12 = r9
            r15 = r9
            r13 = r9
            r10 = r9
        L_0x0d2b:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x0d8e
            int r4 = r0.readInt()
            char r1 = (char) r4
            switch(r1) {
                case 2: goto L_0x0d3d;
                case 3: goto L_0x0d46;
                case 4: goto L_0x0d4f;
                case 5: goto L_0x0d58;
                case 6: goto L_0x0d61;
                case 7: goto L_0x0d6a;
                case 8: goto L_0x0d73;
                case 9: goto L_0x0d7c;
                case 10: goto L_0x0d85;
                default: goto L_0x0d39;
            }
        L_0x0d39:
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x0d2b
        L_0x0d3d:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension r9 = (com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension) r9
            goto L_0x0d2b
        L_0x0d46:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzp.CREATOR
            android.os.Parcelable r14 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.fido.fido2.api.common.zzp r14 = (com.google.android.gms.fido.fido2.api.common.zzp) r14
            goto L_0x0d2b
        L_0x0d4f:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension.CREATOR
            android.os.Parcelable r11 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension r11 = (com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension) r11
            goto L_0x0d2b
        L_0x0d58:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzw.CREATOR
            android.os.Parcelable r2 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.fido.fido2.api.common.zzw r2 = (com.google.android.gms.fido.fido2.api.common.zzw) r2
            goto L_0x0d2b
        L_0x0d61:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzy.CREATOR
            android.os.Parcelable r3 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.fido.fido2.api.common.zzy r3 = (com.google.android.gms.fido.fido2.api.common.zzy) r3
            goto L_0x0d2b
        L_0x0d6a:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzaa.CREATOR
            android.os.Parcelable r12 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.fido.fido2.api.common.zzaa r12 = (com.google.android.gms.fido.fido2.api.common.zzaa) r12
            goto L_0x0d2b
        L_0x0d73:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzr.CREATOR
            android.os.Parcelable r15 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.fido.fido2.api.common.zzr r15 = (com.google.android.gms.fido.fido2.api.common.zzr) r15
            goto L_0x0d2b
        L_0x0d7c:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzad.CREATOR
            android.os.Parcelable r13 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.fido.fido2.api.common.zzad r13 = (com.google.android.gms.fido.fido2.api.common.zzad) r13
            goto L_0x0d2b
        L_0x0d85:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension.CREATOR
            android.os.Parcelable r10 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension r10 = (com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension) r10
            goto L_0x0d2b
        L_0x0d8e:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r8 = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions
            r17 = r3
            r16 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r8
        L_0x0d9b:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r5 = 0
            r4 = r5
        L_0x0da1:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x0dc0
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0dbb
            r1 = 2
            if (r2 == r1) goto L_0x0db6
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0da1
        L_0x0db6:
            byte[] r4 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x0da1
        L_0x0dbb:
            byte[] r5 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x0da1
        L_0x0dc0:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.fido.fido2.api.common.zze r8 = new com.google.android.gms.fido.fido2.api.common.zze
            r8.<init>(r5, r4)
            return r8
        L_0x0dc9:
            int r4 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
        L_0x0dd2:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x0e09
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x0e04
            r1 = 3
            if (r2 == r1) goto L_0x0dff
            r1 = 4
            if (r2 == r1) goto L_0x0dfa
            r1 = 5
            if (r2 == r1) goto L_0x0df5
            r1 = 6
            if (r2 == r1) goto L_0x0df0
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0dd2
        L_0x0df0:
            byte[] r13 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x0dd2
        L_0x0df5:
            byte[] r12 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x0dd2
        L_0x0dfa:
            byte[] r11 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x0dd2
        L_0x0dff:
            byte[] r10 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x0dd2
        L_0x0e04:
            byte[] r9 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x0dd2
        L_0x0e09:
            X.AnonymousClass7Kw.A0I(r0, r4)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r8 = new com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x0e12:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r7 = 0
            r6 = r7
            r5 = r7
            r4 = r7
        L_0x0e1a:
            int r1 = r0.dataPosition()
            if (r1 >= r8) goto L_0x0e49
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x0e44
            r1 = 3
            if (r2 == r1) goto L_0x0e3f
            r1 = 4
            if (r2 == r1) goto L_0x0e3a
            r1 = 5
            if (r2 == r1) goto L_0x0e35
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0e1a
        L_0x0e35:
            java.lang.String[] r4 = X.AnonymousClass7Kw.A0R(r0, r3)
            goto L_0x0e1a
        L_0x0e3a:
            byte[] r5 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x0e1a
        L_0x0e3f:
            byte[] r6 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x0e1a
        L_0x0e44:
            byte[] r7 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x0e1a
        L_0x0e49:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r8 = new com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse
            r8.<init>(r7, r6, r5, r4)
            return r8
        L_0x0e52:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r5 = 0
            r1 = 0
        L_0x0e58:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0e71
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x0e6c
            r2 = 3
            java.lang.String r5 = X.AnonymousClass7Kw.A0F(r0, r5, r3, r2, r4)
            goto L_0x0e58
        L_0x0e6c:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x0e58
        L_0x0e71:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r8 = new com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse
            r8.<init>(r1, r5)
            return r8
        L_0x0e7a:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r7 = 0
            r1 = r7
            r6 = r7
            r5 = r7
        L_0x0e82:
            int r2 = r0.dataPosition()
            if (r2 >= r8) goto L_0x0ebb
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x0eb6
            r2 = 3
            if (r3 == r2) goto L_0x0ea1
            r2 = 4
            if (r3 == r2) goto L_0x0e9c
            r2 = 5
            java.lang.String r5 = X.AnonymousClass7Kw.A0F(r0, r5, r3, r2, r4)
            goto L_0x0e82
        L_0x0e9c:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x0e82
        L_0x0ea1:
            int r2 = X.AnonymousClass7Kw.A05(r0, r4)
            if (r2 != 0) goto L_0x0ea9
            r1 = 0
            goto L_0x0e82
        L_0x0ea9:
            r1 = 4
            X.AnonymousClass7Kw.A0K(r0, r2, r1)
            boolean r1 = X.C86104wH.A1W(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x0e82
        L_0x0eb6:
            java.lang.String r7 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x0e82
        L_0x0ebb:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r8 = new com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria
            r8.<init>(r1, r7, r6, r5)
            return r8
        L_0x0ec4:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r2 = r1
            r6 = r1
        L_0x0ecb:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x0efa
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 2
            if (r4 == r3) goto L_0x0ef1
            r3 = 3
            if (r4 == r3) goto L_0x0ee8
            r3 = 4
            if (r4 == r3) goto L_0x0ee3
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x0ecb
        L_0x0ee3:
            byte[] r6 = X.AnonymousClass7Kw.A0O(r0, r5)
            goto L_0x0ecb
        L_0x0ee8:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = X.AnonymousClass7Kw.A0B(r0, r2, r5)
            android.net.Uri r2 = (android.net.Uri) r2
            goto L_0x0ecb
        L_0x0ef1:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.CREATOR
            android.os.Parcelable r1 = X.AnonymousClass7Kw.A0B(r0, r1, r5)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions r1 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) r1
            goto L_0x0ecb
        L_0x0efa:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions r8 = new com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions
            r8.<init>(r2, r1, r6)
            return r8
        L_0x0f03:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r2 = r1
            r6 = r1
        L_0x0f0a:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x0f39
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 2
            if (r4 == r3) goto L_0x0f30
            r3 = 3
            if (r4 == r3) goto L_0x0f27
            r3 = 4
            if (r4 == r3) goto L_0x0f22
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x0f0a
        L_0x0f22:
            byte[] r6 = X.AnonymousClass7Kw.A0O(r0, r5)
            goto L_0x0f0a
        L_0x0f27:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = X.AnonymousClass7Kw.A0B(r0, r2, r5)
            android.net.Uri r2 = (android.net.Uri) r2
            goto L_0x0f0a
        L_0x0f30:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.CREATOR
            android.os.Parcelable r1 = X.AnonymousClass7Kw.A0B(r0, r1, r5)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r1 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) r1
            goto L_0x0f0a
        L_0x0f39:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions r8 = new com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions
            r8.<init>(r2, r1, r6)
            return r8
        L_0x0f42:
            int r0 = r0.readInt()
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier r8 = com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.A00(r0)     // Catch:{ 6Bv -> 0x0f4b }
            return r8
        L_0x0f4b:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x0f51:
            int r4 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r11 = r9
            r12 = 0
        L_0x0f5a:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x0f89
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0f84
            r1 = 2
            if (r2 == r1) goto L_0x0f7f
            r1 = 3
            if (r2 == r1) goto L_0x0f7a
            r1 = 4
            if (r2 == r1) goto L_0x0f75
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0f5a
        L_0x0f75:
            byte[] r11 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x0f5a
        L_0x0f7a:
            byte[] r10 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x0f5a
        L_0x0f7f:
            byte[] r9 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x0f5a
        L_0x0f84:
            long r12 = X.AnonymousClass7Kw.A07(r0, r3)
            goto L_0x0f5a
        L_0x0f89:
            X.AnonymousClass7Kw.A0I(r0, r4)
            com.google.android.gms.fido.fido2.api.common.zzn r8 = new com.google.android.gms.fido.fido2.api.common.zzn
            r8.<init>(r9, r10, r11, r12)
            return r8
        L_0x0f92:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r4 = 0
        L_0x0f97:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x0fb0
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0fa9
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0f97
        L_0x0fa9:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzn.CREATOR
            java.util.ArrayList r4 = X.AnonymousClass7Kw.A0H(r0, r1, r3)
            goto L_0x0f97
        L_0x0fb0:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.fido.fido2.api.common.zzp r8 = new com.google.android.gms.fido.fido2.api.common.zzp
            r8.<init>(r4)
            return r8
        L_0x0fb9:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r2 = 0
        L_0x0fbe:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0fc9
            boolean r2 = X.AnonymousClass7Kw.A0N(r0, r2)
            goto L_0x0fbe
        L_0x0fc9:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.fido.fido2.api.common.zzr r8 = new com.google.android.gms.fido.fido2.api.common.zzr
            r8.<init>(r2)
            return r8
        L_0x0fd2:
            int r4 = r0.readInt()
            com.google.android.gms.fido.fido2.api.common.ErrorCode[] r3 = com.google.android.gms.fido.fido2.api.common.ErrorCode.values()     // Catch:{ 6Bw -> 0x0fed }
            int r2 = r3.length     // Catch:{ 6Bw -> 0x0fed }
            r1 = 0
        L_0x0fdc:
            if (r1 >= r2) goto L_0x0fe7
            r8 = r3[r1]     // Catch:{ 6Bw -> 0x0fed }
            int r0 = r8.A00     // Catch:{ 6Bw -> 0x0fed }
            if (r4 == r0) goto L_0x118b
            int r1 = r1 + 1
            goto L_0x0fdc
        L_0x0fe7:
            X.6Bw r0 = new X.6Bw     // Catch:{ 6Bw -> 0x0fed }
            r0.<init>(r4)     // Catch:{ 6Bw -> 0x0fed }
            throw r0     // Catch:{ 6Bw -> 0x0fed }
        L_0x0fed:
            r1 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0ff4:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r4 = 0
        L_0x0ff9:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x100a
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x0ff9
        L_0x100a:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension r8 = new com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension
            r8.<init>(r4)
            return r8
        L_0x1013:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = 0
            r14 = 0
        L_0x101d:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x1055
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x102f;
                case 2: goto L_0x1034;
                case 3: goto L_0x1039;
                case 4: goto L_0x103e;
                case 5: goto L_0x1043;
                case 6: goto L_0x104c;
                default: goto L_0x102b;
            }
        L_0x102b:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x101d
        L_0x102f:
            java.lang.String r9 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x101d
        L_0x1034:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x101d
        L_0x1039:
            byte[] r11 = X.AnonymousClass7Kw.A0O(r0, r2)
            goto L_0x101d
        L_0x103e:
            byte[] r12 = X.AnonymousClass7Kw.A0O(r0, r2)
            goto L_0x101d
        L_0x1043:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r13 = X.C18180wK.A1V(r1)
            goto L_0x101d
        L_0x104c:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r14 = X.C18180wK.A1V(r1)
            goto L_0x101d
        L_0x1055:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails r8 = new com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x105e:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r2 = 0
        L_0x1063:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x106e
            boolean r2 = X.AnonymousClass7Kw.A0N(r0, r2)
            goto L_0x1063
        L_0x106e:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.fido.fido2.api.common.zzw r8 = new com.google.android.gms.fido.fido2.api.common.zzw
            r8.<init>(r2)
            return r8
        L_0x1077:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
        L_0x107d:
            int r3 = r0.dataPosition()
            if (r3 >= r6) goto L_0x1094
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x108f
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x107d
        L_0x108f:
            long r1 = X.AnonymousClass7Kw.A07(r0, r5)
            goto L_0x107d
        L_0x1094:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.fido.fido2.api.common.zzy r8 = new com.google.android.gms.fido.fido2.api.common.zzy
            r8.<init>(r1)
            return r8
        L_0x109d:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r2 = 0
            r1 = 0
        L_0x10a3:
            int r3 = r0.dataPosition()
            if (r3 >= r6) goto L_0x10c6
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x10bd
            r3 = 2
            if (r4 == r3) goto L_0x10b8
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x10a3
        L_0x10b8:
            int r2 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x10a3
        L_0x10bd:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = X.AnonymousClass7Kw.A0B(r0, r1, r5)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            goto L_0x10a3
        L_0x10c6:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.fido.sourcedevice.SourceDirectTransferResult r8 = new com.google.android.gms.fido.sourcedevice.SourceDirectTransferResult
            r8.<init>(r1, r2)
            return r8
        L_0x10cf:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r10 = 0
            r9 = r10
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x10d8:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x1113
            int r4 = r0.readInt()
            char r2 = (char) r4
            r1 = 1
            if (r2 == r1) goto L_0x110e
            r1 = 2
            if (r2 == r1) goto L_0x1105
            r1 = 3
            if (r2 == r1) goto L_0x10fe
            r1 = 4
            if (r2 == r1) goto L_0x10f5
            r1 = 5
            java.lang.String r9 = X.AnonymousClass7Kw.A0F(r0, r9, r2, r1, r4)
            goto L_0x10d8
        L_0x10f5:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r13 = X.C18180wK.A1V(r1)
            goto L_0x10d8
        L_0x10fe:
            android.os.Parcelable$Creator r1 = android.accounts.Account.CREATOR
            java.util.ArrayList r10 = X.AnonymousClass7Kw.A0H(r0, r1, r4)
            goto L_0x10d8
        L_0x1105:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            boolean r12 = X.C18180wK.A1V(r1)
            goto L_0x10d8
        L_0x110e:
            int r11 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x10d8
        L_0x1113:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions r8 = new com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x111c:
            int r4 = r0.readInt()
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType[] r3 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.values()     // Catch:{ 6C1 -> 0x1137 }
            int r2 = r3.length     // Catch:{ 6C1 -> 0x1137 }
            r1 = 0
        L_0x1126:
            if (r1 >= r2) goto L_0x1131
            r8 = r3[r1]     // Catch:{ 6C1 -> 0x1137 }
            int r0 = r8.A00     // Catch:{ 6C1 -> 0x1137 }
            if (r4 == r0) goto L_0x118b
            int r1 = r1 + 1
            goto L_0x1126
        L_0x1131:
            X.6C1 r0 = new X.6C1     // Catch:{ 6C1 -> 0x1137 }
            r0.<init>(r4)     // Catch:{ 6C1 -> 0x1137 }
            throw r0     // Catch:{ 6C1 -> 0x1137 }
        L_0x1137:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x113d:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r6 = 0
            r5 = r6
            r1 = 0
        L_0x1144:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x1165
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x1160
            r2 = 3
            if (r3 == r2) goto L_0x115b
            r2 = 4
            java.lang.String r5 = X.AnonymousClass7Kw.A0F(r0, r5, r3, r2, r4)
            goto L_0x1144
        L_0x115b:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x1144
        L_0x1160:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x1144
        L_0x1165:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r8 = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue
            r8.<init>(r1, r6, r5)
            return r8
        L_0x116e:
            int r4 = r0.readInt()
            com.google.android.gms.fido.u2f.api.common.ErrorCode[] r3 = com.google.android.gms.fido.u2f.api.common.ErrorCode.values()
            int r2 = r3.length
            r1 = 0
        L_0x1178:
            if (r1 >= r2) goto L_0x118c
            r8 = r3[r1]
            int r0 = r8.A00
            if (r4 == r0) goto L_0x118b
            int r1 = r1 + 1
            goto L_0x1178
        L_0x1183:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.common.api.Scope r8 = new com.google.android.gms.common.api.Scope
            r8.<init>(r1, r5)
        L_0x118b:
            return r8
        L_0x118c:
            com.google.android.gms.fido.u2f.api.common.ErrorCode r8 = com.google.android.gms.fido.u2f.api.common.ErrorCode.OTHER_ERROR
            return r8
        L_0x118f:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r5 = 0
            r1 = 0
        L_0x1195:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x11ae
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x11a9
            r2 = 3
            java.lang.String r5 = X.AnonymousClass7Kw.A0F(r0, r5, r3, r2, r4)
            goto L_0x1195
        L_0x11a9:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x1195
        L_0x11ae:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.fido.u2f.api.common.ErrorResponseData r8 = new com.google.android.gms.fido.u2f.api.common.ErrorResponseData
            r8.<init>(r1, r5)
            return r8
        L_0x11b7:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r7 = 0
            r6 = r7
            r5 = r7
            r1 = 0
        L_0x11bf:
            int r2 = r0.dataPosition()
            if (r2 >= r8) goto L_0x11f0
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x11eb
            r2 = 2
            if (r3 == r2) goto L_0x11e6
            r2 = 3
            if (r3 == r2) goto L_0x11e1
            r2 = 4
            if (r3 == r2) goto L_0x11da
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x11bf
        L_0x11da:
            android.os.Parcelable$Creator r2 = com.google.android.gms.fido.common.Transport.CREATOR
            java.util.ArrayList r5 = X.AnonymousClass7Kw.A0H(r0, r2, r4)
            goto L_0x11bf
        L_0x11e1:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x11bf
        L_0x11e6:
            byte[] r7 = X.AnonymousClass7Kw.A0O(r0, r4)
            goto L_0x11bf
        L_0x11eb:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x11bf
        L_0x11f0:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.fido.u2f.api.common.KeyHandle r8 = new com.google.android.gms.fido.u2f.api.common.KeyHandle
            r8.<init>(r6, r5, r7, r1)
            return r8
        L_0x11f9:
            java.lang.String r0 = r0.readString()
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r8 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.A00(r0)     // Catch:{ 6C2 -> 0x1202 }
            return r8
        L_0x1202:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x1208:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r7 = 0
            r6 = r7
            r5 = r7
            r1 = 0
        L_0x1210:
            int r2 = r0.dataPosition()
            if (r2 >= r8) goto L_0x1239
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x1234
            r2 = 2
            if (r3 == r2) goto L_0x122f
            r2 = 3
            if (r3 == r2) goto L_0x122a
            r2 = 4
            java.lang.String r5 = X.AnonymousClass7Kw.A0F(r0, r5, r3, r2, r4)
            goto L_0x1210
        L_0x122a:
            byte[] r6 = X.AnonymousClass7Kw.A0O(r0, r4)
            goto L_0x1210
        L_0x122f:
            java.lang.String r7 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x1210
        L_0x1234:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x1210
        L_0x1239:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.fido.u2f.api.common.RegisterRequest r8 = new com.google.android.gms.fido.u2f.api.common.RegisterRequest
            r8.<init>(r7, r5, r6, r1)
            return r8
        L_0x1242:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r12 = 0
            r11 = r12
            r9 = r12
            r14 = r12
            r15 = r12
            r10 = r12
            r13 = r12
        L_0x124d:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x128e
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x125f;
                case 3: goto L_0x1264;
                case 4: goto L_0x1269;
                case 5: goto L_0x1272;
                case 6: goto L_0x1279;
                case 7: goto L_0x1280;
                case 8: goto L_0x1289;
                default: goto L_0x125b;
            }
        L_0x125b:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x124d
        L_0x125f:
            java.lang.Integer r12 = X.AnonymousClass7Kw.A0D(r0, r2)
            goto L_0x124d
        L_0x1264:
            java.lang.Double r11 = X.AnonymousClass7Kw.A0C(r0, r2)
            goto L_0x124d
        L_0x1269:
            android.os.Parcelable$Creator r1 = android.net.Uri.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            android.net.Uri r9 = (android.net.Uri) r9
            goto L_0x124d
        L_0x1272:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.u2f.api.common.RegisterRequest.CREATOR
            java.util.ArrayList r14 = X.AnonymousClass7Kw.A0H(r0, r1, r2)
            goto L_0x124d
        L_0x1279:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.u2f.api.common.RegisteredKey.CREATOR
            java.util.ArrayList r15 = X.AnonymousClass7Kw.A0H(r0, r1, r2)
            goto L_0x124d
        L_0x1280:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.CREATOR
            android.os.Parcelable r10 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r10 = (com.google.android.gms.fido.u2f.api.common.ChannelIdValue) r10
            goto L_0x124d
        L_0x1289:
            java.lang.String r13 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x124d
        L_0x128e:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.fido.u2f.api.common.RegisterRequestParams r8 = new com.google.android.gms.fido.u2f.api.common.RegisterRequestParams
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L_0x1297:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r6 = 0
            r5 = r6
            r4 = r6
        L_0x129e:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x12bf
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x12ba
            r1 = 3
            if (r2 == r1) goto L_0x12b5
            r1 = 4
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x129e
        L_0x12b5:
            java.lang.String r5 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x129e
        L_0x12ba:
            byte[] r6 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x129e
        L_0x12bf:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.fido.u2f.api.common.RegisterResponseData r8 = new com.google.android.gms.fido.u2f.api.common.RegisterResponseData
            r8.<init>(r5, r4, r6)
            return r8
        L_0x12c8:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r6 = r1
            r5 = r1
        L_0x12cf:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x12f4
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x12eb
            r2 = 3
            if (r3 == r2) goto L_0x12e6
            r2 = 4
            java.lang.String r5 = X.AnonymousClass7Kw.A0F(r0, r5, r3, r2, r4)
            goto L_0x12cf
        L_0x12e6:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x12cf
        L_0x12eb:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.u2f.api.common.KeyHandle.CREATOR
            android.os.Parcelable r1 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.fido.u2f.api.common.KeyHandle r1 = (com.google.android.gms.fido.u2f.api.common.KeyHandle) r1
            goto L_0x12cf
        L_0x12f4:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.fido.u2f.api.common.RegisteredKey r8 = new com.google.android.gms.fido.u2f.api.common.RegisteredKey
            r8.<init>(r1, r6, r5)
            return r8
        L_0x12fd:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r12 = 0
            r11 = r12
            r9 = r12
            r15 = r12
            r14 = r12
            r10 = r12
            r13 = r12
        L_0x1308:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x1347
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x131a;
                case 3: goto L_0x131f;
                case 4: goto L_0x1324;
                case 5: goto L_0x132d;
                case 6: goto L_0x1332;
                case 7: goto L_0x1339;
                case 8: goto L_0x1342;
                default: goto L_0x1316;
            }
        L_0x1316:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x1308
        L_0x131a:
            java.lang.Integer r12 = X.AnonymousClass7Kw.A0D(r0, r2)
            goto L_0x1308
        L_0x131f:
            java.lang.Double r11 = X.AnonymousClass7Kw.A0C(r0, r2)
            goto L_0x1308
        L_0x1324:
            android.os.Parcelable$Creator r1 = android.net.Uri.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            android.net.Uri r9 = (android.net.Uri) r9
            goto L_0x1308
        L_0x132d:
            byte[] r15 = X.AnonymousClass7Kw.A0O(r0, r2)
            goto L_0x1308
        L_0x1332:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.u2f.api.common.RegisteredKey.CREATOR
            java.util.ArrayList r14 = X.AnonymousClass7Kw.A0H(r0, r1, r2)
            goto L_0x1308
        L_0x1339:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.CREATOR
            android.os.Parcelable r10 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r10 = (com.google.android.gms.fido.u2f.api.common.ChannelIdValue) r10
            goto L_0x1308
        L_0x1342:
            java.lang.String r13 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x1308
        L_0x1347:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.fido.u2f.api.common.SignRequestParams r8 = new com.google.android.gms.fido.u2f.api.common.SignRequestParams
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L_0x1350:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r7 = 0
            r6 = r7
            r5 = r7
            r4 = r7
        L_0x1358:
            int r1 = r0.dataPosition()
            if (r1 >= r8) goto L_0x1387
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x1382
            r1 = 3
            if (r2 == r1) goto L_0x137d
            r1 = 4
            if (r2 == r1) goto L_0x1378
            r1 = 5
            if (r2 == r1) goto L_0x1373
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x1358
        L_0x1373:
            byte[] r4 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x1358
        L_0x1378:
            byte[] r5 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x1358
        L_0x137d:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x1358
        L_0x1382:
            byte[] r7 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x1358
        L_0x1387:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.fido.u2f.api.common.SignResponseData r8 = new com.google.android.gms.fido.u2f.api.common.SignResponseData
            r8.<init>(r6, r7, r5, r4)
            return r8
        L_0x1390:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
        L_0x1395:
            int r2 = r0.dataPosition()
            if (r2 >= r5) goto L_0x13b0
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x13a7
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x1395
        L_0x13a7:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.credentials.Credential.CREATOR
            android.os.Parcelable r1 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.auth.api.credentials.Credential r1 = (com.google.android.gms.auth.api.credentials.Credential) r1
            goto L_0x1395
        L_0x13b0:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.internal.auth-api.zbp r8 = new com.google.android.gms.internal.auth-api.zbp
            r8.<init>(r1)
            return r8
        L_0x13b9:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
        L_0x13be:
            int r2 = r0.dataPosition()
            if (r2 >= r5) goto L_0x13d9
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x13d0
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x13be
        L_0x13d0:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.credentials.Credential.CREATOR
            android.os.Parcelable r1 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.auth.api.credentials.Credential r1 = (com.google.android.gms.auth.api.credentials.Credential) r1
            goto L_0x13be
        L_0x13d9:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.internal.auth-api.zbu r8 = new com.google.android.gms.internal.auth-api.zbu
            r8.<init>(r1)
            return r8
        L_0x13e2:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r4 = 0
        L_0x13e7:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x1403
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x13fb
            r1 = 2
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x13e7
        L_0x13fb:
            r1 = 4
            X.AnonymousClass7Kw.A0L(r0, r3, r1)
            r0.readInt()
            goto L_0x13e7
        L_0x1403:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.internal.auth.zzat r8 = new com.google.android.gms.internal.auth.zzat
            r8.<init>(r4)
            return r8
        L_0x140c:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r5 = 0
            r2 = 0
        L_0x1412:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x143c
            int r4 = r0.readInt()
            char r3 = (char) r4
            r1 = 1
            if (r3 == r1) goto L_0x1434
            r1 = 2
            if (r3 == r1) goto L_0x142f
            r1 = 3
            if (r3 == r1) goto L_0x142a
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x1412
        L_0x142a:
            int r2 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x1412
        L_0x142f:
            java.lang.String r5 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x1412
        L_0x1434:
            r1 = 4
            X.AnonymousClass7Kw.A0L(r0, r4, r1)
            r0.readInt()
            goto L_0x1412
        L_0x143c:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.internal.auth.zzaz r8 = new com.google.android.gms.internal.auth.zzaz
            r8.<init>(r5, r2)
            return r8
        L_0x1445:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r4 = 0
        L_0x144a:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x1466
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x145e
            r1 = 2
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x144a
        L_0x145e:
            r1 = 4
            X.AnonymousClass7Kw.A0L(r0, r3, r1)
            r0.readInt()
            goto L_0x144a
        L_0x1466:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.internal.auth.zzbb r8 = new com.google.android.gms.internal.auth.zzbb
            r8.<init>(r4)
            return r8
        L_0x146f:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r5 = 0
            r4 = r5
        L_0x1475:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x149f
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x1497
            r1 = 2
            if (r2 == r1) goto L_0x1492
            r1 = 3
            if (r2 == r1) goto L_0x148d
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x1475
        L_0x148d:
            byte[] r4 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x1475
        L_0x1492:
            java.lang.String r5 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x1475
        L_0x1497:
            r1 = 4
            X.AnonymousClass7Kw.A0L(r0, r3, r1)
            r0.readInt()
            goto L_0x1475
        L_0x149f:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.internal.auth.zzbd r8 = new com.google.android.gms.internal.auth.zzbd
            r8.<init>(r4, r5)
            return r8
        L_0x14a8:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r5 = 0
            r2 = r5
        L_0x14ae:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x14dc
            int r4 = r0.readInt()
            char r3 = (char) r4
            r1 = 1
            if (r3 == r1) goto L_0x14d4
            r1 = 2
            if (r3 == r1) goto L_0x14cf
            r1 = 3
            if (r3 == r1) goto L_0x14c6
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x14ae
        L_0x14c6:
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r2 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
            goto L_0x14ae
        L_0x14cf:
            java.lang.String r5 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x14ae
        L_0x14d4:
            r1 = 4
            X.AnonymousClass7Kw.A0L(r0, r4, r1)
            r0.readInt()
            goto L_0x14ae
        L_0x14dc:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.internal.auth.zzbf r8 = new com.google.android.gms.internal.auth.zzbf
            r8.<init>(r2, r5)
            return r8
        L_0x14e5:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r5 = 0
        L_0x14eb:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x1504
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x14ff
            r2 = 2
            java.lang.String r5 = X.AnonymousClass7Kw.A0F(r0, r5, r3, r2, r4)
            goto L_0x14eb
        L_0x14ff:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x14eb
        L_0x1504:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.internal.auth.zzcb r8 = new com.google.android.gms.internal.auth.zzcb
            r8.<init>(r1, r5)
            return r8
        L_0x150d:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = 0
            r14 = 0
            r16 = 1
            r17 = 0
            r15 = 0
        L_0x151c:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x1563
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x152e;
                case 3: goto L_0x1542;
                case 4: goto L_0x1547;
                case 5: goto L_0x1533;
                case 6: goto L_0x1538;
                case 7: goto L_0x1551;
                case 8: goto L_0x153d;
                case 9: goto L_0x155a;
                case 10: goto L_0x154c;
                default: goto L_0x152a;
            }
        L_0x152a:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x151c
        L_0x152e:
            java.lang.String r9 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x151c
        L_0x1533:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x151c
        L_0x1538:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x151c
        L_0x153d:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x151c
        L_0x1542:
            int r13 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x151c
        L_0x1547:
            int r14 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x151c
        L_0x154c:
            int r15 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x151c
        L_0x1551:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r16 = X.C18180wK.A1V(r1)
            goto L_0x151c
        L_0x155a:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r17 = X.C18180wK.A1V(r1)
            goto L_0x151c
        L_0x1563:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.internal.clearcut.zzr r8 = new com.google.android.gms.internal.clearcut.zzr
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r8
        L_0x156c:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
        L_0x1571:
            int r2 = r0.dataPosition()
            if (r2 >= r5) goto L_0x158c
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x1583
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x1571
        L_0x1583:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            goto L_0x1571
        L_0x158c:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.internal.location.zzac r8 = new com.google.android.gms.internal.location.zzac
            r8.<init>(r1)
            return r8
        L_0x1595:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            java.util.List r13 = com.google.android.gms.internal.location.zzbc.A0B
            r9 = 0
            r10 = r9
            r11 = r9
            r12 = r9
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x15ae:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x1614
            int r2 = r0.readInt()
            char r1 = (char) r2
            r4 = 1
            if (r1 == r4) goto L_0x160b
            switch(r1) {
                case 5: goto L_0x15c3;
                case 6: goto L_0x15ca;
                case 7: goto L_0x15de;
                case 8: goto L_0x15e7;
                case 9: goto L_0x15f0;
                case 10: goto L_0x15cf;
                case 11: goto L_0x15f9;
                case 12: goto L_0x1602;
                case 13: goto L_0x15d4;
                case 14: goto L_0x15d9;
                default: goto L_0x15bf;
            }
        L_0x15bf:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x15ae
        L_0x15c3:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.internal.ClientIdentity.CREATOR
            java.util.ArrayList r13 = X.AnonymousClass7Kw.A0H(r0, r1, r2)
            goto L_0x15ae
        L_0x15ca:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x15ae
        L_0x15cf:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x15ae
        L_0x15d4:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x15ae
        L_0x15d9:
            long r14 = X.AnonymousClass7Kw.A07(r0, r2)
            goto L_0x15ae
        L_0x15de:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r16 = X.C18180wK.A1V(r1)
            goto L_0x15ae
        L_0x15e7:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r17 = X.C18180wK.A1V(r1)
            goto L_0x15ae
        L_0x15f0:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r18 = X.C18180wK.A1V(r1)
            goto L_0x15ae
        L_0x15f9:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r19 = X.C18180wK.A1V(r1)
            goto L_0x15ae
        L_0x1602:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r20 = X.C18180wK.A1V(r1)
            goto L_0x15ae
        L_0x160b:
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.LocationRequest.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.location.LocationRequest r9 = (com.google.android.gms.location.LocationRequest) r9
            goto L_0x15ae
        L_0x1614:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.internal.location.zzbc r8 = new com.google.android.gms.internal.location.zzbc
            r8.<init>(r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20)
            return r8
        L_0x161d:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r13 = 0
            r10 = r13
            r9 = r13
            r11 = r13
            r12 = r13
            r14 = 1
        L_0x1627:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x165f
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x165a;
                case 2: goto L_0x1639;
                case 3: goto L_0x1642;
                case 4: goto L_0x1647;
                case 5: goto L_0x1650;
                case 6: goto L_0x1655;
                default: goto L_0x1635;
            }
        L_0x1635:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x1627
        L_0x1639:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.location.zzbc.CREATOR
            android.os.Parcelable r13 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.internal.location.zzbc r13 = (com.google.android.gms.internal.location.zzbc) r13
            goto L_0x1627
        L_0x1642:
            android.os.IBinder r10 = X.AnonymousClass7Kw.A0A(r0, r2)
            goto L_0x1627
        L_0x1647:
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
            goto L_0x1627
        L_0x1650:
            android.os.IBinder r11 = X.AnonymousClass7Kw.A0A(r0, r2)
            goto L_0x1627
        L_0x1655:
            android.os.IBinder r12 = X.AnonymousClass7Kw.A0A(r0, r2)
            goto L_0x1627
        L_0x165a:
            int r14 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x1627
        L_0x165f:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.internal.location.zzbe r8 = new com.google.android.gms.internal.location.zzbe
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x1668:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = 0
            r12 = 0
            r18 = 0
            r15 = 0
            r1 = 0
            r14 = 0
            r16 = 0
            r17 = -1
        L_0x167a:
            int r2 = r0.dataPosition()
            if (r2 >= r3) goto L_0x16ba
            int r4 = r0.readInt()
            char r2 = (char) r4
            switch(r2) {
                case 1: goto L_0x168c;
                case 2: goto L_0x1691;
                case 3: goto L_0x1696;
                case 4: goto L_0x169c;
                case 5: goto L_0x16a1;
                case 6: goto L_0x16a6;
                case 7: goto L_0x16ab;
                case 8: goto L_0x16b0;
                case 9: goto L_0x16b5;
                default: goto L_0x1688;
            }
        L_0x1688:
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x167a
        L_0x168c:
            java.lang.String r9 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x167a
        L_0x1691:
            long r18 = X.AnonymousClass7Kw.A07(r0, r4)
            goto L_0x167a
        L_0x1696:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            short r1 = (short) r1
            goto L_0x167a
        L_0x169c:
            double r10 = X.AnonymousClass7Kw.A00(r0, r4)
            goto L_0x167a
        L_0x16a1:
            double r12 = X.AnonymousClass7Kw.A00(r0, r4)
            goto L_0x167a
        L_0x16a6:
            float r14 = X.AnonymousClass7Kw.A01(r0, r4)
            goto L_0x167a
        L_0x16ab:
            int r15 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x167a
        L_0x16b0:
            int r16 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x167a
        L_0x16b5:
            int r17 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x167a
        L_0x16ba:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.internal.location.zzbg r8 = new com.google.android.gms.internal.location.zzbg
            r20 = r1
            r8.<init>(r9, r10, r12, r14, r15, r16, r17, r18, r20)
            return r8
        L_0x16c5:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            com.google.android.gms.location.zzo r1 = com.google.android.gms.internal.location.zzj.A03
            java.util.List r6 = com.google.android.gms.internal.location.zzj.A04
            r5 = 0
        L_0x16ce:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x16f5
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x16ec
            r2 = 2
            if (r3 == r2) goto L_0x16e5
            r2 = 3
            java.lang.String r5 = X.AnonymousClass7Kw.A0F(r0, r5, r3, r2, r4)
            goto L_0x16ce
        L_0x16e5:
            android.os.Parcelable$Creator r2 = com.google.android.gms.common.internal.ClientIdentity.CREATOR
            java.util.ArrayList r6 = X.AnonymousClass7Kw.A0H(r0, r2, r4)
            goto L_0x16ce
        L_0x16ec:
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.zzo.CREATOR
            android.os.Parcelable r1 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            com.google.android.gms.location.zzo r1 = (com.google.android.gms.location.zzo) r1
            goto L_0x16ce
        L_0x16f5:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.internal.location.zzj r8 = new com.google.android.gms.internal.location.zzj
            r8.<init>(r1, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.PCreatorCreatorShape5S0000000_I2_5.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new Scope[i];
            case 1:
                return new Status[i];
            case 2:
                return new BitmapTeleporter[i];
            case 3:
                return new DataHolder[i];
            case 4:
                return new WebImage[i];
            case 5:
                return new ClientIdentity[i];
            case 6:
                return new TelemetryData[i];
            case 7:
                return new MethodInvocation[i];
            case 8:
                return new zat[i];
            case 9:
                return new zav[i];
            case 10:
                return new zax[i];
            case 11:
                return new RootTelemetryConfiguration[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new zzaj[i];
            case 13:
                return new BinderWrapper[i];
            case 14:
                return new zzj[i];
            case 15:
                return new ConnectionTelemetryConfiguration[i];
            case 16:
                return new GetServiceRequest[i];
            case LangUtils.HASH_SEED /*17*/:
                return new zaa[i];
            case 18:
                return new StringToIntConverter[i];
            case 19:
                return new zac[i];
            case 20:
                return new FastJsonResponse$Field[i];
            case 21:
                return new zam[i];
            case 22:
                return new zan[i];
            case 23:
                return new zal[i];
            case 24:
                return new SafeParcelResponse[i];
            case 25:
                return new FavaDiagnosticsEntity[i];
            case Rfc3492Idn.tmax /*26*/:
                return new WakeLockEvent[i];
            case 27:
                return new ConnectionResult[i];
            case 28:
                return new Feature[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new zzn[i];
            case 30:
                return new zzq[i];
            case 31:
                return new zzs[i];
            case 32:
                return new Transport[i];
            case 33:
                return new Attachment[i];
            case 34:
                return new zzaa[i];
            case 35:
                return new GoogleThirdPartyPaymentExtension[i];
            case Rfc3492Idn.base /*36*/:
                return new zzad[i];
            case LangUtils.HASH_OFFSET /*37*/:
                return new PublicKeyCredentialCreationOptions[i];
            case Rfc3492Idn.skew /*38*/:
                return new PublicKeyCredential[i];
            case 39:
                return new PublicKeyCredentialDescriptor[i];
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                return new PublicKeyCredentialParameters[i];
            case Seq.NULL_REFNUM /*41*/:
                return new PublicKeyCredentialRequestOptions[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new PublicKeyCredentialRpEntity[i];
            case 43:
                return new PublicKeyCredentialType[i];
            case 44:
                return new PublicKeyCredentialUserEntity[i];
            case 45:
                return new ResidentKeyRequirement[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return new TokenBinding.TokenBindingStatus[i];
            case 47:
                return new TokenBinding[i];
            case 48:
                return new UserVerificationMethodExtension[i];
            case 49:
                return new zzat[i];
            case AnimationSpecKt.IDLE_DURATION /*50*/:
                return new UvmEntries[i];
            case 51:
                return new UvmEntry[i];
            case 52:
                return new AttestationConveyancePreference[i];
            case 53:
                return new AuthenticationExtensionsClientOutputs[i];
            case 54:
                return new AuthenticationExtensions[i];
            case 55:
                return new zze[i];
            case 56:
                return new AuthenticatorAssertionResponse[i];
            case 57:
                return new AuthenticatorAttestationResponse[i];
            case 58:
                return new AuthenticatorErrorResponse[i];
            case 59:
                return new AuthenticatorSelectionCriteria[i];
            case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /*60*/:
                return new BrowserPublicKeyCredentialCreationOptions[i];
            case 61:
                return new BrowserPublicKeyCredentialRequestOptions[i];
            case 62:
                return new COSEAlgorithmIdentifier[i];
            case StringTreeSet.PAYLOAD_MASK:
                return new com.google.android.gms.fido.fido2.api.common.zzn[i];
            case 64:
                return new zzp[i];
            case 65:
                return new zzr[i];
            case 66:
                return new ErrorCode[i];
            case 67:
                return new FidoAppIdExtension[i];
            case 68:
                return new FidoCredentialDetails[i];
            case 69:
                return new zzw[i];
            case LineChartView.MARGIN_TICKS /*70*/:
                return new zzy[i];
            case 71:
                return new SourceDirectTransferResult[i];
            case Rfc3492Idn.initial_bias /*72*/:
                return new SourceStartDirectTransferOptions[i];
            case 73:
                return new ChannelIdValue.ChannelIdValueType[i];
            case 74:
                return new ChannelIdValue[i];
            case 75:
                return new com.google.android.gms.fido.u2f.api.common.ErrorCode[i];
            case 76:
                return new ErrorResponseData[i];
            case 77:
                return new KeyHandle[i];
            case 78:
                return new ProtocolVersion[i];
            case 79:
                return new RegisterRequest[i];
            case 80:
                return new RegisterRequestParams[i];
            case 81:
                return new RegisterResponseData[i];
            case 82:
                return new RegisteredKey[i];
            case 83:
                return new SignRequestParams[i];
            case 84:
                return new SignResponseData[i];
            case 85:
                return new zbp[i];
            case 86:
                return new zbu[i];
            case 87:
                return new com.google.android.gms.internal.auth.zzat[i];
            case 88:
                return new zzaz[i];
            case 89:
                return new zzbb[i];
            case 90:
                return new zzbd[i];
            case 91:
                return new zzbf[i];
            case 92:
                return new zzcb[i];
            case 93:
                return new com.google.android.gms.internal.clearcut.zzr[i];
            case 94:
                return new zzac[i];
            case 95:
                return new zzbc[i];
            case 96:
                return new zzbe[i];
            case 97:
                return new zzbg[i];
            case 98:
                return new com.google.android.gms.internal.location.zzj[i];
            default:
                return new zzl[i];
        }
    }

    public static void A00(Parcel parcel, GetServiceRequest getServiceRequest, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, getServiceRequest.A0C);
        C122167Ky.A08(parcel, 2, getServiceRequest.A0D);
        C122167Ky.A08(parcel, 3, getServiceRequest.A00);
        C122167Ky.A0H(parcel, getServiceRequest.A05, 4, false);
        C122167Ky.A03(getServiceRequest.A04, parcel, 5);
        C122167Ky.A0M(parcel, getServiceRequest.A0B, 6, i);
        C122167Ky.A02(getServiceRequest.A03, parcel, 7);
        C122167Ky.A0D(parcel, getServiceRequest.A02, 8, i, false);
        C122167Ky.A0M(parcel, getServiceRequest.A09, 10, i);
        C122167Ky.A0M(parcel, getServiceRequest.A0A, 11, i);
        C122167Ky.A0B(parcel, 12, getServiceRequest.A07);
        C122167Ky.A08(parcel, 13, getServiceRequest.A01);
        C122167Ky.A0B(parcel, 14, getServiceRequest.A08);
        C122167Ky.A0H(parcel, getServiceRequest.A06, 15, false);
        C122167Ky.A05(parcel, A002);
    }
}
