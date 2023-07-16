package com.instagram.debug.devoptions.newsfeed;

import X.AnonymousClass0wJ;
import X.AnonymousClass4UR;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C10300i6;
import X.C11630kW;
import X.C134747yH;
import X.C14030oh;
import X.C18200wM;
import X.C34640IcN;
import X.C80644m9;
import X.C82034oy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ActivityFeedShowcaseComposeFragment extends C34640IcN implements C11630kW, C82034oy {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final C134747yH LONG_MESSAGE = new C134747yH((List) null, 6, "This is a really really really really really long message. Hello world. This message is seriously long oh my gosh. And it just keeps on going and going and going...");
    public static final C134747yH LONG_MESSAGE_CONTENT_DESCRIPTION = new C134747yH((List) null, 6, "This is a really really really really really long message. Hello world. This message is seriously long oh my gosh. And it just keeps on going and going and going...");
    public static final C134747yH MESSAGE = new C134747yH((List) null, 6, "This is the message");
    public static final C134747yH MESSAGE_CONTENT_DESCRIPTION = new C134747yH((List) null, 6, "This is the message");
    public static final String TITLE = "Title text";
    public final C04530Oa user$delegate = new AnonymousClass4UR(new ActivityFeedShowcaseComposeFragment$user$2(this));
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131824987);
    }

    public String getModuleName() {
        return "activity_feed_showcase_compose";
    }

    /* access modifiers changed from: private */
    public final User getUser() {
        return (User) this.user$delegate.getValue();
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public C10300i6 getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1747199219);
        ComposeView A0L = C18200wM.A0L(this, new ActivityFeedShowcaseComposeFragment$onCreateView$1(this), -1033086718);
        C14030oh.A09(-57174663, A02);
        return A0L;
    }
}
