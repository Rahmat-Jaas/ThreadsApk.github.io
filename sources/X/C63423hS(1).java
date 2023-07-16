package X;

import android.content.SharedPreferences;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.impl.client.cache.CacheConfig;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.debug.devoptions.cam.AnimationSpecKt;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import go.Seq;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3hS  reason: invalid class name and case insensitive filesystem */
public final class C63423hS {
    public static final C63423hS A00 = new C63423hS();

    public static final void A01(AnonymousClass2AC r9, AnonymousClass2AD r10, UserSession userSession) {
        SharedPreferences.Editor editor;
        long j;
        String str;
        boolean A1Z = AnonymousClass0wJ.A1Z(userSession, r10);
        C04220Ms.A0B(r9, 2);
        Integer A002 = A00.A00(r9, r10);
        if (A002 != AnonymousClass006.A0C && A002 != AnonymousClass006.A01) {
            AnonymousClass3ZL A03 = AnonymousClass3Zu.A03(userSession);
            for (AnonymousClass22U ordinal : AnonymousClass3P1.A01(r10)) {
                int ordinal2 = ordinal.ordinal();
                if (ordinal2 == 0) {
                    SharedPreferences sharedPreferences = A03.A04;
                    long j2 = (long) 1000;
                    AnonymousClass0wJ.A12(sharedPreferences.edit(), "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_STORY", System.currentTimeMillis() / j2);
                    C18180wK.A0u(sharedPreferences.edit(), "PREFERENCE_STORIES_POSTS_SINCE_LAST_STORIES_UPSELL_IMPRESSION");
                    AnonymousClass0wJ.A14(sharedPreferences, "PREFERENCE_STORIES_DISMISSED_UPSELLS_SINCE_COOLDOWN", 0);
                    editor = sharedPreferences.edit();
                    j = System.currentTimeMillis() / j2;
                    str = "PREFERENCE_STORIES_UPSELL_LAST_DISMISSED_SECONDS";
                } else if (ordinal2 == A1Z) {
                    SharedPreferences sharedPreferences2 = A03.A04;
                    long j3 = (long) 1000;
                    AnonymousClass0wJ.A12(sharedPreferences2.edit(), "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_FEED", System.currentTimeMillis() / j3);
                    C18180wK.A0u(sharedPreferences2.edit(), "PREFERENCE_FEED_POSTS_SINCE_LAST_FEED_UPSELL_IMPRESSION");
                    AnonymousClass0wJ.A14(sharedPreferences2, "PREFERENCE_FEED_DISMISSED_UPSELLS_SINCE_COOLDOWN", 0);
                    editor = sharedPreferences2.edit();
                    j = System.currentTimeMillis() / j3;
                    str = "PREFERENCE_FEED_UPSELL_LAST_DISMISSED_SECONDS";
                } else if (ordinal2 == 2 || ordinal2 == 3) {
                    SharedPreferences sharedPreferences3 = A03.A04;
                    long j4 = (long) 1000;
                    AnonymousClass0wJ.A12(sharedPreferences3.edit(), "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_REEL", System.currentTimeMillis() / j4);
                    C18180wK.A0u(sharedPreferences3.edit(), "PREFERENCE_REELS_POSTS_SINCE_LAST_REELS_UPSELL_IMPRESSION");
                    AnonymousClass0wJ.A14(sharedPreferences3, "PREFERENCE_REELS_DISMISSED_UPSELLS_SINCE_COOLDOWN", 0);
                    editor = sharedPreferences3.edit();
                    j = System.currentTimeMillis() / j4;
                    str = "PREFERENCE_REELS_UPSELL_LAST_DISMISSED_SECONDS";
                }
                AnonymousClass0wJ.A12(editor, str, j);
            }
            AnonymousClass0wJ.A12(AnonymousClass3ZL.A00(A03), "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_GLOBAL", C18200wM.A0A());
        }
    }

    public static final boolean A02(long j, long j2) {
        if (j == 0) {
            return true;
        }
        if (j2 < 0) {
            return false;
        }
        return j2 == 0 || C18200wM.A0A() - j > j2 * ((long) ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS);
    }

    public static final boolean A03(AnonymousClass2AC r21, AnonymousClass2AD r22, UserSession userSession) {
        String str;
        AnonymousClass29W r2;
        AnonymousClass14U r1;
        long j;
        long j2;
        String str2;
        int i;
        SharedPreferences.Editor editor;
        long A03;
        String str3;
        int i2;
        String str4;
        long A032;
        String str5;
        long A033;
        String str6;
        AnonymousClass29W r3;
        AnonymousClass14U A002;
        String str7;
        AnonymousClass2AD r15 = r22;
        UserSession userSession2 = userSession;
        boolean A1Z = AnonymousClass0wJ.A1Z(userSession2, r15);
        AnonymousClass2AC r23 = r21;
        C04220Ms.A0B(r23, 2);
        C63423hS r11 = A00;
        if (A04(r15)) {
            AnonymousClass0TJ r24 = AnonymousClass0TJ.A05;
            if (C63803iN.A0E(r24, userSession2, 36324024480964833L)) {
                r3 = AnonymousClass29W.SUPPRESS;
                A002 = AnonymousClass14U.A00();
                str7 = "shared_holdout";
            } else {
                switch (r23.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 18:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 27:
                    case 28:
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case Rfc3492Idn.base /*36*/:
                    case LangUtils.HASH_OFFSET /*37*/:
                    case Rfc3492Idn.skew /*38*/:
                    case 39:
                    case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                    case 47:
                    case 48:
                    case 49:
                    case AnimationSpecKt.IDLE_DURATION /*50*/:
                    case 54:
                    case 55:
                    case 56:
                        if (C63803iN.A0E(r24, userSession2, 36324024481095907L)) {
                            r3 = AnonymousClass29W.SUPPRESS;
                            A002 = AnonymousClass14U.A00();
                            str7 = "shared_non_creation_only_holdout";
                            break;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case LangUtils.HASH_SEED /*17*/:
                    case 19:
                    case 25:
                    case Rfc3492Idn.tmax /*26*/:
                    case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                    case Seq.NULL_REFNUM /*41*/:
                    case Seq.RefTracker.REF_OFFSET /*42*/:
                    case 43:
                    case 44:
                    case 45:
                    case 51:
                    case 52:
                    case 53:
                        if (C63803iN.A0E(r24, userSession2, 36324024481030370L)) {
                            r3 = AnonymousClass29W.SUPPRESS;
                            A002 = AnonymousClass14U.A00();
                            str7 = "shared_creation_only_holdout";
                            break;
                        }
                        break;
                    default:
                        throw AnonymousClass4VZ.A00();
                }
            }
            A002.A0A("suppress_reason", str7);
            C49322rC.A00(r23, r3, r15, A002, userSession2);
            return false;
        }
        Set<AnonymousClass22U> A01 = AnonymousClass3P1.A01(r15);
        SharedPreferences A02 = AnonymousClass3Zu.A02(userSession2);
        if (A02.getBoolean("PREFERENCE_SHARED_COOLDOWN_ENABLED", A1Z) && r11.A00(r23, r15) != AnonymousClass006.A0C) {
            AnonymousClass0TJ r9 = AnonymousClass0TJ.A05;
            if (!A02(A02.getLong("PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_GLOBAL", 0), C63803iN.A03(r9, userSession2, 36605211694862726L))) {
                r2 = AnonymousClass29W.SUPPRESS;
                r1 = AnonymousClass14U.A00();
                str = "shared_min_cooldowns";
            } else if (!(A01 instanceof Collection) || !A01.isEmpty()) {
                Iterator it = A01.iterator();
                while (true) {
                    if (it.hasNext()) {
                        int ordinal = ((AnonymousClass22U) it.next()).ordinal();
                        if (ordinal == 0) {
                            A033 = C63803iN.A03(r9, userSession2, 36605211694993800L);
                            str6 = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_STORY";
                        } else if (ordinal == A1Z) {
                            A033 = C63803iN.A03(r9, userSession2, 36605211694928263L);
                            str6 = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_FEED";
                        } else if (ordinal == 2 || ordinal == 3) {
                            A033 = C63803iN.A03(r9, userSession2, 36605211695059337L);
                            str6 = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_REEL";
                        } else {
                            throw AnonymousClass4VZ.A00();
                        }
                        if (!A02(A02.getLong(str6, 0), A033)) {
                        }
                    }
                }
            }
            r2 = AnonymousClass29W.SUPPRESS;
            r1 = AnonymousClass14U.A00();
            str = "shared_min_cooldowns";
            r1.A0A("suppress_reason", str);
            C49322rC.A00(r23, r2, r15, r1, userSession2);
            return false;
        }
        SharedPreferences A022 = AnonymousClass3Zu.A02(userSession2);
        if (A022.getBoolean("PREFERENCE_SETTING_DISABLE_COOLDOWN_ENABLED", A1Z) && A04(r15) && (!(A01 instanceof Collection) || !A01.isEmpty())) {
            Iterator it2 = A01.iterator();
            while (true) {
                if (it2.hasNext()) {
                    int ordinal2 = ((AnonymousClass22U) it2.next()).ordinal();
                    if (ordinal2 == 0) {
                        A032 = C63803iN.A03(AnonymousClass0TJ.A05, userSession2, 36607045646094976L) * ((long) 24);
                        str5 = "PREFERENCE_STORY_CROSSPOST_SETTING_LAST_DISABLED_SECONDS";
                    } else if (ordinal2 == A1Z) {
                        A032 = C63803iN.A03(AnonymousClass0TJ.A05, userSession2, 36607045645898365L) * ((long) 24);
                        str5 = "PREFERENCE_FEED_CROSSPOST_SETTING_LAST_DISABLED_SECONDS";
                    } else if (ordinal2 == 2) {
                        A032 = C63803iN.A03(AnonymousClass0TJ.A05, userSession2, 36607045645963902L) * ((long) 24);
                        str5 = "PREFERENCE_REEL_CROSSPOST_SETTING_LAST_DISABLED_SECONDS";
                    } else if (ordinal2 == 3) {
                        A032 = C63803iN.A03(AnonymousClass0TJ.A05, userSession2, 36607045646029439L) * ((long) 24);
                        str5 = "PREFERENCE_REEL_RECOMMEND_SETTING_LAST_DISABLED_SECONDS";
                    } else {
                        throw AnonymousClass4VZ.A00();
                    }
                    if (!A02(C18180wK.A05(A022, str5), A032)) {
                        r2 = AnonymousClass29W.SUPPRESS;
                        r1 = AnonymousClass14U.A00();
                        str = "auto_xposting_disabled_cooldown";
                    }
                }
            }
            r1.A0A("suppress_reason", str);
            C49322rC.A00(r23, r2, r15, r1, userSession2);
            return false;
        }
        SharedPreferences A023 = AnonymousClass3Zu.A02(userSession2);
        if (A023.getBoolean("PREFERENCE_CREATED_MEDIA_COOLDOWN_ENABLED", A1Z) && r11.A00(r23, r15) != AnonymousClass006.A0C && (!(A01 instanceof Collection) || !A01.isEmpty())) {
            Iterator it3 = A01.iterator();
            while (true) {
                if (it3.hasNext()) {
                    int ordinal3 = ((AnonymousClass22U) it3.next()).ordinal();
                    if (ordinal3 == 0) {
                        A03 = C63803iN.A03(AnonymousClass0TJ.A05, userSession2, 36607105775571596L);
                        str3 = "PREFERENCE_STORIES_POSTS_SINCE_LAST_STORIES_UPSELL_IMPRESSION";
                        i2 = A023.getInt(str3, 0);
                        str4 = "stories";
                    } else if (ordinal3 == A1Z) {
                        A03 = C63803iN.A03(AnonymousClass0TJ.A05, userSession2, 36607105775440522L);
                        str3 = "PREFERENCE_FEED_POSTS_SINCE_LAST_FEED_UPSELL_IMPRESSION";
                        i2 = A023.getInt(str3, 0);
                        str4 = "feed";
                    } else if (ordinal3 == 2 || ordinal3 == 3) {
                        A03 = C63803iN.A03(AnonymousClass0TJ.A05, userSession2, 36607105775506059L);
                        str3 = "PREFERENCE_REELS_POSTS_SINCE_LAST_REELS_UPSELL_IMPRESSION";
                        i2 = A023.getInt(str3, 0);
                        str4 = "reels";
                    } else {
                        throw AnonymousClass4VZ.A00();
                    }
                    StringBuilder A0s = C18190wL.A0s("created_media_cooldowns");
                    A0s.append(":");
                    A0s.append(str4);
                    A0s.append(":");
                    A0s.append(i2);
                    A0s.append(":");
                    A0s.append(A03);
                    str = C18190wL.A0n(A0s);
                    if (((long) A023.getInt(str3, 0)) < A03) {
                        r2 = AnonymousClass29W.SUPPRESS;
                        r1 = AnonymousClass14U.A00();
                    }
                }
            }
            r1.A0A("suppress_reason", str);
            C49322rC.A00(r23, r2, r15, r1, userSession2);
            return false;
        }
        SharedPreferences A024 = AnonymousClass3Zu.A02(userSession2);
        if (!A024.getBoolean("PREFERENCE_MULTIPLE_UPSELL_DISMISSAL_ENABLED", A1Z) || r11.A00(r23, r15) == AnonymousClass006.A0C) {
            return true;
        }
        C04220Ms.A0B(A01, 0);
        AnonymousClass3ZL A034 = AnonymousClass3Zu.A03(userSession2);
        long j3 = (long) 1000;
        long currentTimeMillis = System.currentTimeMillis() / j3;
        for (AnonymousClass22U ordinal4 : A01) {
            int ordinal5 = ordinal4.ordinal();
            if (ordinal5 == 0) {
                AnonymousClass0TJ r10 = AnonymousClass0TJ.A05;
                long A035 = C63803iN.A03(r10, userSession2, 36608115092820833L);
                SharedPreferences sharedPreferences = A034.A04;
                if (((long) sharedPreferences.getInt("PREFERENCE_STORIES_DISMISSED_UPSELLS_SINCE_COOLDOWN", 0)) >= A035) {
                    if (C18180wK.A05(sharedPreferences, "PREFERENCE_STORIES_UPSELL_LAST_DISMISSED_SECONDS") + (((long) 86400) * C63803iN.A03(r10, userSession2, 36608115093017444L)) < currentTimeMillis) {
                        C18180wK.A0u(sharedPreferences.edit(), "PREFERENCE_STORIES_UPSELL_LAST_DISMISSED_SECONDS");
                        editor = sharedPreferences.edit().remove("PREFERENCE_STORIES_DISMISSED_UPSELLS_SINCE_COOLDOWN");
                    }
                }
            } else if (ordinal5 == A1Z) {
                AnonymousClass0TJ r102 = AnonymousClass0TJ.A05;
                long A036 = C63803iN.A03(r102, userSession2, 36608115092755296L);
                SharedPreferences sharedPreferences2 = A034.A04;
                if (((long) sharedPreferences2.getInt("PREFERENCE_FEED_DISMISSED_UPSELLS_SINCE_COOLDOWN", 0)) >= A036) {
                    if (C18180wK.A05(sharedPreferences2, "PREFERENCE_FEED_UPSELL_LAST_DISMISSED_SECONDS") + (((long) 86400) * C63803iN.A03(r102, userSession2, 36608115092951907L)) < currentTimeMillis) {
                        C18180wK.A0u(sharedPreferences2.edit(), "PREFERENCE_FEED_UPSELL_LAST_DISMISSED_SECONDS");
                        editor = sharedPreferences2.edit().remove("PREFERENCE_FEED_DISMISSED_UPSELLS_SINCE_COOLDOWN");
                    }
                }
            } else if (ordinal5 == 2 || ordinal5 == 3) {
                AnonymousClass0TJ r103 = AnonymousClass0TJ.A05;
                long A037 = C63803iN.A03(r103, userSession2, 36608115092886370L);
                SharedPreferences sharedPreferences3 = A034.A04;
                if (((long) sharedPreferences3.getInt("PREFERENCE_REELS_DISMISSED_UPSELLS_SINCE_COOLDOWN", 0)) >= A037) {
                    if (C18180wK.A05(sharedPreferences3, "PREFERENCE_REELS_UPSELL_LAST_DISMISSED_SECONDS") + (((long) 86400) * C63803iN.A03(r103, userSession2, 36608115093082981L)) < currentTimeMillis) {
                        C18180wK.A0u(sharedPreferences3.edit(), "PREFERENCE_REELS_UPSELL_LAST_DISMISSED_SECONDS");
                        editor = sharedPreferences3.edit().remove("PREFERENCE_REELS_DISMISSED_UPSELLS_SINCE_COOLDOWN");
                    }
                }
            }
            editor.apply();
        }
        if ((A01 instanceof Collection) && A01.isEmpty()) {
            return true;
        }
        for (AnonymousClass22U ordinal6 : A01) {
            int ordinal7 = ordinal6.ordinal();
            if (ordinal7 == 0) {
                AnonymousClass0TJ r4 = AnonymousClass0TJ.A05;
                j = C63803iN.A03(r4, userSession2, 36608115092820833L);
                i = A024.getInt("PREFERENCE_STORIES_DISMISSED_UPSELLS_SINCE_COOLDOWN", 0);
                j2 = C63803iN.A03(r4, userSession2, 36608115093017444L);
                str2 = "PREFERENCE_STORIES_UPSELL_LAST_DISMISSED_SECONDS";
            } else if (ordinal7 == A1Z) {
                AnonymousClass0TJ r42 = AnonymousClass0TJ.A05;
                j = C63803iN.A03(r42, userSession2, 36608115092755296L);
                i = A024.getInt("PREFERENCE_FEED_DISMISSED_UPSELLS_SINCE_COOLDOWN", 0);
                j2 = C63803iN.A03(r42, userSession2, 36608115092951907L);
                str2 = "PREFERENCE_FEED_UPSELL_LAST_DISMISSED_SECONDS";
            } else if (ordinal7 == 2 || ordinal7 == 3) {
                AnonymousClass0TJ r43 = AnonymousClass0TJ.A05;
                j = C63803iN.A03(r43, userSession2, 36608115092886370L);
                i = A024.getInt("PREFERENCE_REELS_DISMISSED_UPSELLS_SINCE_COOLDOWN", 0);
                j2 = C63803iN.A03(r43, userSession2, 36608115093082981L);
                str2 = "PREFERENCE_REELS_UPSELL_LAST_DISMISSED_SECONDS";
            } else {
                throw AnonymousClass4VZ.A00();
            }
            long j4 = A024.getLong(str2, 0);
            if (j != 0 && ((long) i) >= j) {
                long j5 = ((long) 86400) * j2;
                long currentTimeMillis2 = (System.currentTimeMillis() / j3) - j4;
                if (currentTimeMillis2 != 0 && currentTimeMillis2 <= j5) {
                    r2 = AnonymousClass29W.SUPPRESS;
                    r1 = AnonymousClass14U.A00();
                    str = "multiple_upsell_dismissal_cooldown";
                    r1.A0A("suppress_reason", str);
                    C49322rC.A00(r23, r2, r15, r1, userSession2);
                    return false;
                }
            }
        }
        return true;
    }

    private final Integer A00(AnonymousClass2AC r2, AnonymousClass2AD r3) {
        switch (r2.ordinal()) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 15:
            case 19:
            case 22:
            case 28:
            case 35:
            case Rfc3492Idn.base /*36*/:
            case Seq.NULL_REFNUM /*41*/:
            case 48:
            case AnimationSpecKt.IDLE_DURATION /*50*/:
            case 56:
                break;
            default:
                switch (r3.ordinal()) {
                    case 0:
                    case 1:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 10:
                    case Rfc3492Idn.tmax /*26*/:
                    case 30:
                    case 31:
                    case 34:
                    case 35:
                    case LangUtils.HASH_OFFSET /*37*/:
                    case Rfc3492Idn.skew /*38*/:
                    case 39:
                    case Seq.RefTracker.REF_OFFSET /*42*/:
                    case AnimationSpecKt.IDLE_DURATION /*50*/:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 56:
                    case 62:
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 9:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case LangUtils.HASH_SEED /*17*/:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 27:
                    case 28:
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                    case 32:
                    case 33:
                    case Rfc3492Idn.base /*36*/:
                    case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                    case Seq.NULL_REFNUM /*41*/:
                    case 43:
                    case 44:
                    case 45:
                    case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                    case 47:
                    case 48:
                    case 49:
                        return AnonymousClass006.A00;
                    case 55:
                    case 57:
                    case 58:
                    case 59:
                    case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /*60*/:
                    case 61:
                        return AnonymousClass006.A01;
                    default:
                        throw AnonymousClass4VZ.A00();
                }
        }
        return AnonymousClass006.A0C;
    }

    public static final boolean A04(AnonymousClass2AD r0) {
        switch (r0.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case Rfc3492Idn.tmax /*26*/:
            case 30:
            case 31:
            case 34:
            case 35:
            case LangUtils.HASH_OFFSET /*37*/:
            case Rfc3492Idn.skew /*38*/:
            case 39:
            case Seq.RefTracker.REF_OFFSET /*42*/:
            case AnimationSpecKt.IDLE_DURATION /*50*/:
            case 56:
            case 62:
                return false;
            case 1:
            case 2:
            case 3:
            case 4:
            case 9:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 14:
            case 15:
            case 16:
            case LangUtils.HASH_SEED /*17*/:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
            case 32:
            case 33:
            case Rfc3492Idn.base /*36*/:
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
            case Seq.NULL_REFNUM /*41*/:
            case 43:
            case 44:
            case 45:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
            case 47:
            case 48:
            case 49:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 57:
            case 58:
            case 59:
            case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /*60*/:
            case 61:
                return true;
            default:
                throw AnonymousClass4VZ.A00();
        }
    }
}
