package X;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.auth.zzcb;
import com.instagram.debug.devoptions.cam.AnimationSpecKt;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: X.7K9  reason: invalid class name */
public final class AnonymousClass7K9 {
    public static final ComponentName A00 = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final C113826sD A01 = new C113826sD("Auth", "GoogleAuthUtil");
    public static final String[] A02 = {"com.google", "com.google.work", "cn.google"};

    public static Object A02(AnonymousClass7HU r5, String str) {
        try {
            return C117056y3.A00(r5);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof C32102Af) {
                throw cause;
            }
            String format = String.format("Unable to get a result for %s due to ExecutionException.", new Object[]{str});
            A01.A01(format, new Object[0]);
            throw new IOException(format, e);
        } catch (InterruptedException e2) {
            String format2 = String.format("Interrupted while waiting for the task of %s to finish.", new Object[]{str});
            A01.A01(format2, new Object[0]);
            throw new IOException(format2, e2);
        } catch (CancellationException e3) {
            String format3 = String.format("Canceled while waiting for the task of %s to finish.", new Object[]{str});
            A01.A01(format3, new Object[0]);
            throw new IOException(format3, e3);
        }
    }

    public static TokenData A00(Bundle bundle) {
        String str;
        String str2;
        Class<TokenData> cls = TokenData.class;
        bundle.setClassLoader(cls.getClassLoader());
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 != null) {
            bundle2.setClassLoader(cls.getClassLoader());
            TokenData tokenData = (TokenData) bundle2.getParcelable("TokenData");
            if (tokenData != null) {
                return tokenData;
            }
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        Integer num = AnonymousClass006.A05;
        for (Integer num2 : AnonymousClass006.A00(54)) {
            switch (num2.intValue()) {
                case 1:
                    str2 = "DeviceManagementRequiredOrSyncDisabled";
                    break;
                case 2:
                    str2 = "SocketTimeout";
                    break;
                case 3:
                    str2 = "Ok";
                    break;
                case 4:
                    str2 = "UNKNOWN_ERR";
                    break;
                case 5:
                    str2 = C28174Ezk.A00(56);
                    break;
                case 6:
                    str2 = "ServiceUnavailable";
                    break;
                case 7:
                    str2 = "InternalError";
                    break;
                case 8:
                    str2 = "BadAuthentication";
                    break;
                case 9:
                    str2 = "EmptyConsumerPackageOrSig";
                    break;
                case 10:
                    str2 = "InvalidSecondFactor";
                    break;
                case 11:
                    str2 = "PostSignInFlowRequired";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str2 = "NeedsBrowser";
                    break;
                case 13:
                    str2 = "Unknown";
                    break;
                case 14:
                    str2 = "NotVerified";
                    break;
                case 15:
                    str2 = "TermsNotAgreed";
                    break;
                case 16:
                    str2 = "AccountDisabled";
                    break;
                case LangUtils.HASH_SEED /*17*/:
                    str2 = "CaptchaRequired";
                    break;
                case 18:
                    str2 = "AccountDeleted";
                    break;
                case 19:
                    str2 = "ServiceDisabled";
                    break;
                case 20:
                    str2 = "NeedPermission";
                    break;
                case 21:
                    str2 = "NeedRemoteConsent";
                    break;
                case 22:
                    str2 = "INVALID_SCOPE";
                    break;
                case 23:
                    str2 = "UserCancel";
                    break;
                case 24:
                    str2 = "PermissionDenied";
                    break;
                case 25:
                    str2 = "INVALID_AUDIENCE";
                    break;
                case Rfc3492Idn.tmax /*26*/:
                    str2 = "UNREGISTERED_ON_API_CONSOLE";
                    break;
                case 27:
                    str2 = "ThirdPartyDeviceManagementRequired";
                    break;
                case 28:
                    str2 = "DeviceManagementInternalError";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                    str2 = "DeviceManagementSyncDisabled";
                    break;
                case 30:
                    str2 = "DeviceManagementAdminBlocked";
                    break;
                case 31:
                    str2 = "DeviceManagementAdminPendingApproval";
                    break;
                case 32:
                    str2 = "DeviceManagementStaleSyncRequired";
                    break;
                case 33:
                    str2 = "DeviceManagementDeactivated";
                    break;
                case 34:
                    str2 = "DeviceManagementScreenlockRequired";
                    break;
                case 35:
                    str2 = "DeviceManagementRequired";
                    break;
                case Rfc3492Idn.base /*36*/:
                    str2 = "ALREADY_HAS_GMAIL";
                    break;
                case LangUtils.HASH_OFFSET /*37*/:
                    str2 = "WeakPassword";
                    break;
                case Rfc3492Idn.skew /*38*/:
                    str2 = "BadRequest";
                    break;
                case 39:
                    str2 = "BadUsername";
                    break;
                case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                    str2 = "DeletedGmail";
                    break;
                case Seq.NULL_REFNUM /*41*/:
                    str2 = "ExistingUsername";
                    break;
                case Seq.RefTracker.REF_OFFSET /*42*/:
                    str2 = "LoginFail";
                    break;
                case 43:
                    str2 = "NotLoggedIn";
                    break;
                case 44:
                    str2 = "NoGmail";
                    break;
                case 45:
                    str2 = "RequestDenied";
                    break;
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                    str2 = "ServerError";
                    break;
                case 47:
                    str2 = "UsernameUnavailable";
                    break;
                case 48:
                    str2 = "GPlusOther";
                    break;
                case 49:
                    str2 = "GPlusNickname";
                    break;
                case AnimationSpecKt.IDLE_DURATION /*50*/:
                    str2 = "GPlusInvalidChar";
                    break;
                case 51:
                    str2 = "GPlusInterstitial";
                    break;
                case 52:
                    str2 = "ProfileUpgradeError";
                    break;
                case 53:
                    str2 = "AuthSecurityError";
                    break;
                default:
                    str2 = "ClientLoginDisabled";
                    break;
            }
            if (str2.equals(string)) {
                num = num2;
            }
        }
        if (AnonymousClass006.A1C.equals(num) || AnonymousClass006.A09.equals(num) || AnonymousClass006.A0D.equals(num) || AnonymousClass006.A0E.equals(num) || AnonymousClass006.A04.equals(num) || AnonymousClass006.A0G.equals(num) || AnonymousClass006.A01.equals(num) || AnonymousClass006.A0L.equals(num) || AnonymousClass006.A0M.equals(num) || AnonymousClass006.A0O.equals(num) || AnonymousClass006.A0P.equals(num) || AnonymousClass006.A0Q.equals(num) || AnonymousClass006.A0R.equals(num) || AnonymousClass006.A0T.equals(num) || AnonymousClass006.A0K.equals(num) || AnonymousClass006.A0S.equals(num)) {
            C113826sD r4 = A01;
            if (num != null) {
                switch (num.intValue()) {
                    case 1:
                        str = "DEVICE_MANAGEMENT_REQUIRED";
                        break;
                    case 2:
                        str = "SOCKET_TIMEOUT";
                        break;
                    case 3:
                        str = "SUCCESS";
                        break;
                    case 4:
                        str = "UNKNOWN_ERROR";
                        break;
                    case 5:
                        str = "NETWORK_ERROR";
                        break;
                    case 6:
                        str = "SERVICE_UNAVAILABLE";
                        break;
                    case 7:
                        str = "INTNERNAL_ERROR";
                        break;
                    case 8:
                        str = "BAD_AUTHENTICATION";
                        break;
                    case 9:
                        str = "EMPTY_CONSUMER_PKG_OR_SIG";
                        break;
                    case 10:
                        str = "NEEDS_2F";
                        break;
                    case 11:
                        str = "NEEDS_POST_SIGN_IN_FLOW";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        str = "NEEDS_BROWSER";
                        break;
                    case 13:
                        str = "UNKNOWN";
                        break;
                    case 14:
                        str = "NOT_VERIFIED";
                        break;
                    case 15:
                        str = "TERMS_NOT_AGREED";
                        break;
                    case 16:
                        str = "ACCOUNT_DISABLED";
                        break;
                    case LangUtils.HASH_SEED /*17*/:
                        str = "CAPTCHA";
                        break;
                    case 18:
                        str = "ACCOUNT_DELETED";
                        break;
                    case 19:
                        str = "SERVICE_DISABLED";
                        break;
                    case 20:
                        str = "NEED_PERMISSION";
                        break;
                    case 21:
                        str = "NEED_REMOTE_CONSENT";
                        break;
                    case 22:
                        str = "INVALID_SCOPE";
                        break;
                    case 23:
                        str = "USER_CANCEL";
                        break;
                    case 24:
                        str = "PERMISSION_DENIED";
                        break;
                    case 25:
                        str = "INVALID_AUDIENCE";
                        break;
                    case Rfc3492Idn.tmax /*26*/:
                        str = "UNREGISTERED_ON_API_CONSOLE";
                        break;
                    case 27:
                        str = "THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED";
                        break;
                    case 28:
                        str = "DM_INTERNAL_ERROR";
                        break;
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                        str = "DM_SYNC_DISABLED";
                        break;
                    case 30:
                        str = "DM_ADMIN_BLOCKED";
                        break;
                    case 31:
                        str = "DM_ADMIN_PENDING_APPROVAL";
                        break;
                    case 32:
                        str = "DM_STALE_SYNC_REQUIRED";
                        break;
                    case 33:
                        str = "DM_DEACTIVATED";
                        break;
                    case 34:
                        str = "DM_SCREENLOCK_REQUIRED";
                        break;
                    case 35:
                        str = "DM_REQUIRED";
                        break;
                    case Rfc3492Idn.base /*36*/:
                        str = "ALREADY_HAS_GMAIL";
                        break;
                    case LangUtils.HASH_OFFSET /*37*/:
                        str = "BAD_PASSWORD";
                        break;
                    case Rfc3492Idn.skew /*38*/:
                        str = "BAD_REQUEST";
                        break;
                    case 39:
                        str = "BAD_USERNAME";
                        break;
                    case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                        str = "DELETED_GMAIL";
                        break;
                    case Seq.NULL_REFNUM /*41*/:
                        str = "EXISTING_USERNAME";
                        break;
                    case Seq.RefTracker.REF_OFFSET /*42*/:
                        str = "LOGIN_FAIL";
                        break;
                    case 43:
                        str = "NOT_LOGGED_IN";
                        break;
                    case 44:
                        str = "NO_GMAIL";
                        break;
                    case 45:
                        str = "REQUEST_DENIED";
                        break;
                    case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                        str = "SERVER_ERROR";
                        break;
                    case 47:
                        str = "USERNAME_UNAVAILABLE";
                        break;
                    case 48:
                        str = "GPLUS_OTHER";
                        break;
                    case 49:
                        str = "GPLUS_NICKNAME";
                        break;
                    case AnimationSpecKt.IDLE_DURATION /*50*/:
                        str = "GPLUS_INVALID_CHAR";
                        break;
                    case 51:
                        str = "GPLUS_INTERSTITIAL";
                        break;
                    case 52:
                        str = "GPLUS_PROFILE_ERROR";
                        break;
                    case 53:
                        str = "AUTH_SECURITY_ERROR";
                        break;
                    default:
                        str = "CLIENT_LOGIN_DISABLED";
                        break;
                }
            } else {
                str = "null";
            }
            StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(str) + 31);
            A0s.append("isUserRecoverableError status: ");
            r4.A01("GoogleAuthUtil", C18180wK.A0i(str, A0s));
            throw new UserRecoverableAuthException(intent, string);
        } else if (AnonymousClass006.A0j.equals(num) || AnonymousClass006.A0u.equals(num) || AnonymousClass006.A15.equals(num) || AnonymousClass006.A0n.equals(num)) {
            throw C86154wM.A0V(string);
        } else {
            throw new AnonymousClass6CS(string);
        }
    }

    public static Object A01(ComponentName componentName, Context context, C143738hE r9) {
        AnonymousClass7M0 r4 = new AnonymousClass7M0();
        AnonymousClass7H7 A002 = AnonymousClass7H7.A00(context);
        try {
            if (A002.A02(r4, new AnonymousClass7Em(componentName), "GoogleAuthUtil")) {
                try {
                    C13320nQ.A04("BlockingServiceConnection.getService() called on main thread");
                    if (!r4.A00) {
                        r4.A00 = true;
                        Object DBv = r9.DBv((IBinder) r4.A01.take());
                        A002.A01(r4, new AnonymousClass7Em(componentName));
                        return DBv;
                    }
                    throw C18180wK.A0a("Cannot call get on this connection more than once");
                } catch (RemoteException | InterruptedException e) {
                    String.format(Locale.US, "GoogleAuthUtil", new Object[]{"Error on service connection.", e});
                    throw new IOException("Error on service connection.", e);
                } catch (Throwable th) {
                    A002.A01(r4, new AnonymousClass7Em(componentName));
                    throw th;
                }
            } else {
                throw C86154wM.A0V("Could not bind to service.");
            }
        } catch (SecurityException e2) {
            A01.A01("SecurityException while bind to auth service: %s", e2.getMessage());
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    public static void A04(Account account) {
        if (account == null) {
            throw C18190wL.A0a("Account cannot be null");
        } else if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = A02;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!strArr[i].equals(account.type)) {
                    i++;
                } else {
                    return;
                }
            }
            throw C18190wL.A0a("Account type not supported");
        } else {
            throw C18190wL.A0a("Account name cannot be empty!");
        }
    }

    public static void A06(Context context, String str) {
        C13320nQ.A04("Calling this from your main thread can lead to deadlock");
        A05(context);
        Bundle A06 = C18180wK.A06();
        String str2 = context.getApplicationInfo().packageName;
        A06.putString("clientPackageName", str2);
        if (!A06.containsKey("androidPackageName")) {
            A06.putString("androidPackageName", str2);
        }
        C37285Jny.A01(context);
        if (KCW.A00() && GoogleApiAvailability.A00.A02(context, 17895000) == 0) {
            C93255lG r6 = new C93255lG(context);
            zzcb zzcb = new zzcb();
            zzcb.A00 = str;
            AnonymousClass783 r2 = new AnonymousClass783((C97766Cr) null);
            r2.A03 = new Feature[]{C103886at.A00};
            r2.A01 = new C129277lc(zzcb, r6);
            try {
                A02(C129167lR.A01(r6, r2.A00(), 1), "clear token");
                return;
            } catch (C32102Af e) {
                A01.A01("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", "clear token", Log.getStackTraceString(e));
            }
        }
        A01(A00, context, new C129067lD(str, A06));
    }

    public static void A07(Object obj) {
        if (obj == null) {
            A01.A01("GoogleAuthUtil", "Service call returned null.");
            throw C86154wM.A0V("Service unavailable.");
        }
    }

    public static String A03(Account account, Context context, String str) {
        TokenData tokenData;
        Bundle A06 = C18180wK.A06();
        A04(account);
        C13320nQ.A04("Calling this from your main thread can lead to deadlock");
        C13320nQ.A05(str, "Scope cannot be empty or null.");
        A04(account);
        A05(context);
        Bundle bundle = new Bundle(A06);
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (C18240wQ.A1T(bundle, "androidPackageName")) {
            bundle.putString("androidPackageName", str2);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        C37285Jny.A01(context);
        if (KCW.A00() && GoogleApiAvailability.A00.A02(context, 17895000) == 0) {
            C93255lG r5 = new C93255lG(context);
            C13320nQ.A02(account, "Account name cannot be null!");
            C13320nQ.A05(str, "Scope cannot be null!");
            AnonymousClass783 r2 = new AnonymousClass783((C97766Cr) null);
            r2.A03 = new Feature[]{C103886at.A00};
            r2.A01 = new C129307lf(account, bundle, r5, str);
            try {
                Bundle bundle2 = (Bundle) A02(C129167lR.A01(r5, r2.A00(), 1), "token retrieval");
                A07(bundle2);
                tokenData = A00(bundle2);
            } catch (C32102Af e) {
                A01.A01("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", "token retrieval", Log.getStackTraceString(e));
            }
            return tokenData.A00;
        }
        tokenData = (TokenData) A01(A00, context, new AnonymousClass7lE(account, bundle, str));
        return tokenData.A00;
    }

    public static void A05(Context context) {
        Throwable th;
        try {
            Context applicationContext = context.getApplicationContext();
            C121217Ev r1 = C121217Ev.A00;
            int A022 = r1.A02(applicationContext, 8400000);
            if (A022 != 0) {
                Intent A03 = r1.A03(applicationContext, "e", A022);
                Log.e("GooglePlayServicesUtil", C86104wH.A10("GooglePlayServices not available due to error ", C86114wI.A0s(57), A022));
                if (A03 == null) {
                    th = new C97526Br();
                } else {
                    th = new C93055kw(A03, A022);
                }
                throw th;
            }
        } catch (C93055kw e) {
            throw new C93025kl(new Intent(e.A00), e.getMessage());
        } catch (C97526Br e2) {
            throw new AnonymousClass6CS(e2.getMessage());
        }
    }
}
