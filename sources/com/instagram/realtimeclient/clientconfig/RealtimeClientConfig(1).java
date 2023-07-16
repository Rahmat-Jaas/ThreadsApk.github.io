package com.instagram.realtimeclient.clientconfig;

import X.C04220Ms;
import com.instagram.realtimeclient.clientconfig.L;
import com.instagram.service.session.UserSession;

public final class RealtimeClientConfig {
    public final int delayDisconnectMQTTMS = 300000;
    public boolean isRealtimeEventLogEnabled;
    public int logReceiveMessageSampleRate;
    public boolean mqttAnalyticsLoggingEnabled;
    public final UserSession userSession;

    public RealtimeClientConfig(UserSession userSession2) {
        C04220Ms.A0B(userSession2, 1);
        this.userSession = userSession2;
    }

    public final synchronized int getLogReceiveMessageSampleRate() {
        return this.logReceiveMessageSampleRate;
    }

    public final synchronized boolean getMqttAnalyticsLoggingEnabled() {
        return this.mqttAnalyticsLoggingEnabled;
    }

    public final synchronized boolean isRealtimeEventLogEnabled() {
        return this.isRealtimeEventLogEnabled;
    }

    public final synchronized void loadConfig() {
        this.mqttAnalyticsLoggingEnabled = false;
        this.logReceiveMessageSampleRate = 0;
        this.isRealtimeEventLogEnabled = L.ig_android_realtime_subscription_log.is_enabled.getAndExpose(this.userSession).booleanValue();
    }

    public final int getDelayDisconnectMQTTMS() {
        return this.delayDisconnectMQTTMS;
    }

    public final long getGQLSSamplingWeight() {
        return L.ig_android_realtime_subscription_log.sampling_weight.getAndExpose(this.userSession).longValue();
    }

    public final boolean isGqlsDebugLogEnable() {
        return L.ig_android_realtime_subscription_log.is_gqls_debug_log_enabled.getAndExpose(this.userSession).booleanValue();
    }
}
