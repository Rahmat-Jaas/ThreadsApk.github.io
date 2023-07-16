package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.content.FileProvider;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.dextricks.Constants;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.avatar.AddAvatarHelper$LoadedImage$LoadedImageMetadata;
import com.instagram.creation.photo.crop.AvatarCropActivity;
import com.instagram.graphql.instagramschema.IGFxFbProfilePicIsSilhouetteQueryResponseImpl;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.io.IOException;

/* renamed from: X.4Ai  reason: invalid class name and case insensitive filesystem */
public final class C69794Ai implements C33745Htj, CallerContextable {
    public static final String __redex_internal_original_name = "AddAvatarHelper";
    public AnonymousClass37S A00;
    public C84584tU A01 = null;
    public AnonymousClass1cR A02;
    public UserSession A03;
    public File A04;
    public File A05;
    public boolean A06;
    public CharSequence[] A07;

    public final /* synthetic */ void BNY(Intent intent) {
    }

    public final /* synthetic */ void CvN(Intent intent, int i) {
    }

    public static void A00(Uri uri, C69794Ai r6) {
        AnonymousClass1cR r0 = r6.A02;
        if (r0 != null) {
            Context requireContext = r0.requireContext();
            UserSession userSession = r6.A03;
            C04220Ms.A0B(uri, 1);
            Bundle bundle = new AnonymousClass343(requireContext).A00;
            bundle.putParcelable(C28174Ezk.A00(337), uri);
            bundle.putBoolean(C28174Ezk.A00(338), true);
            bundle.putInt(C28174Ezk.A00(339), 1080);
            Intent A042 = C18250wR.A04(requireContext, AvatarCropActivity.class);
            A042.putExtras(bundle);
            C18230wP.A12(A042, userSession);
            C10650ih.A0E(A042, r6.A02, 3);
        }
    }

    public static void A01(C69794Ai r9) {
        AnonymousClass1cR r0 = r9.A02;
        if (r0 != null) {
            Context requireContext = r0.requireContext();
            File file = new File(AnonymousClass00U.A0d(requireContext.getCacheDir().getAbsolutePath(), "/images/", GZ5.A00(System.currentTimeMillis()), ".jpg"));
            r9.A05 = file;
            AnonymousClass1cR r7 = r9.A02;
            String A002 = I17.A00(90);
            try {
                File parentFile = file.getParentFile();
                parentFile.getClass();
                parentFile.mkdirs();
                file.createNewFile();
                Runtime.getRuntime().exec(AnonymousClass00U.A0L("chmod 0666", file.getPath()));
            } catch (IOException unused) {
            }
            Context requireContext2 = r7.requireContext();
            Intent A052 = C18250wR.A05(A002);
            Uri A003 = FileProvider.A00(requireContext2, file, "com.instagram.fileprovider");
            A052.addFlags(3);
            PackageManager packageManager = requireContext2.getPackageManager();
            packageManager.getClass();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(A052, Constants.LOAD_RESULT_PGO_ATTEMPTED)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                activityInfo.getClass();
                requireContext2.grantUriPermission(activityInfo.packageName, A003, 3);
            }
            A052.putExtra("output", A003);
            C10650ih.A07(r7, A052, 4);
        }
    }

    public static boolean A02(Context context, C69794Ai r3, int i, int i2) {
        return r3.A07[i].equals(context.getString(i2));
    }

    public static boolean A03(UserSession userSession) {
        if (userSession == null) {
            return true;
        }
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C63233h2.A00(), "IGFxFbProfilePicIsSilhouetteQuery", GraphQlCallInput.A00().A07(), GraphQlCallInput.A00().A07(), IGFxFbProfilePicIsSilhouetteQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fx_accounts");
        C679241d r1 = new C679241d();
        AnonymousClass3WK.A01(userSession).AMA(pandoGraphQLRequest, r1);
        return r1.A00;
    }

    public final void A04() {
        C84584tU r4 = this.A01;
        if (r4 != null) {
            C28923FeI feI = C28923FeI.PROFILE_PHOTO;
            C25818DsX dsX = new C25818DsX(feI);
            dsX.A01 = true;
            dsX.A02 = false;
            dsX.A04 = true;
            dsX.A07 = false;
            dsX.A08 = false;
            dsX.A05 = false;
            r4.Cvr(C170769vX.PROFILE, new MediaCaptureConfig(dsX), feI);
        }
    }

    public final void Cv8(File file, int i) {
        AnonymousClass1cR r0 = this.A02;
        if (r0 != null) {
            AnonymousClass3Zy.A03(r0, file, i);
        }
    }

    public C69794Ai(Bundle bundle, AnonymousClass1cR r6, UserSession userSession) {
        this.A02 = r6;
        this.A03 = userSession;
        if (bundle != null) {
            if (bundle.containsKey("AddAvatarHelper.IMAGE_METADATA")) {
                AddAvatarHelper$LoadedImage$LoadedImageMetadata addAvatarHelper$LoadedImage$LoadedImageMetadata = (AddAvatarHelper$LoadedImage$LoadedImageMetadata) C18240wQ.A0D(bundle, "AddAvatarHelper.IMAGE_METADATA");
                new C18480xG(addAvatarHelper$LoadedImage$LoadedImageMetadata.A01, this, addAvatarHelper$LoadedImage$LoadedImageMetadata.A00).execute(new Void[0]);
                bundle.remove("AddAvatarHelper.IMAGE_METADATA");
            }
            String string = bundle.getString("tempCameraPhotoFile");
            if (string != null) {
                this.A05 = new File(string);
            }
            String string2 = bundle.getString("tempGalleryPhotoFile");
            if (string2 != null) {
                this.A04 = new File(string2);
            }
        }
    }
}
