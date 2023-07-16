package com.facebook.redex;

import android.os.Parcelable;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.impl.client.cache.CacheConfig;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.google.android.gms.internal.vision.zzab;
import com.google.android.gms.internal.vision.zzah;
import com.google.android.gms.internal.vision.zzaj;
import com.google.android.gms.internal.vision.zzal;
import com.google.android.gms.internal.vision.zzam;
import com.google.android.gms.internal.vision.zzao;
import com.google.android.gms.internal.vision.zzfz;
import com.google.android.gms.internal.vision.zzk;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.zzay;
import com.google.android.gms.location.zzbd;
import com.google.android.gms.location.zzbe;
import com.google.android.gms.location.zzo;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.zzi;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;
import com.google.android.gms.safetynet.zzh;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.material.badge.BadgeDrawable$SavedState;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CompositeDateValidator;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.internal.ParcelableSparseBooleanArray;
import com.google.android.material.internal.ParcelableSparseIntArray;
import com.google.android.material.navigation.NavigationBarPresenter$SavedState;
import com.google.android.material.slider.BaseSlider$SliderState;
import com.google.android.material.slider.RangeSlider$RangeSliderState;
import com.google.android.material.timepicker.TimeModel;
import com.google.android.play.core.review.ReviewInfo;
import com.google.firebase.iid.zzm;
import com.google.firebase.messaging.RemoteMessage;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.analytics.ppr.loggingdata.PPRLoggingData;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.AchievementButtonInfo;
import com.instagram.api.schemas.AchievementName;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.ActionType;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.api.schemas.AdproObjectiveTypesEnum;
import com.instagram.api.schemas.AdproRegulatedCategory;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.AdsTargetingGender;
import com.instagram.api.schemas.ApiAdFormats;
import com.instagram.api.schemas.AppColorMode;
import com.instagram.api.schemas.AppSwitcherBadgeStatus;
import com.instagram.api.schemas.AssetRecommendationType;
import com.instagram.api.schemas.AssetType;
import com.instagram.api.schemas.AudienceValidationActionType;
import com.instagram.api.schemas.AudienceValidationResponseStatus;
import com.instagram.api.schemas.AudioBrowserCategoryType;
import com.instagram.api.schemas.AudioBrowserPlaylistType;
import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.api.schemas.AvatarNoteResponseInfo;
import com.instagram.debug.devoptions.cam.AnimationSpecKt;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.debug.devoptions.debughead.linechart.LineChartView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

public class PCreatorCreatorShape6S0000000_I2_6 implements Parcelable.Creator {
    public final int A00;

    public PCreatorCreatorShape6S0000000_I2_6(int i) {
        this.A00 = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.os.Parcel} */
    /* JADX WARNING: CFG modification limit reached, blocks count: 1161 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r26) {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.A00
            r0 = r26
            switch(r1) {
                case 0: goto L_0x0063;
                case 1: goto L_0x00af;
                case 2: goto L_0x0128;
                case 3: goto L_0x0151;
                case 4: goto L_0x016c;
                case 5: goto L_0x018b;
                case 6: goto L_0x01e4;
                case 7: goto L_0x022e;
                case 8: goto L_0x0260;
                case 9: goto L_0x02aa;
                case 10: goto L_0x02e4;
                case 11: goto L_0x0318;
                case 12: goto L_0x0367;
                case 13: goto L_0x03c7;
                case 14: goto L_0x03ef;
                case 15: goto L_0x0421;
                case 16: goto L_0x046f;
                case 17: goto L_0x04a5;
                case 18: goto L_0x0500;
                case 19: goto L_0x0542;
                case 20: goto L_0x0578;
                case 21: goto L_0x05c5;
                case 22: goto L_0x05f3;
                case 23: goto L_0x062b;
                case 24: goto L_0x0666;
                case 25: goto L_0x0696;
                case 26: goto L_0x06c4;
                case 27: goto L_0x0718;
                case 28: goto L_0x0753;
                case 29: goto L_0x07a3;
                case 30: goto L_0x07f9;
                case 31: goto L_0x0818;
                case 32: goto L_0x0848;
                case 33: goto L_0x0891;
                case 34: goto L_0x08b0;
                case 35: goto L_0x08e2;
                case 36: goto L_0x0934;
                case 37: goto L_0x096f;
                case 38: goto L_0x0997;
                case 39: goto L_0x09c9;
                case 40: goto L_0x0a08;
                case 41: goto L_0x0a36;
                case 42: goto L_0x0af0;
                case 43: goto L_0x0b44;
                case 44: goto L_0x0b9d;
                case 45: goto L_0x0bee;
                case 46: goto L_0x0c28;
                case 47: goto L_0x0ca2;
                case 48: goto L_0x0ceb;
                case 49: goto L_0x0d1b;
                case 50: goto L_0x0d43;
                case 51: goto L_0x0d6b;
                case 52: goto L_0x0d9b;
                case 53: goto L_0x0dc3;
                case 54: goto L_0x0df5;
                case 55: goto L_0x0e82;
                case 56: goto L_0x0ece;
                case 57: goto L_0x0f07;
                case 58: goto L_0x0f0d;
                case 59: goto L_0x0f2f;
                case 60: goto L_0x0f51;
                case 61: goto L_0x0f5b;
                case 62: goto L_0x0f65;
                case 63: goto L_0x0f72;
                case 64: goto L_0x0f8a;
                case 65: goto L_0x0023;
                case 66: goto L_0x0043;
                case 67: goto L_0x0fa8;
                case 68: goto L_0x0fae;
                case 69: goto L_0x0fb4;
                case 70: goto L_0x0fba;
                case 71: goto L_0x0fd0;
                case 72: goto L_0x0f9a;
                case 73: goto L_0x0fe2;
                case 74: goto L_0x1007;
                case 75: goto L_0x1025;
                case 76: goto L_0x1043;
                case 77: goto L_0x1052;
                case 78: goto L_0x1061;
                case 79: goto L_0x10a3;
                case 80: goto L_0x10b1;
                case 81: goto L_0x10c0;
                case 82: goto L_0x10cf;
                case 83: goto L_0x10de;
                case 84: goto L_0x10ed;
                case 85: goto L_0x10fc;
                case 86: goto L_0x110b;
                case 87: goto L_0x111a;
                case 88: goto L_0x1129;
                case 89: goto L_0x1138;
                case 90: goto L_0x1147;
                case 91: goto L_0x1156;
                case 92: goto L_0x1165;
                case 93: goto L_0x1174;
                case 94: goto L_0x1183;
                case 95: goto L_0x1192;
                case 96: goto L_0x11a1;
                case 97: goto L_0x11b0;
                case 98: goto L_0x11bf;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            java.lang.Class<com.instagram.api.schemas.AvatarNoteResponseInfo> r1 = com.instagram.api.schemas.AvatarNoteResponseInfo.class
            android.os.Parcelable r2 = X.C18180wK.A0A(r0, r1)
            com.instagram.api.schemas.MediaType r2 = (com.instagram.api.schemas.MediaType) r2
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.api.schemas.AvatarNoteResponseInfo r8 = new com.instagram.api.schemas.AvatarNoteResponseInfo
            r8.<init>(r2, r1, r0)
        L_0x0022:
            return r8
        L_0x0023:
            int r5 = r0.readInt()
            com.google.android.material.internal.ParcelableSparseBooleanArray r8 = new com.google.android.material.internal.ParcelableSparseBooleanArray
            r8.<init>(r5)
            int[] r4 = new int[r5]
            boolean[] r3 = new boolean[r5]
            r0.readIntArray(r4)
            r0.readBooleanArray(r3)
            r2 = 0
        L_0x0037:
            if (r2 >= r5) goto L_0x0022
            r1 = r4[r2]
            boolean r0 = r3[r2]
            r8.put(r1, r0)
            int r2 = r2 + 1
            goto L_0x0037
        L_0x0043:
            int r5 = r0.readInt()
            com.google.android.material.internal.ParcelableSparseIntArray r8 = new com.google.android.material.internal.ParcelableSparseIntArray
            r8.<init>(r5)
            int[] r4 = new int[r5]
            int[] r3 = new int[r5]
            r0.readIntArray(r4)
            r0.readIntArray(r3)
            r2 = 0
        L_0x0057:
            if (r2 >= r5) goto L_0x0022
            r1 = r4[r2]
            r0 = r3[r2]
            r8.put(r1, r0)
            int r2 = r2 + 1
            goto L_0x0057
        L_0x0063:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x006c:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x00a6
            int r4 = r0.readInt()
            char r3 = (char) r4
            r1 = 2
            if (r3 == r1) goto L_0x00a1
            r1 = 3
            if (r3 == r1) goto L_0x009c
            r2 = 4
            if (r3 == r2) goto L_0x0097
            r1 = 5
            if (r3 == r1) goto L_0x0092
            r1 = 6
            if (r3 == r1) goto L_0x008a
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x006c
        L_0x008a:
            X.AnonymousClass7Kw.A0L(r0, r4, r2)
            float r13 = r0.readFloat()
            goto L_0x006c
        L_0x0092:
            int r12 = X.AnonymousClass7Kw.A03(r0, r4)
            goto L_0x006c
        L_0x0097:
            int r11 = X.AnonymousClass7Kw.A03(r0, r4)
            goto L_0x006c
        L_0x009c:
            int r10 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x006c
        L_0x00a1:
            int r9 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x006c
        L_0x00a6:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.internal.vision.zzab r8 = new com.google.android.gms.internal.vision.zzab
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x00af:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r14 = 0
            r9 = r14
            r10 = r14
            r11 = r14
            r12 = r14
            r13 = r14
            r15 = 0
            r16 = 0
            r19 = 0
            r17 = 0
            r18 = 0
        L_0x00c2:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x011f
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x00d4;
                case 3: goto L_0x00dd;
                case 4: goto L_0x00e6;
                case 5: goto L_0x00ef;
                case 6: goto L_0x00f8;
                case 7: goto L_0x0102;
                case 8: goto L_0x00fd;
                case 9: goto L_0x0107;
                case 10: goto L_0x0116;
                case 11: goto L_0x010c;
                case 12: goto L_0x0111;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x00c2
        L_0x00d4:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.vision.zzao.CREATOR
            java.lang.Object[] r14 = X.AnonymousClass7Kw.A0Q(r0, r1, r2)
            com.google.android.gms.internal.vision.zzao[] r14 = (com.google.android.gms.internal.vision.zzao[]) r14
            goto L_0x00c2
        L_0x00dd:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.vision.zzab.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.internal.vision.zzab r9 = (com.google.android.gms.internal.vision.zzab) r9
            goto L_0x00c2
        L_0x00e6:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.vision.zzab.CREATOR
            android.os.Parcelable r10 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.internal.vision.zzab r10 = (com.google.android.gms.internal.vision.zzab) r10
            goto L_0x00c2
        L_0x00ef:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.vision.zzab.CREATOR
            android.os.Parcelable r11 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.internal.vision.zzab r11 = (com.google.android.gms.internal.vision.zzab) r11
            goto L_0x00c2
        L_0x00f8:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x00c2
        L_0x00fd:
            java.lang.String r13 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x00c2
        L_0x0102:
            float r15 = X.AnonymousClass7Kw.A01(r0, r2)
            goto L_0x00c2
        L_0x0107:
            int r16 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x00c2
        L_0x010c:
            int r17 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x00c2
        L_0x0111:
            int r18 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x00c2
        L_0x0116:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r19 = X.C18180wK.A1V(r1)
            goto L_0x00c2
        L_0x011f:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.internal.vision.zzah r8 = new com.google.android.gms.internal.vision.zzah
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r8
        L_0x0128:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
        L_0x012d:
            int r2 = r0.dataPosition()
            if (r2 >= r5) goto L_0x0148
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x013f
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x012d
        L_0x013f:
            android.os.Parcelable$Creator r1 = android.graphics.Rect.CREATOR
            android.os.Parcelable r1 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            goto L_0x012d
        L_0x0148:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.internal.vision.zzaj r8 = new com.google.android.gms.internal.vision.zzaj
            r8.<init>(r1)
            return r8
        L_0x0151:
            int r2 = X.AnonymousClass7Kw.A02(r0)
        L_0x0155:
            int r1 = r0.dataPosition()
            if (r1 >= r2) goto L_0x0163
            int r1 = r0.readInt()
            X.AnonymousClass7Kw.A0J(r0, r1)
            goto L_0x0155
        L_0x0163:
            X.AnonymousClass7Kw.A0I(r0, r2)
            com.google.android.gms.internal.vision.zzal r8 = new com.google.android.gms.internal.vision.zzal
            r8.<init>()
            return r8
        L_0x016c:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r4 = 0
        L_0x0171:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x0182
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x0171
        L_0x0182:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.internal.vision.zzam r8 = new com.google.android.gms.internal.vision.zzam
            r8.<init>(r4)
            return r8
        L_0x018b:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r13 = 0
            r9 = r13
            r10 = r13
            r11 = r13
            r12 = r13
            r14 = 0
            r15 = 0
        L_0x0196:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x01db
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x01a8;
                case 3: goto L_0x01b1;
                case 4: goto L_0x01ba;
                case 5: goto L_0x01c3;
                case 6: goto L_0x01cd;
                case 7: goto L_0x01c8;
                case 8: goto L_0x01d2;
                default: goto L_0x01a4;
            }
        L_0x01a4:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0196
        L_0x01a8:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.vision.zzal.CREATOR
            java.lang.Object[] r13 = X.AnonymousClass7Kw.A0Q(r0, r1, r2)
            com.google.android.gms.internal.vision.zzal[] r13 = (com.google.android.gms.internal.vision.zzal[]) r13
            goto L_0x0196
        L_0x01b1:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.vision.zzab.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.internal.vision.zzab r9 = (com.google.android.gms.internal.vision.zzab) r9
            goto L_0x0196
        L_0x01ba:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.vision.zzab.CREATOR
            android.os.Parcelable r10 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.internal.vision.zzab r10 = (com.google.android.gms.internal.vision.zzab) r10
            goto L_0x0196
        L_0x01c3:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0196
        L_0x01c8:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0196
        L_0x01cd:
            float r14 = X.AnonymousClass7Kw.A01(r0, r2)
            goto L_0x0196
        L_0x01d2:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r15 = X.C18180wK.A1V(r1)
            goto L_0x0196
        L_0x01db:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.internal.vision.zzao r8 = new com.google.android.gms.internal.vision.zzao
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L_0x01e4:
            int r4 = X.AnonymousClass7Kw.A02(r0)
            r12 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = 0
        L_0x01ee:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x0225
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0220
            r1 = 2
            if (r2 == r1) goto L_0x021b
            r1 = 3
            if (r2 == r1) goto L_0x0216
            r1 = 4
            if (r2 == r1) goto L_0x0211
            r1 = 5
            if (r2 == r1) goto L_0x020c
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x01ee
        L_0x020c:
            long r12 = X.AnonymousClass7Kw.A07(r0, r3)
            goto L_0x01ee
        L_0x0211:
            int r14 = X.AnonymousClass7Kw.A03(r0, r3)
            goto L_0x01ee
        L_0x0216:
            int r11 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x01ee
        L_0x021b:
            int r10 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x01ee
        L_0x0220:
            int r9 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x01ee
        L_0x0225:
            X.AnonymousClass7Kw.A0I(r0, r4)
            com.google.android.gms.internal.vision.zzfz r8 = new com.google.android.gms.internal.vision.zzfz
            r8.<init>(r9, r10, r11, r12, r14)
            return r8
        L_0x022e:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r2 = 0
        L_0x0234:
            int r3 = r0.dataPosition()
            if (r3 >= r6) goto L_0x0257
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 2
            if (r4 == r3) goto L_0x0252
            r3 = 3
            if (r4 == r3) goto L_0x0249
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x0234
        L_0x0249:
            int r2 = X.AnonymousClass7Kw.A04(r0, r5)
            boolean r2 = X.C18180wK.A1V(r2)
            goto L_0x0234
        L_0x0252:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x0234
        L_0x0257:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.internal.vision.zzk r8 = new com.google.android.gms.internal.vision.zzk
            r8.<init>(r1, r2)
            return r8
        L_0x0260:
            int r4 = X.AnonymousClass7Kw.A02(r0)
            r12 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = 0
        L_0x026a:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x02a1
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x029c
            r1 = 3
            if (r2 == r1) goto L_0x0297
            r1 = 4
            if (r2 == r1) goto L_0x0292
            r1 = 5
            if (r2 == r1) goto L_0x028d
            r1 = 6
            if (r2 == r1) goto L_0x0288
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x026a
        L_0x0288:
            int r14 = X.AnonymousClass7Kw.A03(r0, r3)
            goto L_0x026a
        L_0x028d:
            long r12 = X.AnonymousClass7Kw.A07(r0, r3)
            goto L_0x026a
        L_0x0292:
            int r11 = X.AnonymousClass7Kw.A03(r0, r3)
            goto L_0x026a
        L_0x0297:
            int r10 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x026a
        L_0x029c:
            int r9 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x026a
        L_0x02a1:
            X.AnonymousClass7Kw.A0I(r0, r4)
            com.google.android.gms.internal.vision.zzs r8 = new com.google.android.gms.internal.vision.zzs
            r8.<init>(r9, r10, r11, r12, r14)
            return r8
        L_0x02aa:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r7 = 0
            r6 = r7
            r5 = r7
            r1 = 0
        L_0x02b2:
            int r2 = r0.dataPosition()
            if (r2 >= r8) goto L_0x02db
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x02d6
            r2 = 2
            if (r3 == r2) goto L_0x02d1
            r2 = 3
            if (r3 == r2) goto L_0x02cc
            r2 = 4
            java.lang.String r5 = X.AnonymousClass7Kw.A0F(r0, r5, r3, r2, r4)
            goto L_0x02b2
        L_0x02cc:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x02b2
        L_0x02d1:
            java.lang.String r7 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x02b2
        L_0x02d6:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x02b2
        L_0x02db:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.location.places.PlaceReport r8 = new com.google.android.gms.location.places.PlaceReport
            r8.<init>(r1, r7, r6, r5)
            return r8
        L_0x02e4:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r6 = 0
            r2 = 0
            java.lang.String r5 = ""
        L_0x02ec:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x030f
            int r4 = r0.readInt()
            char r3 = (char) r4
            r1 = 1
            if (r3 == r1) goto L_0x0308
            r1 = 2
            if (r3 == r1) goto L_0x0303
            r1 = 3
            java.lang.String r5 = X.AnonymousClass7Kw.A0F(r0, r5, r3, r1, r4)
            goto L_0x02ec
        L_0x0303:
            int r2 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x02ec
        L_0x0308:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.location.zzbg.CREATOR
            java.util.ArrayList r6 = X.AnonymousClass7Kw.A0H(r0, r1, r4)
            goto L_0x02ec
        L_0x030f:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.location.GeofencingRequest r8 = new com.google.android.gms.location.GeofencingRequest
            r8.<init>(r6, r2, r5)
            return r8
        L_0x0318:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r4 = 1
            r9 = 0
            r13 = 0
            r10 = 1000(0x3e8, float:1.401E-42)
            r11 = 1
            r12 = 1
        L_0x0324:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x035e
            int r3 = r0.readInt()
            char r2 = (char) r3
            if (r2 == r4) goto L_0x0359
            r1 = 2
            if (r2 == r1) goto L_0x0354
            r1 = 3
            if (r2 == r1) goto L_0x034f
            r1 = 4
            if (r2 == r1) goto L_0x034a
            r1 = 5
            if (r2 == r1) goto L_0x0341
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0324
        L_0x0341:
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.zzbd.CREATOR
            java.lang.Object[] r9 = X.AnonymousClass7Kw.A0Q(r0, r1, r3)
            com.google.android.gms.location.zzbd[] r9 = (com.google.android.gms.location.zzbd[]) r9
            goto L_0x0324
        L_0x034a:
            int r10 = X.AnonymousClass7Kw.A03(r0, r3)
            goto L_0x0324
        L_0x034f:
            long r13 = X.AnonymousClass7Kw.A07(r0, r3)
            goto L_0x0324
        L_0x0354:
            int r12 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x0324
        L_0x0359:
            int r11 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x0324
        L_0x035e:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.location.LocationAvailability r8 = new com.google.android.gms.location.LocationAvailability
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x0367:
            int r2 = X.AnonymousClass7Kw.A02(r0)
            r12 = 3600000(0x36ee80, double:1.7786363E-317)
            r14 = 600000(0x927c0, double:2.964394E-318)
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = 0
            r10 = 102(0x66, float:1.43E-43)
            r20 = 0
            r11 = 2147483647(0x7fffffff, float:NaN)
            r9 = 0
        L_0x0380:
            int r1 = r0.dataPosition()
            if (r1 >= r2) goto L_0x03be
            int r3 = r0.readInt()
            char r1 = (char) r3
            switch(r1) {
                case 1: goto L_0x0392;
                case 2: goto L_0x0397;
                case 3: goto L_0x039c;
                case 4: goto L_0x03b5;
                case 5: goto L_0x03a1;
                case 6: goto L_0x03a6;
                case 7: goto L_0x03ab;
                case 8: goto L_0x03b0;
                default: goto L_0x038e;
            }
        L_0x038e:
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0380
        L_0x0392:
            int r10 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x0380
        L_0x0397:
            long r12 = X.AnonymousClass7Kw.A07(r0, r3)
            goto L_0x0380
        L_0x039c:
            long r14 = X.AnonymousClass7Kw.A07(r0, r3)
            goto L_0x0380
        L_0x03a1:
            long r16 = X.AnonymousClass7Kw.A07(r0, r3)
            goto L_0x0380
        L_0x03a6:
            int r11 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x0380
        L_0x03ab:
            float r9 = X.AnonymousClass7Kw.A01(r0, r3)
            goto L_0x0380
        L_0x03b0:
            long r18 = X.AnonymousClass7Kw.A07(r0, r3)
            goto L_0x0380
        L_0x03b5:
            int r1 = X.AnonymousClass7Kw.A04(r0, r3)
            boolean r20 = X.C18180wK.A1V(r1)
            goto L_0x0380
        L_0x03be:
            X.AnonymousClass7Kw.A0I(r0, r2)
            com.google.android.gms.location.LocationRequest r8 = new com.google.android.gms.location.LocationRequest
            r8.<init>(r9, r10, r11, r12, r14, r16, r18, r20)
            return r8
        L_0x03c7:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            java.util.List r4 = com.google.android.gms.location.LocationResult.A01
        L_0x03cd:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x03e6
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x03df
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x03cd
        L_0x03df:
            android.os.Parcelable$Creator r1 = android.location.Location.CREATOR
            java.util.ArrayList r4 = X.AnonymousClass7Kw.A0H(r0, r1, r3)
            goto L_0x03cd
        L_0x03e6:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.location.LocationResult r8 = new com.google.android.gms.location.LocationResult
            r8.<init>(r4)
            return r8
        L_0x03ef:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            java.lang.String r6 = ""
            r5 = r6
            r4 = r6
        L_0x03f7:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x0418
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0413
            r1 = 2
            if (r2 == r1) goto L_0x040e
            r1 = 5
            java.lang.String r6 = X.AnonymousClass7Kw.A0F(r0, r6, r2, r1, r3)
            goto L_0x03f7
        L_0x040e:
            java.lang.String r4 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x03f7
        L_0x0413:
            java.lang.String r5 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x03f7
        L_0x0418:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.location.zzay r8 = new com.google.android.gms.location.zzay
            r8.<init>(r6, r5, r4)
            return r8
        L_0x0421:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r2 = 0
            r7 = 0
            r4 = r7
            r3 = 0
        L_0x0429:
            int r1 = r0.dataPosition()
            if (r1 >= r8) goto L_0x0466
            int r6 = r0.readInt()
            char r5 = (char) r6
            r1 = 1
            if (r5 == r1) goto L_0x045f
            r1 = 2
            if (r5 == r1) goto L_0x0456
            r1 = 3
            if (r5 == r1) goto L_0x044d
            r1 = 5
            if (r5 == r1) goto L_0x0444
            X.AnonymousClass7Kw.A0J(r0, r6)
            goto L_0x0429
        L_0x0444:
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.zzay.CREATOR
            android.os.Parcelable r4 = X.AnonymousClass7Kw.A0B(r0, r1, r6)
            com.google.android.gms.location.zzay r4 = (com.google.android.gms.location.zzay) r4
            goto L_0x0429
        L_0x044d:
            int r1 = X.AnonymousClass7Kw.A04(r0, r6)
            boolean r3 = X.C18180wK.A1V(r1)
            goto L_0x0429
        L_0x0456:
            int r1 = X.AnonymousClass7Kw.A04(r0, r6)
            boolean r2 = X.C18180wK.A1V(r1)
            goto L_0x0429
        L_0x045f:
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.LocationRequest.CREATOR
            java.util.ArrayList r7 = X.AnonymousClass7Kw.A0H(r0, r1, r6)
            goto L_0x0429
        L_0x0466:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.location.LocationSettingsRequest r8 = new com.google.android.gms.location.LocationSettingsRequest
            r8.<init>(r4, r7, r2, r3)
            return r8
        L_0x046f:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r2 = r1
        L_0x0475:
            int r3 = r0.dataPosition()
            if (r3 >= r6) goto L_0x049c
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x0493
            r3 = 2
            if (r4 == r3) goto L_0x048a
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x0475
        L_0x048a:
            android.os.Parcelable$Creator r2 = com.google.android.gms.location.LocationSettingsStates.CREATOR
            android.os.Parcelable r2 = X.AnonymousClass7Kw.A0B(r0, r2, r5)
            com.google.android.gms.location.LocationSettingsStates r2 = (com.google.android.gms.location.LocationSettingsStates) r2
            goto L_0x0475
        L_0x0493:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = X.AnonymousClass7Kw.A0B(r0, r1, r5)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            goto L_0x0475
        L_0x049c:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.location.LocationSettingsResult r8 = new com.google.android.gms.location.LocationSettingsResult
            r8.<init>(r1, r2)
            return r8
        L_0x04a5:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x04af:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x04f7
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x04c1;
                case 2: goto L_0x04ca;
                case 3: goto L_0x04d3;
                case 4: goto L_0x04dc;
                case 5: goto L_0x04e5;
                case 6: goto L_0x04ee;
                default: goto L_0x04bd;
            }
        L_0x04bd:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x04af
        L_0x04c1:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r9 = X.C18180wK.A1V(r1)
            goto L_0x04af
        L_0x04ca:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r10 = X.C18180wK.A1V(r1)
            goto L_0x04af
        L_0x04d3:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r11 = X.C18180wK.A1V(r1)
            goto L_0x04af
        L_0x04dc:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r12 = X.C18180wK.A1V(r1)
            goto L_0x04af
        L_0x04e5:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r13 = X.C18180wK.A1V(r1)
            goto L_0x04af
        L_0x04ee:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r14 = X.C18180wK.A1V(r1)
            goto L_0x04af
        L_0x04f7:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.location.LocationSettingsStates r8 = new com.google.android.gms.location.LocationSettingsStates
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x0500:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r4 = 1
            r11 = -1
            r13 = -1
            r9 = 1
            r10 = 1
        L_0x050b:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x0539
            int r3 = r0.readInt()
            char r2 = (char) r3
            if (r2 == r4) goto L_0x0534
            r1 = 2
            if (r2 == r1) goto L_0x052f
            r1 = 3
            if (r2 == r1) goto L_0x052a
            r1 = 4
            if (r2 == r1) goto L_0x0525
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x050b
        L_0x0525:
            long r13 = X.AnonymousClass7Kw.A07(r0, r3)
            goto L_0x050b
        L_0x052a:
            long r11 = X.AnonymousClass7Kw.A07(r0, r3)
            goto L_0x050b
        L_0x052f:
            int r10 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x050b
        L_0x0534:
            int r9 = X.AnonymousClass7Kw.A04(r0, r3)
            goto L_0x050b
        L_0x0539:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.location.zzbd r8 = new com.google.android.gms.location.zzbd
            r8.<init>(r9, r10, r11, r13)
            return r8
        L_0x0542:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r6 = 0
            java.lang.String r5 = ""
            r1 = r6
        L_0x054a:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x056f
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x056a
            r2 = 2
            if (r3 == r2) goto L_0x0561
            r2 = 3
            java.lang.String r5 = X.AnonymousClass7Kw.A0F(r0, r5, r3, r2, r4)
            goto L_0x054a
        L_0x0561:
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = X.AnonymousClass7Kw.A0B(r0, r1, r4)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            goto L_0x054a
        L_0x056a:
            java.util.ArrayList r6 = X.AnonymousClass7Kw.A0G(r0, r4)
            goto L_0x054a
        L_0x056f:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.location.zzbe r8 = new com.google.android.gms.location.zzbe
            r8.<init>(r1, r5, r6)
            return r8
        L_0x0578:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r10 = 0
            r12 = 0
            r14 = 0
            r9 = r10
            r11 = 0
        L_0x0583:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x05bc
            int r2 = r0.readInt()
            char r4 = (char) r2
            r1 = 1
            if (r4 == r1) goto L_0x05b5
            r1 = 2
            if (r4 == r1) goto L_0x05b0
            r1 = 3
            if (r4 == r1) goto L_0x05ab
            r1 = 4
            if (r4 == r1) goto L_0x05a6
            r1 = 5
            if (r4 == r1) goto L_0x05a1
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0583
        L_0x05a1:
            android.os.Bundle r9 = X.AnonymousClass7Kw.A09(r0, r2)
            goto L_0x0583
        L_0x05a6:
            int r11 = X.AnonymousClass7Kw.A03(r0, r2)
            goto L_0x0583
        L_0x05ab:
            long r14 = X.AnonymousClass7Kw.A07(r0, r2)
            goto L_0x0583
        L_0x05b0:
            long r12 = X.AnonymousClass7Kw.A07(r0, r2)
            goto L_0x0583
        L_0x05b5:
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.DetectedActivity.CREATOR
            java.util.ArrayList r10 = X.AnonymousClass7Kw.A0H(r0, r1, r2)
            goto L_0x0583
        L_0x05bc:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.location.ActivityRecognitionResult r8 = new com.google.android.gms.location.ActivityRecognitionResult
            r8.<init>(r9, r10, r11, r12, r14)
            return r8
        L_0x05c5:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r2 = 0
        L_0x05cb:
            int r3 = r0.dataPosition()
            if (r3 >= r6) goto L_0x05ea
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x05e5
            r3 = 2
            if (r4 == r3) goto L_0x05e0
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x05cb
        L_0x05e0:
            int r2 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x05cb
        L_0x05e5:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x05cb
        L_0x05ea:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.location.ActivityTransition r8 = new com.google.android.gms.location.ActivityTransition
            r8.<init>(r1, r2)
            return r8
        L_0x05f3:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r3 = 0
            r2 = 0
        L_0x05fb:
            int r5 = r0.dataPosition()
            if (r5 >= r8) goto L_0x0622
            int r7 = r0.readInt()
            char r6 = (char) r7
            r5 = 1
            if (r6 == r5) goto L_0x061d
            r5 = 2
            if (r6 == r5) goto L_0x0618
            r5 = 3
            if (r6 == r5) goto L_0x0613
            X.AnonymousClass7Kw.A0J(r0, r7)
            goto L_0x05fb
        L_0x0613:
            long r3 = X.AnonymousClass7Kw.A07(r0, r7)
            goto L_0x05fb
        L_0x0618:
            int r2 = X.AnonymousClass7Kw.A04(r0, r7)
            goto L_0x05fb
        L_0x061d:
            int r1 = X.AnonymousClass7Kw.A04(r0, r7)
            goto L_0x05fb
        L_0x0622:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.location.ActivityTransitionEvent r8 = new com.google.android.gms.location.ActivityTransitionEvent
            r8.<init>(r1, r2, r3)
            return r8
        L_0x062b:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r6 = 0
            r5 = r6
            r4 = r6
        L_0x0632:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x065d
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0656
            r1 = 2
            if (r2 == r1) goto L_0x0651
            r1 = 3
            if (r2 == r1) goto L_0x064a
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0632
        L_0x064a:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.internal.ClientIdentity.CREATOR
            java.util.ArrayList r4 = X.AnonymousClass7Kw.A0H(r0, r1, r3)
            goto L_0x0632
        L_0x0651:
            java.lang.String r5 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x0632
        L_0x0656:
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.ActivityTransition.CREATOR
            java.util.ArrayList r6 = X.AnonymousClass7Kw.A0H(r0, r1, r3)
            goto L_0x0632
        L_0x065d:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.location.ActivityTransitionRequest r8 = new com.google.android.gms.location.ActivityTransitionRequest
            r8.<init>(r5, r6, r4)
            return r8
        L_0x0666:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r5 = 0
            r4 = r5
        L_0x066c:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x068d
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0686
            r1 = 2
            if (r2 == r1) goto L_0x0681
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x066c
        L_0x0681:
            android.os.Bundle r4 = X.AnonymousClass7Kw.A09(r0, r3)
            goto L_0x066c
        L_0x0686:
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.ActivityTransitionEvent.CREATOR
            java.util.ArrayList r5 = X.AnonymousClass7Kw.A0H(r0, r1, r3)
            goto L_0x066c
        L_0x068d:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.location.ActivityTransitionResult r8 = new com.google.android.gms.location.ActivityTransitionResult
            r8.<init>(r4, r5)
            return r8
        L_0x0696:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r2 = 0
        L_0x069c:
            int r3 = r0.dataPosition()
            if (r3 >= r6) goto L_0x06bb
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x06b6
            r3 = 2
            if (r4 == r3) goto L_0x06b1
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x069c
        L_0x06b1:
            int r2 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x069c
        L_0x06b6:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x069c
        L_0x06bb:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.location.DetectedActivity r8 = new com.google.android.gms.location.DetectedActivity
            r8.<init>(r1, r2)
            return r8
        L_0x06c4:
            int r4 = X.AnonymousClass7Kw.A02(r0)
            r3 = 1
            r11 = 50
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = 1
            r9 = 0
            r10 = 2147483647(0x7fffffff, float:NaN)
        L_0x06d5:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x070f
            int r5 = r0.readInt()
            char r2 = (char) r5
            if (r2 == r3) goto L_0x0706
            r1 = 2
            if (r2 == r1) goto L_0x0701
            r1 = 3
            if (r2 == r1) goto L_0x06fc
            r1 = 4
            if (r2 == r1) goto L_0x06f7
            r1 = 5
            if (r2 == r1) goto L_0x06f2
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x06d5
        L_0x06f2:
            int r10 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x06d5
        L_0x06f7:
            long r13 = X.AnonymousClass7Kw.A07(r0, r5)
            goto L_0x06d5
        L_0x06fc:
            float r9 = X.AnonymousClass7Kw.A01(r0, r5)
            goto L_0x06d5
        L_0x0701:
            long r11 = X.AnonymousClass7Kw.A07(r0, r5)
            goto L_0x06d5
        L_0x0706:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            boolean r15 = X.C18180wK.A1V(r1)
            goto L_0x06d5
        L_0x070f:
            X.AnonymousClass7Kw.A0I(r0, r4)
            com.google.android.gms.location.zzo r8 = new com.google.android.gms.location.zzo
            r8.<init>(r9, r10, r11, r13, r15)
            return r8
        L_0x0718:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r2 = 0
            r6 = r2
            r1 = 0
        L_0x071f:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x074a
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 2
            if (r4 == r3) goto L_0x0745
            r3 = 3
            if (r4 == r3) goto L_0x073c
            r3 = 4
            if (r4 == r3) goto L_0x0737
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x071f
        L_0x0737:
            java.lang.String[] r6 = X.AnonymousClass7Kw.A0R(r0, r5)
            goto L_0x071f
        L_0x073c:
            android.os.Parcelable$Creator r2 = com.google.android.gms.phenotype.zzi.CREATOR
            java.lang.Object[] r2 = X.AnonymousClass7Kw.A0Q(r0, r2, r5)
            com.google.android.gms.phenotype.zzi[] r2 = (com.google.android.gms.phenotype.zzi[]) r2
            goto L_0x071f
        L_0x0745:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x071f
        L_0x074a:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.phenotype.Configuration r8 = new com.google.android.gms.phenotype.Configuration
            r8.<init>(r2, r6, r1)
            return r8
        L_0x0753:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r11 = r9
            r16 = r9
        L_0x0760:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x079a
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x0772;
                case 3: goto L_0x0777;
                case 4: goto L_0x077c;
                case 5: goto L_0x0781;
                case 6: goto L_0x0786;
                case 7: goto L_0x078b;
                case 8: goto L_0x0790;
                case 9: goto L_0x0795;
                default: goto L_0x076e;
            }
        L_0x076e:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0760
        L_0x0772:
            java.lang.String r9 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0760
        L_0x0777:
            byte[] r10 = X.AnonymousClass7Kw.A0O(r0, r2)
            goto L_0x0760
        L_0x077c:
            byte[][] r12 = X.AnonymousClass7Kw.A0S(r0, r2)
            goto L_0x0760
        L_0x0781:
            byte[][] r13 = X.AnonymousClass7Kw.A0S(r0, r2)
            goto L_0x0760
        L_0x0786:
            byte[][] r14 = X.AnonymousClass7Kw.A0S(r0, r2)
            goto L_0x0760
        L_0x078b:
            byte[][] r15 = X.AnonymousClass7Kw.A0S(r0, r2)
            goto L_0x0760
        L_0x0790:
            int[] r11 = X.AnonymousClass7Kw.A0P(r0, r2)
            goto L_0x0760
        L_0x0795:
            byte[][] r16 = X.AnonymousClass7Kw.A0S(r0, r2)
            goto L_0x0760
        L_0x079a:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.phenotype.ExperimentTokens r8 = new com.google.android.gms.phenotype.ExperimentTokens
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
        L_0x07a3:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r11 = r9
            r16 = 0
            r12 = 0
            r18 = 0
            r14 = 0
            r15 = 0
        L_0x07b2:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x07f0
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x07c4;
                case 3: goto L_0x07d3;
                case 4: goto L_0x07e7;
                case 5: goto L_0x07d8;
                case 6: goto L_0x07c9;
                case 7: goto L_0x07ce;
                case 8: goto L_0x07dd;
                case 9: goto L_0x07e2;
                default: goto L_0x07c0;
            }
        L_0x07c0:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x07b2
        L_0x07c4:
            java.lang.String r9 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x07b2
        L_0x07c9:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x07b2
        L_0x07ce:
            byte[] r11 = X.AnonymousClass7Kw.A0O(r0, r2)
            goto L_0x07b2
        L_0x07d3:
            long r16 = X.AnonymousClass7Kw.A07(r0, r2)
            goto L_0x07b2
        L_0x07d8:
            double r12 = X.AnonymousClass7Kw.A00(r0, r2)
            goto L_0x07b2
        L_0x07dd:
            int r14 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x07b2
        L_0x07e2:
            int r15 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x07b2
        L_0x07e7:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r18 = X.C18180wK.A1V(r1)
            goto L_0x07b2
        L_0x07f0:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.phenotype.zzi r8 = new com.google.android.gms.phenotype.zzi
            r8.<init>(r9, r10, r11, r12, r14, r15, r16, r18)
            return r8
        L_0x07f9:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r4 = 0
        L_0x07fe:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x080f
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x07fe
        L_0x080f:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.safetynet.zza r8 = new com.google.android.gms.safetynet.zza
            r8.<init>(r4)
            return r8
        L_0x0818:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r6 = 0
            r5 = r6
            r4 = 0
        L_0x081f:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x083f
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x083a
            r1 = 3
            if (r2 == r1) goto L_0x0835
            int r4 = X.AnonymousClass7Kw.A06(r0, r2, r3, r4)
            goto L_0x081f
        L_0x0835:
            byte[] r5 = X.AnonymousClass7Kw.A0O(r0, r3)
            goto L_0x081f
        L_0x083a:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x081f
        L_0x083f:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.safetynet.HarmfulAppsData r8 = new com.google.android.gms.safetynet.HarmfulAppsData
            r8.<init>(r5, r4, r6)
            return r8
        L_0x0848:
            int r4 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r11 = 0
            r10 = 0
            r13 = 0
        L_0x0851:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x0888
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x0883
            r1 = 3
            if (r2 == r1) goto L_0x087a
            r1 = 4
            if (r2 == r1) goto L_0x0875
            r1 = 5
            if (r2 == r1) goto L_0x086c
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0851
        L_0x086c:
            int r1 = X.AnonymousClass7Kw.A04(r0, r3)
            boolean r13 = X.C18180wK.A1V(r1)
            goto L_0x0851
        L_0x0875:
            int r10 = X.AnonymousClass7Kw.A03(r0, r3)
            goto L_0x0851
        L_0x087a:
            android.os.Parcelable$Creator r1 = com.google.android.gms.safetynet.HarmfulAppsData.CREATOR
            java.lang.Object[] r9 = X.AnonymousClass7Kw.A0Q(r0, r1, r3)
            com.google.android.gms.safetynet.HarmfulAppsData[] r9 = (com.google.android.gms.safetynet.HarmfulAppsData[]) r9
            goto L_0x0851
        L_0x0883:
            long r11 = X.AnonymousClass7Kw.A07(r0, r3)
            goto L_0x0851
        L_0x0888:
            X.AnonymousClass7Kw.A0I(r0, r4)
            com.google.android.gms.safetynet.zzd r8 = new com.google.android.gms.safetynet.zzd
            r8.<init>(r9, r10, r11, r13)
            return r8
        L_0x0891:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r4 = 0
        L_0x0896:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x08a7
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x0896
        L_0x08a7:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.android.gms.safetynet.zzf r8 = new com.google.android.gms.safetynet.zzf
            r8.<init>(r4)
            return r8
        L_0x08b0:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r2 = 0
        L_0x08b6:
            int r3 = r0.dataPosition()
            if (r3 >= r6) goto L_0x08d9
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 2
            if (r4 == r3) goto L_0x08d4
            r3 = 3
            if (r4 == r3) goto L_0x08cb
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x08b6
        L_0x08cb:
            int r2 = X.AnonymousClass7Kw.A04(r0, r5)
            boolean r2 = X.C18180wK.A1V(r2)
            goto L_0x08b6
        L_0x08d4:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x08b6
        L_0x08d9:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.safetynet.zzh r8 = new com.google.android.gms.safetynet.zzh
            r8.<init>(r1, r2)
            return r8
        L_0x08e2:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r11 = 0
            r10 = r11
            r9 = r11
            r12 = r11
            r13 = 0
        L_0x08ec:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x092b
            int r2 = r0.readInt()
            char r4 = (char) r2
            r1 = 2
            if (r4 == r1) goto L_0x0926
            r1 = 3
            if (r4 == r1) goto L_0x091d
            r1 = 4
            if (r4 == r1) goto L_0x0914
            r1 = 5
            if (r4 == r1) goto L_0x090f
            r1 = 6
            if (r4 == r1) goto L_0x090a
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x08ec
        L_0x090a:
            byte[] r12 = X.AnonymousClass7Kw.A0O(r0, r2)
            goto L_0x08ec
        L_0x090f:
            long r13 = X.AnonymousClass7Kw.A07(r0, r2)
            goto L_0x08ec
        L_0x0914:
            android.os.Parcelable$Creator r1 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            android.os.ParcelFileDescriptor r9 = (android.os.ParcelFileDescriptor) r9
            goto L_0x08ec
        L_0x091d:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r10 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.common.data.DataHolder r10 = (com.google.android.gms.common.data.DataHolder) r10
            goto L_0x08ec
        L_0x0926:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x08ec
        L_0x092b:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.safetynet.SafeBrowsingData r8 = new com.google.android.gms.safetynet.SafeBrowsingData
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x0934:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r6 = 0
            r2 = 0
        L_0x093b:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x0966
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x0961
            r3 = 2
            if (r4 == r3) goto L_0x095c
            r3 = 3
            if (r4 == r3) goto L_0x0953
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x093b
        L_0x0953:
            android.os.Parcelable$Creator r3 = android.content.Intent.CREATOR
            android.os.Parcelable r6 = X.AnonymousClass7Kw.A0B(r0, r3, r5)
            android.content.Intent r6 = (android.content.Intent) r6
            goto L_0x093b
        L_0x095c:
            int r2 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x093b
        L_0x0961:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x093b
        L_0x0966:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.signin.internal.zaa r8 = new com.google.android.gms.signin.internal.zaa
            r8.<init>(r1, r2, r6)
            return r8
        L_0x096f:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r5 = 0
            r4 = r5
        L_0x0975:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x098e
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0989
            r1 = 2
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x0975
        L_0x0989:
            java.util.ArrayList r5 = X.AnonymousClass7Kw.A0G(r0, r3)
            goto L_0x0975
        L_0x098e:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.signin.internal.zag r8 = new com.google.android.gms.signin.internal.zag
            r8.<init>(r5, r4)
            return r8
        L_0x0997:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r2 = 0
        L_0x099d:
            int r3 = r0.dataPosition()
            if (r3 >= r6) goto L_0x09c0
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x09bb
            r3 = 2
            if (r4 == r3) goto L_0x09b2
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x099d
        L_0x09b2:
            android.os.Parcelable$Creator r2 = com.google.android.gms.common.internal.zat.CREATOR
            android.os.Parcelable r2 = X.AnonymousClass7Kw.A0B(r0, r2, r5)
            com.google.android.gms.common.internal.zat r2 = (com.google.android.gms.common.internal.zat) r2
            goto L_0x099d
        L_0x09bb:
            int r1 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x099d
        L_0x09c0:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.signin.internal.zai r8 = new com.google.android.gms.signin.internal.zai
            r8.<init>(r2, r1)
            return r8
        L_0x09c9:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r2 = 0
            r3 = r2
            r1 = 0
        L_0x09d0:
            int r4 = r0.dataPosition()
            if (r4 >= r7) goto L_0x09ff
            int r6 = r0.readInt()
            char r5 = (char) r6
            r4 = 1
            if (r5 == r4) goto L_0x09fa
            r4 = 2
            if (r5 == r4) goto L_0x09f1
            r4 = 3
            if (r5 == r4) goto L_0x09e8
            X.AnonymousClass7Kw.A0J(r0, r6)
            goto L_0x09d0
        L_0x09e8:
            android.os.Parcelable$Creator r3 = com.google.android.gms.common.internal.zav.CREATOR
            android.os.Parcelable r3 = X.AnonymousClass7Kw.A0B(r0, r3, r6)
            com.google.android.gms.common.internal.zav r3 = (com.google.android.gms.common.internal.zav) r3
            goto L_0x09d0
        L_0x09f1:
            android.os.Parcelable$Creator r2 = com.google.android.gms.common.ConnectionResult.CREATOR
            android.os.Parcelable r2 = X.AnonymousClass7Kw.A0B(r0, r2, r6)
            com.google.android.gms.common.ConnectionResult r2 = (com.google.android.gms.common.ConnectionResult) r2
            goto L_0x09d0
        L_0x09fa:
            int r1 = X.AnonymousClass7Kw.A04(r0, r6)
            goto L_0x09d0
        L_0x09ff:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.signin.internal.zak r8 = new com.google.android.gms.signin.internal.zak
            r8.<init>(r2, r3, r1)
            return r8
        L_0x0a08:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r5 = 0
        L_0x0a0e:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0a2d
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x0a28
            r2 = 3
            if (r3 == r2) goto L_0x0a23
            X.AnonymousClass7Kw.A0J(r0, r4)
            goto L_0x0a0e
        L_0x0a23:
            java.lang.String[] r5 = X.AnonymousClass7Kw.A0R(r0, r4)
            goto L_0x0a0e
        L_0x0a28:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x0a0e
        L_0x0a2d:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.vision.barcode.Barcode$Address r8 = new com.google.android.gms.vision.barcode.Barcode$Address
            r8.<init>(r1, r5)
            return r8
        L_0x0a36:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r18 = 0
            r19 = r18
            r1 = r18
            r12 = r1
            r14 = r1
            r15 = r1
            r4 = r1
            r5 = r1
            r13 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r20 = r1
            r22 = 0
            r23 = 0
            r24 = 0
        L_0x0a51:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0ae1
            int r2 = r0.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 2: goto L_0x0acc;
                case 3: goto L_0x0a63;
                case 4: goto L_0x0a68;
                case 5: goto L_0x0ad1;
                case 6: goto L_0x0a6d;
                case 7: goto L_0x0a76;
                case 8: goto L_0x0a7f;
                case 9: goto L_0x0a88;
                case 10: goto L_0x0a91;
                case 11: goto L_0x0a9a;
                case 12: goto L_0x0aa3;
                case 13: goto L_0x0aac;
                case 14: goto L_0x0ab5;
                case 15: goto L_0x0abe;
                case 16: goto L_0x0ac7;
                case 17: goto L_0x0ad7;
                default: goto L_0x0a5f;
            }
        L_0x0a5f:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0a51
        L_0x0a63:
            java.lang.String r18 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0a51
        L_0x0a68:
            java.lang.String r19 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0a51
        L_0x0a6d:
            android.os.Parcelable$Creator r1 = android.graphics.Point.CREATOR
            java.lang.Object[] r1 = X.AnonymousClass7Kw.A0Q(r0, r1, r2)
            android.graphics.Point[] r1 = (android.graphics.Point[]) r1
            goto L_0x0a51
        L_0x0a76:
            android.os.Parcelable$Creator r3 = com.google.android.gms.vision.barcode.Barcode.Email.CREATOR
            android.os.Parcelable r12 = X.AnonymousClass7Kw.A0B(r0, r3, r2)
            com.google.android.gms.vision.barcode.Barcode$Email r12 = (com.google.android.gms.vision.barcode.Barcode.Email) r12
            goto L_0x0a51
        L_0x0a7f:
            android.os.Parcelable$Creator r3 = com.google.android.gms.vision.barcode.Barcode.Phone.CREATOR
            android.os.Parcelable r14 = X.AnonymousClass7Kw.A0B(r0, r3, r2)
            com.google.android.gms.vision.barcode.Barcode$Phone r14 = (com.google.android.gms.vision.barcode.Barcode.Phone) r14
            goto L_0x0a51
        L_0x0a88:
            android.os.Parcelable$Creator r3 = com.google.android.gms.vision.barcode.Barcode.Sms.CREATOR
            android.os.Parcelable r15 = X.AnonymousClass7Kw.A0B(r0, r3, r2)
            com.google.android.gms.vision.barcode.Barcode$Sms r15 = (com.google.android.gms.vision.barcode.Barcode.Sms) r15
            goto L_0x0a51
        L_0x0a91:
            android.os.Parcelable$Creator r3 = com.google.android.gms.vision.barcode.Barcode.WiFi.CREATOR
            android.os.Parcelable r4 = X.AnonymousClass7Kw.A0B(r0, r3, r2)
            com.google.android.gms.vision.barcode.Barcode$WiFi r4 = (com.google.android.gms.vision.barcode.Barcode.WiFi) r4
            goto L_0x0a51
        L_0x0a9a:
            android.os.Parcelable$Creator r3 = com.google.android.gms.vision.barcode.Barcode.UrlBookmark.CREATOR
            android.os.Parcelable r5 = X.AnonymousClass7Kw.A0B(r0, r3, r2)
            com.google.android.gms.vision.barcode.Barcode$UrlBookmark r5 = (com.google.android.gms.vision.barcode.Barcode.UrlBookmark) r5
            goto L_0x0a51
        L_0x0aa3:
            android.os.Parcelable$Creator r3 = com.google.android.gms.vision.barcode.Barcode.GeoPoint.CREATOR
            android.os.Parcelable r13 = X.AnonymousClass7Kw.A0B(r0, r3, r2)
            com.google.android.gms.vision.barcode.Barcode$GeoPoint r13 = (com.google.android.gms.vision.barcode.Barcode.GeoPoint) r13
            goto L_0x0a51
        L_0x0aac:
            android.os.Parcelable$Creator r3 = com.google.android.gms.vision.barcode.Barcode.CalendarEvent.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r3, r2)
            com.google.android.gms.vision.barcode.Barcode$CalendarEvent r9 = (com.google.android.gms.vision.barcode.Barcode.CalendarEvent) r9
            goto L_0x0a51
        L_0x0ab5:
            android.os.Parcelable$Creator r3 = com.google.android.gms.vision.barcode.Barcode.ContactInfo.CREATOR
            android.os.Parcelable r10 = X.AnonymousClass7Kw.A0B(r0, r3, r2)
            com.google.android.gms.vision.barcode.Barcode$ContactInfo r10 = (com.google.android.gms.vision.barcode.Barcode.ContactInfo) r10
            goto L_0x0a51
        L_0x0abe:
            android.os.Parcelable$Creator r3 = com.google.android.gms.vision.barcode.Barcode.DriverLicense.CREATOR
            android.os.Parcelable r11 = X.AnonymousClass7Kw.A0B(r0, r3, r2)
            com.google.android.gms.vision.barcode.Barcode$DriverLicense r11 = (com.google.android.gms.vision.barcode.Barcode.DriverLicense) r11
            goto L_0x0a51
        L_0x0ac7:
            byte[] r20 = X.AnonymousClass7Kw.A0O(r0, r2)
            goto L_0x0a51
        L_0x0acc:
            int r22 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0a51
        L_0x0ad1:
            int r23 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0a51
        L_0x0ad7:
            int r2 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r24 = X.C18180wK.A1V(r2)
            goto L_0x0a51
        L_0x0ae1:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.vision.barcode.Barcode r8 = new com.google.android.gms.vision.barcode.Barcode
            r17 = r4
            r21 = r1
            r16 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r8
        L_0x0af0:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0afd:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0b3b
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x0b14;
                case 3: goto L_0x0b19;
                case 4: goto L_0x0b1e;
                case 5: goto L_0x0b23;
                case 6: goto L_0x0b28;
                case 7: goto L_0x0b2d;
                case 8: goto L_0x0b32;
                case 9: goto L_0x0b0f;
                default: goto L_0x0b0b;
            }
        L_0x0b0b:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0afd
        L_0x0b0f:
            java.lang.String r9 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0afd
        L_0x0b14:
            int r10 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0afd
        L_0x0b19:
            int r11 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0afd
        L_0x0b1e:
            int r12 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0afd
        L_0x0b23:
            int r13 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0afd
        L_0x0b28:
            int r14 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0afd
        L_0x0b2d:
            int r15 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0afd
        L_0x0b32:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r16 = X.C18180wK.A1V(r1)
            goto L_0x0afd
        L_0x0b3b:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.vision.barcode.Barcode$CalendarDateTime r8 = new com.google.android.gms.vision.barcode.Barcode$CalendarDateTime
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
        L_0x0b44:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r11 = r9
            r14 = r9
            r13 = r9
            r15 = r9
            r12 = r9
        L_0x0b4f:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0b94
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x0b61;
                case 3: goto L_0x0b6a;
                case 4: goto L_0x0b6f;
                case 5: goto L_0x0b74;
                case 6: goto L_0x0b7d;
                case 7: goto L_0x0b86;
                case 8: goto L_0x0b8b;
                default: goto L_0x0b5d;
            }
        L_0x0b5d:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0b4f
        L_0x0b61:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.barcode.Barcode.PersonName.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.vision.barcode.Barcode$PersonName r9 = (com.google.android.gms.vision.barcode.Barcode.PersonName) r9
            goto L_0x0b4f
        L_0x0b6a:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0b4f
        L_0x0b6f:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0b4f
        L_0x0b74:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.barcode.Barcode.Phone.CREATOR
            java.lang.Object[] r14 = X.AnonymousClass7Kw.A0Q(r0, r1, r2)
            com.google.android.gms.vision.barcode.Barcode$Phone[] r14 = (com.google.android.gms.vision.barcode.Barcode.Phone[]) r14
            goto L_0x0b4f
        L_0x0b7d:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.barcode.Barcode.Email.CREATOR
            java.lang.Object[] r13 = X.AnonymousClass7Kw.A0Q(r0, r1, r2)
            com.google.android.gms.vision.barcode.Barcode$Email[] r13 = (com.google.android.gms.vision.barcode.Barcode.Email[]) r13
            goto L_0x0b4f
        L_0x0b86:
            java.lang.String[] r15 = X.AnonymousClass7Kw.A0R(r0, r2)
            goto L_0x0b4f
        L_0x0b8b:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.barcode.Barcode.Address.CREATOR
            java.lang.Object[] r12 = X.AnonymousClass7Kw.A0Q(r0, r1, r2)
            com.google.android.gms.vision.barcode.Barcode$Address[] r12 = (com.google.android.gms.vision.barcode.Barcode.Address[]) r12
            goto L_0x0b4f
        L_0x0b94:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.vision.barcode.Barcode$ContactInfo r8 = new com.google.android.gms.vision.barcode.Barcode$ContactInfo
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L_0x0b9d:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r11 = 0
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r9 = r11
            r10 = r11
        L_0x0ba8:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0be5
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x0bba;
                case 3: goto L_0x0bbf;
                case 4: goto L_0x0bc4;
                case 5: goto L_0x0bc9;
                case 6: goto L_0x0bce;
                case 7: goto L_0x0bd3;
                case 8: goto L_0x0bdc;
                default: goto L_0x0bb6;
            }
        L_0x0bb6:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0ba8
        L_0x0bba:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0ba8
        L_0x0bbf:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0ba8
        L_0x0bc4:
            java.lang.String r13 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0ba8
        L_0x0bc9:
            java.lang.String r14 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0ba8
        L_0x0bce:
            java.lang.String r15 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0ba8
        L_0x0bd3:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.barcode.Barcode.CalendarDateTime.CREATOR
            android.os.Parcelable r9 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.vision.barcode.Barcode$CalendarDateTime r9 = (com.google.android.gms.vision.barcode.Barcode.CalendarDateTime) r9
            goto L_0x0ba8
        L_0x0bdc:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.barcode.Barcode.CalendarDateTime.CREATOR
            android.os.Parcelable r10 = X.AnonymousClass7Kw.A0B(r0, r1, r2)
            com.google.android.gms.vision.barcode.Barcode$CalendarDateTime r10 = (com.google.android.gms.vision.barcode.Barcode.CalendarDateTime) r10
            goto L_0x0ba8
        L_0x0be5:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.vision.barcode.Barcode$CalendarEvent r8 = new com.google.android.gms.vision.barcode.Barcode$CalendarEvent
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L_0x0bee:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r7 = 0
            r6 = r7
            r5 = r7
            r1 = 0
        L_0x0bf6:
            int r2 = r0.dataPosition()
            if (r2 >= r8) goto L_0x0c1f
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x0c1a
            r2 = 3
            if (r3 == r2) goto L_0x0c15
            r2 = 4
            if (r3 == r2) goto L_0x0c10
            r2 = 5
            java.lang.String r5 = X.AnonymousClass7Kw.A0F(r0, r5, r3, r2, r4)
            goto L_0x0bf6
        L_0x0c10:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x0bf6
        L_0x0c15:
            java.lang.String r7 = X.AnonymousClass7Kw.A0E(r0, r4)
            goto L_0x0bf6
        L_0x0c1a:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x0bf6
        L_0x0c1f:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.vision.barcode.Barcode$Email r8 = new com.google.android.gms.vision.barcode.Barcode$Email
            r8.<init>(r1, r7, r6, r5)
            return r8
        L_0x0c28:
            int r2 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r20 = r9
            r21 = r9
            r22 = r9
        L_0x0c41:
            int r1 = r0.dataPosition()
            if (r1 >= r2) goto L_0x0c99
            int r1 = r0.readInt()
            char r3 = (char) r1
            switch(r3) {
                case 2: goto L_0x0c53;
                case 3: goto L_0x0c58;
                case 4: goto L_0x0c5d;
                case 5: goto L_0x0c62;
                case 6: goto L_0x0c67;
                case 7: goto L_0x0c6c;
                case 8: goto L_0x0c71;
                case 9: goto L_0x0c76;
                case 10: goto L_0x0c7b;
                case 11: goto L_0x0c80;
                case 12: goto L_0x0c85;
                case 13: goto L_0x0c8a;
                case 14: goto L_0x0c8f;
                case 15: goto L_0x0c94;
                default: goto L_0x0c4f;
            }
        L_0x0c4f:
            X.AnonymousClass7Kw.A0J(r0, r1)
            goto L_0x0c41
        L_0x0c53:
            java.lang.String r9 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0c41
        L_0x0c58:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0c41
        L_0x0c5d:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0c41
        L_0x0c62:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0c41
        L_0x0c67:
            java.lang.String r13 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0c41
        L_0x0c6c:
            java.lang.String r14 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0c41
        L_0x0c71:
            java.lang.String r15 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0c41
        L_0x0c76:
            java.lang.String r16 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0c41
        L_0x0c7b:
            java.lang.String r17 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0c41
        L_0x0c80:
            java.lang.String r18 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0c41
        L_0x0c85:
            java.lang.String r19 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0c41
        L_0x0c8a:
            java.lang.String r20 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0c41
        L_0x0c8f:
            java.lang.String r21 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0c41
        L_0x0c94:
            java.lang.String r22 = X.AnonymousClass7Kw.A0E(r0, r1)
            goto L_0x0c41
        L_0x0c99:
            X.AnonymousClass7Kw.A0I(r0, r2)
            com.google.android.gms.vision.barcode.Barcode$DriverLicense r8 = new com.google.android.gms.vision.barcode.Barcode$DriverLicense
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r8
        L_0x0ca2:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
        L_0x0cad:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0ce2
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x0cbf;
                case 3: goto L_0x0cc4;
                case 4: goto L_0x0cc9;
                case 5: goto L_0x0cce;
                case 6: goto L_0x0cd3;
                case 7: goto L_0x0cd8;
                case 8: goto L_0x0cdd;
                default: goto L_0x0cbb;
            }
        L_0x0cbb:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0cad
        L_0x0cbf:
            java.lang.String r9 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0cad
        L_0x0cc4:
            java.lang.String r10 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0cad
        L_0x0cc9:
            java.lang.String r11 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0cad
        L_0x0cce:
            java.lang.String r12 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0cad
        L_0x0cd3:
            java.lang.String r13 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0cad
        L_0x0cd8:
            java.lang.String r14 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0cad
        L_0x0cdd:
            java.lang.String r15 = X.AnonymousClass7Kw.A0E(r0, r2)
            goto L_0x0cad
        L_0x0ce2:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.vision.barcode.Barcode$PersonName r8 = new com.google.android.gms.vision.barcode.Barcode$PersonName
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L_0x0ceb:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r3 = 0
        L_0x0cf3:
            int r5 = r0.dataPosition()
            if (r5 >= r8) goto L_0x0d12
            int r7 = r0.readInt()
            char r6 = (char) r7
            r5 = 2
            if (r6 == r5) goto L_0x0d0d
            r5 = 3
            if (r6 == r5) goto L_0x0d08
            X.AnonymousClass7Kw.A0J(r0, r7)
            goto L_0x0cf3
        L_0x0d08:
            double r3 = X.AnonymousClass7Kw.A00(r0, r7)
            goto L_0x0cf3
        L_0x0d0d:
            double r1 = X.AnonymousClass7Kw.A00(r0, r7)
            goto L_0x0cf3
        L_0x0d12:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.vision.barcode.Barcode$GeoPoint r8 = new com.google.android.gms.vision.barcode.Barcode$GeoPoint
            r8.<init>(r1, r3)
            return r8
        L_0x0d1b:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r5 = 0
            r4 = r5
        L_0x0d21:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x0d3a
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x0d35
            r1 = 3
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x0d21
        L_0x0d35:
            java.lang.String r5 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x0d21
        L_0x0d3a:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.vision.barcode.Barcode$Sms r8 = new com.google.android.gms.vision.barcode.Barcode$Sms
            r8.<init>(r5, r4)
            return r8
        L_0x0d43:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r5 = 0
        L_0x0d49:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0d62
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x0d5d
            r2 = 3
            java.lang.String r5 = X.AnonymousClass7Kw.A0F(r0, r5, r3, r2, r4)
            goto L_0x0d49
        L_0x0d5d:
            int r1 = X.AnonymousClass7Kw.A04(r0, r4)
            goto L_0x0d49
        L_0x0d62:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.vision.barcode.Barcode$Phone r8 = new com.google.android.gms.vision.barcode.Barcode$Phone
            r8.<init>(r1, r5)
            return r8
        L_0x0d6b:
            int r7 = X.AnonymousClass7Kw.A02(r0)
            r6 = 0
            r5 = r6
            r4 = 0
        L_0x0d72:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x0d92
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x0d8d
            r1 = 3
            if (r2 == r1) goto L_0x0d88
            int r4 = X.AnonymousClass7Kw.A06(r0, r2, r3, r4)
            goto L_0x0d72
        L_0x0d88:
            java.lang.String r5 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x0d72
        L_0x0d8d:
            java.lang.String r6 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x0d72
        L_0x0d92:
            X.AnonymousClass7Kw.A0I(r0, r7)
            com.google.android.gms.vision.barcode.Barcode$WiFi r8 = new com.google.android.gms.vision.barcode.Barcode$WiFi
            r8.<init>(r6, r5, r4)
            return r8
        L_0x0d9b:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r5 = 0
            r4 = r5
        L_0x0da1:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x0dba
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x0db5
            r1 = 3
            java.lang.String r4 = X.AnonymousClass7Kw.A0F(r0, r4, r2, r1, r3)
            goto L_0x0da1
        L_0x0db5:
            java.lang.String r5 = X.AnonymousClass7Kw.A0E(r0, r3)
            goto L_0x0da1
        L_0x0dba:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.vision.barcode.Barcode$UrlBookmark r8 = new com.google.android.gms.vision.barcode.Barcode$UrlBookmark
            r8.<init>(r5, r4)
            return r8
        L_0x0dc3:
            int r6 = X.AnonymousClass7Kw.A02(r0)
            r1 = 0
            r2 = 0
        L_0x0dc9:
            int r3 = r0.dataPosition()
            if (r3 >= r6) goto L_0x0dec
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 2
            if (r4 == r3) goto L_0x0de3
            r3 = 3
            if (r4 == r3) goto L_0x0dde
            X.AnonymousClass7Kw.A0J(r0, r5)
            goto L_0x0dc9
        L_0x0dde:
            int r2 = X.AnonymousClass7Kw.A04(r0, r5)
            goto L_0x0dc9
        L_0x0de3:
            android.os.Parcelable$Creator r1 = android.graphics.PointF.CREATOR
            java.lang.Object[] r1 = X.AnonymousClass7Kw.A0Q(r0, r1, r5)
            android.graphics.PointF[] r1 = (android.graphics.PointF[]) r1
            goto L_0x0dc9
        L_0x0dec:
            X.AnonymousClass7Kw.A0I(r0, r6)
            com.google.android.gms.vision.face.internal.client.zza r8 = new com.google.android.gms.vision.face.internal.client.zza
            r8.<init>(r1, r2)
            return r8
        L_0x0df5:
            int r2 = X.AnonymousClass7Kw.A02(r0)
            r9 = 0
            r10 = r9
            r22 = 0
            r23 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r16 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r17 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0e14:
            int r1 = r0.dataPosition()
            if (r1 >= r2) goto L_0x0e79
            int r1 = r0.readInt()
            char r3 = (char) r1
            switch(r3) {
                case 1: goto L_0x0e38;
                case 2: goto L_0x0e3d;
                case 3: goto L_0x0e42;
                case 4: goto L_0x0e47;
                case 5: goto L_0x0e4c;
                case 6: goto L_0x0e51;
                case 7: goto L_0x0e56;
                case 8: goto L_0x0e5b;
                case 9: goto L_0x0e26;
                case 10: goto L_0x0e60;
                case 11: goto L_0x0e65;
                case 12: goto L_0x0e6a;
                case 13: goto L_0x0e2f;
                case 14: goto L_0x0e6f;
                case 15: goto L_0x0e74;
                default: goto L_0x0e22;
            }
        L_0x0e22:
            X.AnonymousClass7Kw.A0J(r0, r1)
            goto L_0x0e14
        L_0x0e26:
            android.os.Parcelable$Creator r3 = com.google.android.gms.vision.face.internal.client.LandmarkParcel.CREATOR
            java.lang.Object[] r9 = X.AnonymousClass7Kw.A0Q(r0, r3, r1)
            com.google.android.gms.vision.face.internal.client.LandmarkParcel[] r9 = (com.google.android.gms.vision.face.internal.client.LandmarkParcel[]) r9
            goto L_0x0e14
        L_0x0e2f:
            android.os.Parcelable$Creator r3 = com.google.android.gms.vision.face.internal.client.zza.CREATOR
            java.lang.Object[] r10 = X.AnonymousClass7Kw.A0Q(r0, r3, r1)
            com.google.android.gms.vision.face.internal.client.zza[] r10 = (com.google.android.gms.vision.face.internal.client.zza[]) r10
            goto L_0x0e14
        L_0x0e38:
            int r22 = X.AnonymousClass7Kw.A04(r0, r1)
            goto L_0x0e14
        L_0x0e3d:
            int r23 = X.AnonymousClass7Kw.A04(r0, r1)
            goto L_0x0e14
        L_0x0e42:
            float r11 = X.AnonymousClass7Kw.A01(r0, r1)
            goto L_0x0e14
        L_0x0e47:
            float r12 = X.AnonymousClass7Kw.A01(r0, r1)
            goto L_0x0e14
        L_0x0e4c:
            float r13 = X.AnonymousClass7Kw.A01(r0, r1)
            goto L_0x0e14
        L_0x0e51:
            float r14 = X.AnonymousClass7Kw.A01(r0, r1)
            goto L_0x0e14
        L_0x0e56:
            float r15 = X.AnonymousClass7Kw.A01(r0, r1)
            goto L_0x0e14
        L_0x0e5b:
            float r16 = X.AnonymousClass7Kw.A01(r0, r1)
            goto L_0x0e14
        L_0x0e60:
            float r18 = X.AnonymousClass7Kw.A01(r0, r1)
            goto L_0x0e14
        L_0x0e65:
            float r19 = X.AnonymousClass7Kw.A01(r0, r1)
            goto L_0x0e14
        L_0x0e6a:
            float r20 = X.AnonymousClass7Kw.A01(r0, r1)
            goto L_0x0e14
        L_0x0e6f:
            float r17 = X.AnonymousClass7Kw.A01(r0, r1)
            goto L_0x0e14
        L_0x0e74:
            float r21 = X.AnonymousClass7Kw.A01(r0, r1)
            goto L_0x0e14
        L_0x0e79:
            X.AnonymousClass7Kw.A0I(r0, r2)
            com.google.android.gms.vision.face.internal.client.FaceParcel r8 = new com.google.android.gms.vision.face.internal.client.FaceParcel
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r8
        L_0x0e82:
            int r3 = X.AnonymousClass7Kw.A02(r0)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0e8d:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0ec5
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x0e9f;
                case 3: goto L_0x0ea4;
                case 4: goto L_0x0ea9;
                case 5: goto L_0x0eb3;
                case 6: goto L_0x0ebc;
                case 7: goto L_0x0eae;
                default: goto L_0x0e9b;
            }
        L_0x0e9b:
            X.AnonymousClass7Kw.A0J(r0, r2)
            goto L_0x0e8d
        L_0x0e9f:
            int r10 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0e8d
        L_0x0ea4:
            int r11 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0e8d
        L_0x0ea9:
            int r12 = X.AnonymousClass7Kw.A04(r0, r2)
            goto L_0x0e8d
        L_0x0eae:
            float r9 = X.AnonymousClass7Kw.A01(r0, r2)
            goto L_0x0e8d
        L_0x0eb3:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r13 = X.C18180wK.A1V(r1)
            goto L_0x0e8d
        L_0x0ebc:
            int r1 = X.AnonymousClass7Kw.A04(r0, r2)
            boolean r14 = X.C18180wK.A1V(r1)
            goto L_0x0e8d
        L_0x0ec5:
            X.AnonymousClass7Kw.A0I(r0, r3)
            com.google.android.gms.vision.face.internal.client.zzf r8 = new com.google.android.gms.vision.face.internal.client.zzf
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x0ece:
            int r8 = X.AnonymousClass7Kw.A02(r0)
            r2 = 0
            r3 = 0
            r1 = 0
            r7 = 0
        L_0x0ed6:
            int r4 = r0.dataPosition()
            if (r4 >= r8) goto L_0x0efe
            int r6 = r0.readInt()
            char r5 = (char) r6
            r4 = 1
            if (r5 == r4) goto L_0x0ef9
            r4 = 2
            if (r5 == r4) goto L_0x0ef4
            r4 = 3
            if (r5 == r4) goto L_0x0eef
            int r7 = X.AnonymousClass7Kw.A06(r0, r5, r6, r7)
            goto L_0x0ed6
        L_0x0eef:
            float r3 = X.AnonymousClass7Kw.A01(r0, r6)
            goto L_0x0ed6
        L_0x0ef4:
            float r2 = X.AnonymousClass7Kw.A01(r0, r6)
            goto L_0x0ed6
        L_0x0ef9:
            int r1 = X.AnonymousClass7Kw.A04(r0, r6)
            goto L_0x0ed6
        L_0x0efe:
            X.AnonymousClass7Kw.A0I(r0, r8)
            com.google.android.gms.vision.face.internal.client.LandmarkParcel r8 = new com.google.android.gms.vision.face.internal.client.LandmarkParcel
            r8.<init>(r1, r7, r2, r3)
            return r8
        L_0x0f07:
            com.google.android.material.badge.BadgeDrawable$SavedState r8 = new com.google.android.material.badge.BadgeDrawable$SavedState
            r8.<init>((android.os.Parcel) r0)
            return r8
        L_0x0f0d:
            java.lang.Class<com.google.android.material.datepicker.Month> r1 = com.google.android.material.datepicker.Month.class
            android.os.Parcelable r4 = X.C18180wK.A0A(r0, r1)
            com.google.android.material.datepicker.Month r4 = (com.google.android.material.datepicker.Month) r4
            android.os.Parcelable r3 = X.C18180wK.A0A(r0, r1)
            com.google.android.material.datepicker.Month r3 = (com.google.android.material.datepicker.Month) r3
            android.os.Parcelable r2 = X.C18180wK.A0A(r0, r1)
            com.google.android.material.datepicker.Month r2 = (com.google.android.material.datepicker.Month) r2
            java.lang.Class<com.google.android.material.datepicker.CalendarConstraints$DateValidator> r1 = com.google.android.material.datepicker.CalendarConstraints.DateValidator.class
            android.os.Parcelable r0 = X.C18180wK.A0A(r0, r1)
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r0 = (com.google.android.material.datepicker.CalendarConstraints.DateValidator) r0
            com.google.android.material.datepicker.CalendarConstraints r8 = new com.google.android.material.datepicker.CalendarConstraints
            r8.<init>(r0, r4, r3, r2)
            return r8
        L_0x0f2f:
            java.lang.Class<com.google.android.material.datepicker.CalendarConstraints$DateValidator> r1 = com.google.android.material.datepicker.CalendarConstraints.DateValidator.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.util.ArrayList r2 = r0.readArrayList(r1)
            int r1 = r0.readInt()
            r0 = 2
            if (r1 == r0) goto L_0x0f4e
            r0 = 1
            if (r1 != r0) goto L_0x0f4e
            X.8kT r0 = com.google.android.material.datepicker.CompositeDateValidator.A03
        L_0x0f45:
            r2.getClass()
            com.google.android.material.datepicker.CompositeDateValidator r8 = new com.google.android.material.datepicker.CompositeDateValidator
            r8.<init>(r0, r2)
            return r8
        L_0x0f4e:
            X.8kT r0 = com.google.android.material.datepicker.CompositeDateValidator.A02
            goto L_0x0f45
        L_0x0f51:
            long r0 = r0.readLong()
            com.google.android.material.datepicker.DateValidatorPointBackward r8 = new com.google.android.material.datepicker.DateValidatorPointBackward
            r8.<init>(r0)
            return r8
        L_0x0f5b:
            long r0 = r0.readLong()
            com.google.android.material.datepicker.DateValidatorPointForward r8 = new com.google.android.material.datepicker.DateValidatorPointForward
            r8.<init>(r0)
            return r8
        L_0x0f65:
            int r1 = r0.readInt()
            int r0 = r0.readInt()
            com.google.android.material.datepicker.Month r8 = com.google.android.material.datepicker.Month.A00(r1, r0)
            return r8
        L_0x0f72:
            com.google.android.material.datepicker.RangeDateSelector r8 = new com.google.android.material.datepicker.RangeDateSelector
            r8.<init>()
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.Object r1 = X.C86114wI.A0e(r0, r2)
            java.lang.Long r1 = (java.lang.Long) r1
            r8.A03 = r1
            java.lang.Object r0 = X.C86114wI.A0e(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r8.A02 = r0
            return r8
        L_0x0f8a:
            com.google.android.material.datepicker.SingleDateSelector r8 = new com.google.android.material.datepicker.SingleDateSelector
            r8.<init>()
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            java.lang.Object r0 = X.C86114wI.A0e(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            r8.A00 = r0
            return r8
        L_0x0f9a:
            android.os.IBinder r0 = r0.readStrongBinder()
            if (r0 == 0) goto L_0x0fa6
            com.google.firebase.iid.zzm r8 = new com.google.firebase.iid.zzm
            r8.<init>(r0)
            return r8
        L_0x0fa6:
            r8 = 0
            return r8
        L_0x0fa8:
            com.google.android.material.navigation.NavigationBarPresenter$SavedState r8 = new com.google.android.material.navigation.NavigationBarPresenter$SavedState
            r8.<init>(r0)
            return r8
        L_0x0fae:
            com.google.android.material.slider.BaseSlider$SliderState r8 = new com.google.android.material.slider.BaseSlider$SliderState
            r8.<init>(r0)
            return r8
        L_0x0fb4:
            com.google.android.material.slider.RangeSlider$RangeSliderState r8 = new com.google.android.material.slider.RangeSlider$RangeSliderState
            r8.<init>(r0)
            return r8
        L_0x0fba:
            int r3 = r0.readInt()
            int r2 = r0.readInt()
            int r1 = r0.readInt()
            int r0 = r0.readInt()
            com.google.android.material.timepicker.TimeModel r8 = new com.google.android.material.timepicker.TimeModel
            r8.<init>(r3, r2, r1, r0)
            return r8
        L_0x0fd0:
            java.lang.Class<com.google.android.play.core.review.ReviewInfo> r1 = com.google.android.play.core.review.ReviewInfo.class
            android.os.Parcelable r1 = X.C18180wK.A0A(r0, r1)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            boolean r0 = X.C86104wH.A1W(r0)
            com.google.android.play.core.review.zza r8 = new com.google.android.play.core.review.zza
            r8.<init>(r1, r0)
            return r8
        L_0x0fe2:
            int r5 = X.AnonymousClass7Kw.A02(r0)
            r4 = 0
        L_0x0fe7:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x0ffe
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x0ff9
            X.AnonymousClass7Kw.A0J(r0, r3)
            goto L_0x0fe7
        L_0x0ff9:
            android.os.Bundle r4 = X.AnonymousClass7Kw.A09(r0, r3)
            goto L_0x0fe7
        L_0x0ffe:
            X.AnonymousClass7Kw.A0I(r0, r5)
            com.google.firebase.messaging.RemoteMessage r8 = new com.google.firebase.messaging.RemoteMessage
            r8.<init>(r4)
            return r8
        L_0x1007:
            java.lang.String r1 = r0.readString()
            com.instagram.accountlinking.model.AccountFamily r8 = new com.instagram.accountlinking.model.AccountFamily
            r8.<init>(r1)
            java.io.Serializable r1 = r0.readSerializable()
            X.22H r1 = (X.AnonymousClass22H) r1
            r8.A00 = r1
            java.util.List r1 = r8.A04
            android.os.Parcelable$Creator r2 = com.instagram.user.model.MicroUserDict.CREATOR
            r0.readTypedList(r1, r2)
            java.util.List r1 = r8.A03
            r0.readTypedList(r1, r2)
            return r8
        L_0x1025:
            java.lang.String r11 = X.C86104wH.A0q(r0)
            r11.getClass()
            r1 = 5
            java.lang.Integer r9 = X.C18210wN.A0U(r0, r1)
            boolean r12 = X.C86104wH.A1W(r0)
            boolean r13 = X.C86104wH.A1W(r0)
            java.lang.Integer r10 = X.C18210wN.A0U(r0, r1)
            com.instagram.analytics.ppr.loggingdata.PPRLoggingData r8 = new com.instagram.analytics.ppr.loggingdata.PPRLoggingData
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x1043:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.ACRType[] r1 = com.instagram.api.schemas.ACRType.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x1052:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.AFI_TYPE[] r1 = com.instagram.api.schemas.AFI_TYPE.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x1061:
            java.lang.String r13 = X.C86104wH.A0q(r0)
            long r19 = r0.readLong()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.Class<com.instagram.api.schemas.Achievement> r1 = com.instagram.api.schemas.Achievement.class
            android.os.Parcelable r11 = X.C18180wK.A0A(r0, r1)
            com.instagram.api.schemas.AchievementName r11 = (com.instagram.api.schemas.AchievementName) r11
            android.os.Parcelable r9 = X.C18180wK.A0A(r0, r1)
            com.instagram.api.schemas.AchievementButtonInfo r9 = (com.instagram.api.schemas.AchievementButtonInfo) r9
            android.os.Parcelable r10 = X.C18180wK.A0A(r0, r1)
            com.instagram.api.schemas.AchievementButtonInfo r10 = (com.instagram.api.schemas.AchievementButtonInfo) r10
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x109e
            r12 = 0
        L_0x1090:
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            com.instagram.api.schemas.Achievement r8 = new com.instagram.api.schemas.Achievement
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r8
        L_0x109e:
            java.lang.Integer r12 = X.C86114wI.A0b(r0)
            goto L_0x1090
        L_0x10a3:
            java.lang.String r1 = X.C86104wH.A0q(r0)
            java.lang.String r0 = r0.readString()
            com.instagram.api.schemas.AchievementButtonInfo r8 = new com.instagram.api.schemas.AchievementButtonInfo
            r8.<init>(r1, r0)
            return r8
        L_0x10b1:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.AchievementName[] r1 = com.instagram.api.schemas.AchievementName.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x10c0:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.ActionButtonPartnerType[] r1 = com.instagram.api.schemas.ActionButtonPartnerType.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x10cf:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.ActionType[] r1 = com.instagram.api.schemas.ActionType.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x10de:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.AdGeoLocationType[] r1 = com.instagram.api.schemas.AdGeoLocationType.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x10ed:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.AdproObjectiveTypesEnum[] r1 = com.instagram.api.schemas.AdproObjectiveTypesEnum.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x10fc:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.AdproRegulatedCategory[] r1 = com.instagram.api.schemas.AdproRegulatedCategory.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x110b:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.AdsAPIInstagramPosition[] r1 = com.instagram.api.schemas.AdsAPIInstagramPosition.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x111a:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.AdsTargetingGender[] r1 = com.instagram.api.schemas.AdsTargetingGender.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x1129:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.ApiAdFormats[] r1 = com.instagram.api.schemas.ApiAdFormats.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x1138:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.AppColorMode[] r1 = com.instagram.api.schemas.AppColorMode.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x1147:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.AppSwitcherBadgeStatus[] r1 = com.instagram.api.schemas.AppSwitcherBadgeStatus.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x1156:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.AssetRecommendationType[] r1 = com.instagram.api.schemas.AssetRecommendationType.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x1165:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.AssetType[] r1 = com.instagram.api.schemas.AssetType.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x1174:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.AudienceValidationActionType[] r1 = com.instagram.api.schemas.AudienceValidationActionType.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x1183:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.AudienceValidationResponseStatus[] r1 = com.instagram.api.schemas.AudienceValidationResponseStatus.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x1192:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.AudioBrowserCategoryType[] r1 = com.instagram.api.schemas.AudioBrowserCategoryType.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x11a1:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.AudioBrowserPlaylistType[] r1 = com.instagram.api.schemas.AudioBrowserPlaylistType.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x11b0:
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.api.schemas.AudioMetadataLabels[] r1 = com.instagram.api.schemas.AudioMetadataLabels.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x11bf:
            java.lang.String r3 = X.C86104wH.A0q(r0)
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse r8 = new com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse
            r8.<init>(r3, r2, r1, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.PCreatorCreatorShape6S0000000_I2_6.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new zzab[i];
            case 1:
                return new zzah[i];
            case 2:
                return new zzaj[i];
            case 3:
                return new zzal[i];
            case 4:
                return new zzam[i];
            case 5:
                return new zzao[i];
            case 6:
                return new zzfz[i];
            case 7:
                return new zzk[i];
            case 8:
                return new zzs[i];
            case 9:
                return new PlaceReport[i];
            case 10:
                return new GeofencingRequest[i];
            case 11:
                return new LocationAvailability[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new LocationRequest[i];
            case 13:
                return new LocationResult[i];
            case 14:
                return new zzay[i];
            case 15:
                return new LocationSettingsRequest[i];
            case 16:
                return new LocationSettingsResult[i];
            case LangUtils.HASH_SEED /*17*/:
                return new LocationSettingsStates[i];
            case 18:
                return new zzbd[i];
            case 19:
                return new zzbe[i];
            case 20:
                return new ActivityRecognitionResult[i];
            case 21:
                return new ActivityTransition[i];
            case 22:
                return new ActivityTransitionEvent[i];
            case 23:
                return new ActivityTransitionRequest[i];
            case 24:
                return new ActivityTransitionResult[i];
            case 25:
                return new DetectedActivity[i];
            case Rfc3492Idn.tmax /*26*/:
                return new zzo[i];
            case 27:
                return new Configuration[i];
            case 28:
                return new ExperimentTokens[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new zzi[i];
            case 30:
                return new zza[i];
            case 31:
                return new HarmfulAppsData[i];
            case 32:
                return new zzd[i];
            case 33:
                return new zzf[i];
            case 34:
                return new zzh[i];
            case 35:
                return new SafeBrowsingData[i];
            case Rfc3492Idn.base /*36*/:
                return new zaa[i];
            case LangUtils.HASH_OFFSET /*37*/:
                return new zag[i];
            case Rfc3492Idn.skew /*38*/:
                return new zai[i];
            case 39:
                return new zak[i];
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                return new Barcode.Address[i];
            case Seq.NULL_REFNUM /*41*/:
                return new Barcode[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new Barcode.CalendarDateTime[i];
            case 43:
                return new Barcode.ContactInfo[i];
            case 44:
                return new Barcode.CalendarEvent[i];
            case 45:
                return new Barcode.Email[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return new Barcode.DriverLicense[i];
            case 47:
                return new Barcode.PersonName[i];
            case 48:
                return new Barcode.GeoPoint[i];
            case 49:
                return new Barcode.Sms[i];
            case AnimationSpecKt.IDLE_DURATION /*50*/:
                return new Barcode.Phone[i];
            case 51:
                return new Barcode.WiFi[i];
            case 52:
                return new Barcode.UrlBookmark[i];
            case 53:
                return new com.google.android.gms.vision.face.internal.client.zza[i];
            case 54:
                return new FaceParcel[i];
            case 55:
                return new com.google.android.gms.vision.face.internal.client.zzf[i];
            case 56:
                return new LandmarkParcel[i];
            case 57:
                return new BadgeDrawable$SavedState[i];
            case 58:
                return new CalendarConstraints[i];
            case 59:
                return new CompositeDateValidator[i];
            case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /*60*/:
                return new DateValidatorPointBackward[i];
            case 61:
                return new DateValidatorPointForward[i];
            case 62:
                return new Month[i];
            case StringTreeSet.PAYLOAD_MASK:
                return new RangeDateSelector[i];
            case 64:
                return new SingleDateSelector[i];
            case 65:
                return new ParcelableSparseBooleanArray[i];
            case 66:
                return new ParcelableSparseIntArray[i];
            case 67:
                return new NavigationBarPresenter$SavedState[i];
            case 68:
                return new BaseSlider$SliderState[i];
            case 69:
                return new RangeSlider$RangeSliderState[i];
            case LineChartView.MARGIN_TICKS /*70*/:
                return new TimeModel[i];
            case 71:
                return new ReviewInfo[i];
            case Rfc3492Idn.initial_bias /*72*/:
                return new zzm[i];
            case 73:
                return new RemoteMessage[i];
            case 74:
                return new AccountFamily[i];
            case 75:
                return new PPRLoggingData[i];
            case 76:
                return new ACRType[i];
            case 77:
                return new AFI_TYPE[i];
            case 78:
                return new Achievement[i];
            case 79:
                return new AchievementButtonInfo[i];
            case 80:
                return new AchievementName[i];
            case 81:
                return new ActionButtonPartnerType[i];
            case 82:
                return new ActionType[i];
            case 83:
                return new AdGeoLocationType[i];
            case 84:
                return new AdproObjectiveTypesEnum[i];
            case 85:
                return new AdproRegulatedCategory[i];
            case 86:
                return new AdsAPIInstagramPosition[i];
            case 87:
                return new AdsTargetingGender[i];
            case 88:
                return new ApiAdFormats[i];
            case 89:
                return new AppColorMode[i];
            case 90:
                return new AppSwitcherBadgeStatus[i];
            case 91:
                return new AssetRecommendationType[i];
            case 92:
                return new AssetType[i];
            case 93:
                return new AudienceValidationActionType[i];
            case 94:
                return new AudienceValidationResponseStatus[i];
            case 95:
                return new AudioBrowserCategoryType[i];
            case 96:
                return new AudioBrowserPlaylistType[i];
            case 97:
                return new AudioMetadataLabels[i];
            case 98:
                return new AvatarCoinFlipBackgroundOptionResponse[i];
            default:
                return new AvatarNoteResponseInfo[i];
        }
    }
}
