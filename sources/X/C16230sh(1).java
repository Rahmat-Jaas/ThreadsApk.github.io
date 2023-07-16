package X;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0sh  reason: invalid class name and case insensitive filesystem */
public final class C16230sh {
    public int A00 = 0;
    public long A01 = 0;
    public ClipData A02 = null;
    public ComponentName A03 = null;
    public Intent A04 = null;
    public Rect A05 = null;
    public Uri A06 = null;
    public Bundle A07 = null;
    public C16240si A08;
    public AnonymousClass3GO A09 = null;
    public String A0A = null;
    public String A0B = null;
    public String A0C = null;
    public boolean A0D = false;
    public final Set A0E = new HashSet();

    public static int A00(C16230sh r6, int i) {
        int i2;
        boolean z = false;
        if ((8 & r6.A01) != 0) {
            z = true;
        }
        if (!z) {
            if (Build.VERSION.SDK_INT > 30) {
                i &= -33554433;
            }
            i2 = 67108864;
        } else {
            i &= -67108865;
            if (Build.VERSION.SDK_INT <= 30) {
                return i;
            }
            i2 = 33554432;
        }
        return i | i2;
    }

    public final Intent A04(Context context) {
        String packageName;
        Intent intent = new Intent();
        intent.setComponent(this.A03);
        intent.setFlags(this.A00);
        if (this.A0D) {
            intent.setComponent(new ComponentName(context, "com.facebook.invalid_class.f4c3b00c"));
            packageName = context.getPackageName();
        } else {
            intent.setAction(this.A0A);
            intent.setDataAndType(this.A06, this.A0C);
            intent.setSourceBounds(this.A05);
            intent.setSelector(this.A04);
            intent.setClipData(this.A02);
            for (String addCategory : this.A0E) {
                intent.addCategory(addCategory);
            }
            if (this.A07 != null) {
                intent.setExtrasClassLoader(context.getClassLoader());
                intent.putExtras(this.A07);
            }
            AnonymousClass3GO r1 = this.A09;
            if (r1 != null && !r1.A01(this.A06)) {
                String format = String.format("SecurePendingIntent UriFilter fails. Data: %s", new Object[]{this.A06});
                C16240si r0 = this.A08;
                if (r0 != null) {
                    r0.Ccv(format);
                } else {
                    throw new IllegalArgumentException("Please set reporter for SecurePendingIntent library");
                }
            }
            long j = this.A01;
            if ((1 & j) != 0) {
                if ((4 & j) == 0) {
                    String str = this.A0B;
                    if (str == null) {
                        str = context.getPackageName();
                        this.A0B = str;
                    }
                    intent.setPackage(str);
                    if ((2 & this.A01) != 0) {
                        if (!this.A0B.equals(context.getPackageName())) {
                            C16240si r02 = this.A08;
                            if (r02 != null) {
                                r02.Ccv("SecurePendingIntent is configured to allow only implicit intent going to the same app, but detected intent for a different app.");
                            } else {
                                throw new IllegalArgumentException("Please set reporter for SecurePendingIntent library");
                            }
                        }
                    }
                    if (intent.getAction() != null && !intent.getAction().startsWith("android")) {
                        return intent;
                    }
                    if (intent.getCategories() != null && !intent.getCategories().isEmpty()) {
                        return intent;
                    }
                    C16240si r03 = this.A08;
                    if (r03 != null) {
                        r03.Ccv("SecurePendingIntent is configured to allow implicit intent with either customized action or categories");
                        return intent;
                    }
                    throw new IllegalArgumentException("Please set reporter for SecurePendingIntent library");
                }
                return intent;
            } else if (intent.getComponent() != null) {
                packageName = intent.getComponent().getPackageName();
            } else {
                throw new SecurityException("Must generate PendingIntent based on an explicit intent.");
            }
        }
        intent.setPackage(packageName);
        return intent;
    }

    public final void A05() {
        this.A01 |= 1;
    }

    public final void A07(AnonymousClass3GO r3) {
        if (r3 == null || r3.A00()) {
            throw new IllegalArgumentException("SecurePendingIntent is configured to allow UNSAFE implicit intent and needs to define NON-EMPTY UriFilter for data.");
        }
        this.A09 = r3;
    }

    public final PendingIntent A01(Context context, int i, int i2) {
        return PendingIntent.getActivity(context, i, A04(context), A00(this, i2));
    }

    public final PendingIntent A02(Context context, int i, int i2) {
        return PendingIntent.getBroadcast(context, i, A04(context), A00(this, i2));
    }

    public final PendingIntent A03(Context context, int i, int i2) {
        return PendingIntent.getService(context, i, A04(context), A00(this, i2));
    }

    public final void A06(Intent intent, ClassLoader classLoader) {
        this.A03 = intent.getComponent();
        this.A0A = intent.getAction();
        this.A06 = intent.getData();
        this.A0C = intent.getType();
        this.A05 = intent.getSourceBounds();
        this.A04 = intent.getSelector();
        this.A02 = intent.getClipData();
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            this.A0E.addAll(categories);
        }
        this.A00 = intent.getFlags();
        if (intent.getExtras() != null) {
            if (classLoader != null) {
                intent.setExtrasClassLoader(classLoader);
            }
            Bundle extras = intent.getExtras();
            Bundle bundle = this.A07;
            if (bundle == null) {
                bundle = new Bundle();
                this.A07 = bundle;
            }
            if (classLoader != null) {
                bundle.setClassLoader(classLoader);
            }
            this.A07.putAll(extras);
        }
    }
}
