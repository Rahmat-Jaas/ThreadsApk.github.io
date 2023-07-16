package X;

import android.app.Application;
import com.instagram.settings.language.ContentLanguageSettingsRepository;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0zV  reason: invalid class name and case insensitive filesystem */
public final class C19220zV extends AnonymousClass10X {
    public List A00;
    public final ContentLanguageSettingsRepository A01;
    public final Locale A02;
    public final C86064wD A03;
    public final C84714tk A04;
    public final C86074wE A05 = C18190wL.A0z(new AnonymousClass19T(AnonymousClass0ZV.A00));

    public C19220zV(Application application, ContentLanguageSettingsRepository contentLanguageSettingsRepository, Locale locale) {
        super(application);
        this.A01 = contentLanguageSettingsRepository;
        this.A02 = locale;
        C27442EnY enY = new C27442EnY();
        this.A03 = enY;
        this.A04 = AnonymousClass7C4.A02(enY);
    }
}
