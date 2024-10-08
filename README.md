[![Maven Central](https://img.shields.io/maven-central/v/io.github.moriafly/salt-ui)](https://search.maven.org/search?q=g:io.github.moriafly)

# Salt UI

Salt UI is UI components based on [Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform). The 1.0 version is derived from some UI components of [Salt Player](https://github.com/Moriafly/SaltPlayerSource). Currently, Salt UI is used in Salt Player, Emo Scroll, Qinalt and other App to serve hundreds of thousands of users

```kotlin
// Replace <TAG> with the latest version
// e.g. implementation("io.github.moriafly:salt-ui:2.0.0")
implementation("io.github.moriafly:salt-ui:<TAG>")
```

## Compatibility

| Compose Multiplatform | Salt UI |
|-----------------------|---------|
| 1.7.0-alpha03         | 2.0.7   |
| 1.7.0-alpha02         | 2.0.4   |
| 1.6.11                | < 2.0.4 |

## Docs

See also [Docs](https://sakawish.github.io/open-source/salt-ui/)

### Simple Start

```kotlin
@Composable
fun App() {
    SaltTheme(
        configs = saltConfigs()
    ) {
        // ...
    }
}
```

### Utils

#### WindowUtils (Android, Unstable)

Use `setStatusBarForegroundColor` to change foreground color of status bar

Use `setNavigationBarForegroundColor` to change foreground color of navigation bar

```kotlin
import com.moriafly.salt.ui.util.WindowUtils
import com.moriafly.salt.ui.util.WindowUtils.BarColor

WindowUtils.setStatusBarForegroundColor(activity.window, BarColor.Black)
```

## Others

- [LICENSE](LICENSE)
- [Contributor Covenant Code of Conduct](CODE_OF_CONDUCT.md)

## Star History

[![Star History Chart](https://api.star-history.com/svg?repos=Moriafly/SaltUI&type=Date)](https://star-history.com/#Moriafly/SaltUI&Date)
