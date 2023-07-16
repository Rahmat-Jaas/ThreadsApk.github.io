package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.0r8  reason: invalid class name and case insensitive filesystem */
public final class C15330r8 {
    public static final String A00 = C15330r8.class.toString();
    public static final ConcurrentLinkedQueue A01 = new ConcurrentLinkedQueue();
    public static volatile boolean A02 = "true".equals(C02640Cf.A01("fb.enable_resource_coverage"));

    public static void A00(Context context) {
        if (A02) {
            Resources resources = context.getResources();
            List<String> singletonList = Collections.singletonList(context.getPackageResourcePath());
            if (A02) {
                ResourcesLoader resourcesLoader = new ResourcesLoader();
                C15950sE r4 = new C15950sE();
                for (String str : singletonList) {
                    String str2 = A00;
                    try {
                        resourcesLoader.addProvider(ResourcesProvider.loadFromApk(ParcelFileDescriptor.open(new File(str), 268435456), r4));
                    } catch (IOException e) {
                        AnonymousClass0LU.A0E(str2, "Failed to load apks due to error: %s", e);
                    }
                }
                resources.addLoaders(new ResourcesLoader[]{resourcesLoader});
                context.createConfigurationContext(resources.getConfiguration());
                AnonymousClass0M5 r2 = AnonymousClass0M6.A00;
                if (r2 != null) {
                    r2.CYW("resource_logging_running", Boolean.toString(true));
                }
            }
        }
    }
}
