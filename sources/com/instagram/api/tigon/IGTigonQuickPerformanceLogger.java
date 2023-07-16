package com.instagram.api.tigon;

import X.AnonymousClass01V;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.GXK;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.KtLambdaShape0S1300100_I2;
import kotlin.jvm.internal.KtLambdaShape1S1200100_I2;
import kotlin.jvm.internal.KtLambdaShape1S2200000_I2;
import kotlin.jvm.internal.KtLambdaShape31S0201000_I2;
import kotlin.jvm.internal.KtLambdaShape3S1210000_I2;
import kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2;
import kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1;
import kotlin.jvm.internal.KtLambdaShape6S1201000_I2;

public final class IGTigonQuickPerformanceLogger {
    public final boolean appStartRequestsEnabled;
    public final Pattern filteredQplUrlPattern;
    public final String filteredQplUrlRegex;
    public int firstFeedRequestId;
    public boolean firstFeedRequestLogged;
    public int firstStoryRequestId;
    public boolean firstStoryRequestLogged;
    public final boolean highSampleRateEnabled;
    public final AnonymousClass01V logger;

    public IGTigonQuickPerformanceLogger(AnonymousClass01V r2, boolean z, boolean z2, String str) {
        Pattern compile;
        C18180wK.A1Q(r2, 1, str);
        this.logger = r2;
        this.highSampleRateEnabled = z;
        this.appStartRequestsEnabled = z2;
        this.filteredQplUrlRegex = str;
        if (str.equals("")) {
            compile = null;
        } else {
            compile = Pattern.compile(str, 2);
        }
        this.filteredQplUrlPattern = compile;
    }

    public final void markerAnnotate(GXK gxk, String str, String str2) {
        AnonymousClass0wJ.A1N(gxk, str);
        C04220Ms.A0B(str2, 2);
        withMarkers(gxk, new KtLambdaShape1S2200000_I2(this, gxk, str2, str, 8));
    }

    public final void markerEnd(GXK gxk, short s) {
        C04220Ms.A0B(gxk, 0);
        withMarkers(gxk, new KtLambdaShape31S0201000_I2(s, 4, this, gxk));
        if (!this.appStartRequestsEnabled) {
            return;
        }
        if (!this.firstFeedRequestLogged || !this.firstStoryRequestLogged) {
            if (gxk.hashCode() == this.firstFeedRequestId) {
                this.firstFeedRequestLogged = true;
            }
            if (gxk.hashCode() == this.firstStoryRequestId) {
                this.firstStoryRequestLogged = true;
            }
        }
    }

    public final void markerStart(GXK gxk) {
        C04220Ms.A0B(gxk, 0);
        withMarkers(gxk, new KtLambdaShape41S0200000_I2_2(17, (Object) this, (Object) gxk));
    }

    public final long currentMonotonicTimestampNanos() {
        return this.logger.currentMonotonicTimestampNanos();
    }

    public final int getFirstFeedRequestId() {
        return this.firstFeedRequestId;
    }

    public final boolean getFirstFeedRequestLogged() {
        return this.firstFeedRequestLogged;
    }

    public final int getFirstStoryRequestId() {
        return this.firstStoryRequestId;
    }

    public final boolean getFirstStoryRequestLogged() {
        return this.firstStoryRequestLogged;
    }

    private final void withMarkers(GXK gxk, AnonymousClass0YY r5) {
        Matcher matcher;
        r5.invoke(926483817);
        if (this.highSampleRateEnabled) {
            r5.invoke(677319650);
        }
        if (this.appStartRequestsEnabled && (!this.firstFeedRequestLogged || !this.firstStoryRequestLogged)) {
            r5.invoke(429329736);
        }
        Pattern pattern = this.filteredQplUrlPattern;
        if (pattern != null && (matcher = pattern.matcher(gxk.A08.toString())) != null && matcher.find()) {
            r5.invoke(183640166);
        }
    }

    public final void markerPoint(GXK gxk, String str) {
        AnonymousClass0wJ.A1N(gxk, str);
        withMarkers(gxk, new KtLambdaShape4S1200000_I2_1(gxk, this, str, 6));
    }

    public final void setFirstFeedRequestId(int i) {
        this.firstFeedRequestId = i;
    }

    public final void setFirstFeedRequestLogged(boolean z) {
        this.firstFeedRequestLogged = z;
    }

    public final void setFirstStoryRequestId(int i) {
        this.firstStoryRequestId = i;
    }

    public final void setFirstStoryRequestLogged(boolean z) {
        this.firstStoryRequestLogged = z;
    }

    public final void setTheFirstFeedRequestId(int i) {
        this.firstFeedRequestId = i;
    }

    public final void setTheFirstStoryRequestId(int i) {
        this.firstStoryRequestId = i;
    }

    public final void markerAnnotate(GXK gxk, String str, int i) {
        withMarkers(gxk, new KtLambdaShape6S1201000_I2(this, gxk, str, i, AnonymousClass0wJ.A1Z(gxk, str) ? 1 : 0));
    }

    public final void markerPoint(GXK gxk, String str, long j, TimeUnit timeUnit) {
        AnonymousClass0wJ.A1N(gxk, str);
        C04220Ms.A0B(timeUnit, 3);
        withMarkers(gxk, new KtLambdaShape0S1300100_I2(this, gxk, timeUnit, str, 2, j));
    }

    public final void markerAnnotate(GXK gxk, String str, boolean z) {
        AnonymousClass0wJ.A1N(gxk, str);
        withMarkers(gxk, new KtLambdaShape3S1210000_I2(this, gxk, str, 7, z));
    }

    public final void markerAnnotate(GXK gxk, String str, long j) {
        AnonymousClass0wJ.A1N(gxk, str);
        withMarkers(gxk, new KtLambdaShape1S1200100_I2(this, gxk, str, 2, j));
    }
}
