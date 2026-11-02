package com.queen.assistant.data.model

data class Feature(
    val id: Int,
    val name: String,
    val category: String,
    val description: String
)

object FeatureCatalog {

    val all = listOf(
        Feature(1, "Home Dashboard", "Main", "Personal AI dashboard"),
        Feature(2, "AI Chat", "Main", "Conversational AI"),
        Feature(3, "Voice Assistant", "Main", "Voice interaction"),
        Feature(4, "Phone Control", "Main", "Authorized phone controls"),
        Feature(5, "WhatsApp & Messages", "Main", "Message preparation"),
        Feature(6, "Projects & Tasks", "Main", "Project management"),
        Feature(7, "Documents & PDF", "Main", "Document intelligence"),
        Feature(8, "Finance Manager", "Main", "Income and expenses"),
        Feature(9, "Memory", "Main", "User-approved memory"),
        Feature(10, "Settings & Security", "Main", "Privacy and settings"),

        Feature(11, "Smart Routines", "Additional", "Personal automation"),
        Feature(12, "AI Vision", "Additional", "Image understanding"),
        Feature(13, "Live Translator", "Additional", "Language translation"),
        Feature(14, "Personal Life Manager", "Additional", "Daily planning"),
        Feature(15, "Security Center", "Additional", "Privacy controls"),
        Feature(16, "Knowledge Brain", "Additional", "Searchable knowledge"),
        Feature(17, "AI Web Research", "Additional", "Research with sources"),
        Feature(18, "Notification Assistant", "Additional", "Authorized notifications"),
        Feature(19, "Find My Phone", "Additional", "Device finding tools"),
        Feature(20, "AI Learning Mode", "Additional", "Study assistance"),
        Feature(21, "Voice Personality", "Additional", "Voice configuration"),
        Feature(22, "Travel Assistant", "Additional", "Trip planning"),
        Feature(23, "Emergency Mode", "Additional", "Emergency shortcuts"),
        Feature(24, "Custom AI Commands", "Additional", "Custom commands"),

        Feature(25, "Multi-Agent AI Brain", "Advanced", "Specialist task routing"),
        Feature(26, "Smart Home", "Advanced", "Compatible home devices"),
        Feature(27, "Driving Mode", "Advanced", "Hands-free assistance"),
        Feature(28, "Meeting Assistant", "Advanced", "Consent-based meeting notes"),
        Feature(29, "Screen Understanding", "Advanced", "Authorized screen assistance"),
        Feature(30, "Shopping Assistant", "Advanced", "Product comparisons"),
        Feature(31, "Developer Mode", "Advanced", "Coding assistance"),
        Feature(32, "Offline AI Mode", "Advanced", "Offline capabilities"),
        Feature(33, "AI Personality Studio", "Advanced", "Avatar and personality"),
        Feature(34, "Focus & Productivity", "Advanced", "Focus tools"),
        Feature(35, "Secure Cloud Sync", "Advanced", "Optional encrypted sync"),
        Feature(36, "Personal Insights", "Advanced", "Personal activity summaries")
    )
}
