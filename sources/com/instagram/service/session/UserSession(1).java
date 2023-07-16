package com.instagram.service.session;

import X.AnonymousClass0BO;
import X.AnonymousClass0QH;
import X.AnonymousClass0Qg;
import X.C04220Ms;
import X.C07420bU;
import X.C07540bg;
import X.C08030cc;
import X.C10300i6;
import com.instagram.user.model.User;

public final class UserSession extends C10300i6 {
    public static final AnonymousClass0Qg Companion = new AnonymousClass0Qg();
    public final C07540bg endSessionManager;
    public final boolean isLoggedIn = true;
    public boolean isLoggedOut;
    public boolean isManaged;
    public final AnonymousClass0BO multipleAccountHelper;
    public volatile AnonymousClass0QH sessionState = AnonymousClass0QH.STARTED;
    public final String token;
    public final User user;
    public final User userDeprecatedDontUse;
    public C08030cc userSessionEnder;

    public UserSession(User user2, AnonymousClass0BO r6, C07540bg r7, boolean z, C07420bU r9) {
        this.user = user2;
        this.multipleAccountHelper = r6;
        this.endSessionManager = r7;
        this.userDeprecatedDontUse = user2;
        this.isManaged = z;
        String id = user2.getId();
        C04220Ms.A0B(id, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(id.hashCode());
        sb.append(':');
        sb.append(id);
        this.token = sb.toString();
    }

    public final String getUserId() {
        return this.user.getId();
    }

    public boolean hasEnded() {
        if (this.sessionState.ordinal() >= 2) {
            return true;
        }
        return false;
    }

    public final boolean isStopped() {
        if (this.sessionState.ordinal() >= 1) {
            return true;
        }
        return false;
    }

    public String getToken() {
        return this.token;
    }

    public final User getUserDeprecatedDontUse() {
        return this.userDeprecatedDontUse;
    }

    public boolean isLoggedIn() {
        return true;
    }
}
