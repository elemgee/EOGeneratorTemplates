



<!DOCTYPE html>
<html lang="en" class=" is-copy-enabled emoji-size-boost is-u2f-enabled">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>

    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/frameworks-950cab7bceb85eef53ffca570f712802bc231f75eeebb1fc3c92e3886f37f2d2.css" integrity="sha256-lQyre864Xu9T/8pXD3EoArwjH3Xu67H8PJLjiG838tI=" media="all" rel="stylesheet" />
    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github-39a107bb17ad4e4a3622eb66d626e5ea30b70d84d7e1416b111721ea561181e2.css" integrity="sha256-OaEHuxetTko2Iutm1ibl6jC3DYTX4UFrERch6lYRgeI=" media="all" rel="stylesheet" />
    
    
    
    

    <link as="script" href="https://assets-cdn.github.com/assets/frameworks-7162beea272a856d06e084945fd8026a47bbb9e7eb295d95b60ea82b26c27296.js" rel="preload" />
    
    <link as="script" href="https://assets-cdn.github.com/assets/github-f8beb51311ba00b2b498862037f9e0f930d6ef948e94bda47ba40d686756c5c1.js" rel="preload" />

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    <meta name="viewport" content="width=device-width">
    
    
    <title>wolips/Entity.java at master · wocommunity/wolips</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
    <link rel="apple-touch-icon" href="/apple-touch-icon.png">
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-57x57.png">
    <link rel="apple-touch-icon" sizes="60x60" href="/apple-touch-icon-60x60.png">
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="76x76" href="/apple-touch-icon-76x76.png">
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114x114.png">
    <link rel="apple-touch-icon" sizes="120x120" href="/apple-touch-icon-120x120.png">
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144x144.png">
    <link rel="apple-touch-icon" sizes="152x152" href="/apple-touch-icon-152x152.png">
    <link rel="apple-touch-icon" sizes="180x180" href="/apple-touch-icon-180x180.png">
    <meta property="fb:app_id" content="1401488693436528">

      <meta content="https://avatars3.githubusercontent.com/u/690954?v=3&amp;s=400" name="twitter:image:src" /><meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="wocommunity/wolips" name="twitter:title" /><meta content="wolips" name="twitter:description" />
      <meta content="https://avatars3.githubusercontent.com/u/690954?v=3&amp;s=400" property="og:image" /><meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="wocommunity/wolips" property="og:title" /><meta content="https://github.com/wocommunity/wolips" property="og:url" /><meta content="wolips" property="og:description" />
      <meta name="browser-stats-url" content="https://api.github.com/_private/browser/stats">
    <meta name="browser-errors-url" content="https://api.github.com/_private/browser/errors">
    <link rel="assets" href="https://assets-cdn.github.com/">
    <link rel="web-socket" href="wss://live.github.com/_sockets/NjkwNjc4OmE0OWJjZTk4YTQ0ZWU4Yzg5ZTZkYTYxZGYwYmQ4NmRlOjE3M2IyZjEzMzBkMTI5NWJlMDRmNmE2YTVkOTg2MDFlZGY4N2RhYzRkYmIwMjA1MTViN2Y1MjY0NzIzMGUyZmU=--ea8b3a25d83cb834b55a42ca9e5b92946faca039">
    <meta name="pjax-timeout" content="1000">
    <link rel="sudo-modal" href="/sessions/sudo_modal">

    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="selected-link" value="repo_source" data-pjax-transient>

    <meta name="google-site-verification" content="KT5gs8h0wvaagLKAVWq8bbeNwnZZK1r1XQysX3xurLU">
<meta name="google-site-verification" content="ZzhVyEFwb7w3e0-uOTltm8Jsck2F5StVihD0exw2fsA">
    <meta name="google-analytics" content="UA-3769691-2">

<meta content="collector.githubapp.com" name="octolytics-host" /><meta content="github" name="octolytics-app-id" /><meta content="6B80983A:7329:BC8105:576178D9" name="octolytics-dimension-request_id" /><meta content="690678" name="octolytics-actor-id" /><meta content="elemgee" name="octolytics-actor-login" /><meta content="0d7a0c26aba95f134a630d83982431b7a8920f3e358b6453520eb490e900ed26" name="octolytics-actor-hash" />
<meta content="/&lt;user-name&gt;/&lt;repo-name&gt;/blob/show" data-pjax-transient="true" name="analytics-location" />



  <meta class="js-ga-set" name="dimension1" content="Logged In">



        <meta name="hostname" content="github.com">
    <meta name="user-login" content="elemgee">

        <meta name="expected-hostname" content="github.com">
      <meta name="js-proxy-site-detection-payload" content="ZTA1YmQ0MDExZDZkNWZlZWY4MzVmYTkwMzA4MGRhNzFhZDljZDNlM2RkOTk5MTZiZDk5MmMyMTQ5NmU0NTI2MXx7InJlbW90ZV9hZGRyZXNzIjoiMTA3LjEyOC4xNTIuNTgiLCJyZXF1ZXN0X2lkIjoiNkI4MDk4M0E6NzMyOTpCQzgxMDU6NTc2MTc4RDkiLCJ0aW1lc3RhbXAiOjE0NjYwMDU3MjF9">


      <link rel="mask-icon" href="https://assets-cdn.github.com/pinned-octocat.svg" color="#4078c0">
      <link rel="icon" type="image/x-icon" href="https://assets-cdn.github.com/favicon.ico">

    <meta name="html-safe-nonce" content="4cce98edfb88a59146708b6008d9d55677d47de6">
    <meta content="f3613d574daf1716d7dbc4038c6f6629fb02e69c" name="form-nonce" />

    <meta http-equiv="x-pjax-version" content="d7c87143a2da7002208e9538cf927af2">
    

      
  <meta name="description" content="wolips">
  <meta name="go-import" content="github.com/wocommunity/wolips git https://github.com/wocommunity/wolips.git">

  <meta content="690954" name="octolytics-dimension-user_id" /><meta content="wocommunity" name="octolytics-dimension-user_login" /><meta content="1585278" name="octolytics-dimension-repository_id" /><meta content="wocommunity/wolips" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="1585278" name="octolytics-dimension-repository_network_root_id" /><meta content="wocommunity/wolips" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/wocommunity/wolips/commits/master.atom" rel="alternate" title="Recent Commits to wolips:master" type="application/atom+xml">


      <link rel="canonical" href="https://github.com/wocommunity/wolips/blob/master/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java" data-pjax-transient>
  </head>


  <body class="logged-in   env-production macintosh vis-public page-blob">
    <div id="js-pjax-loader-bar" class="pjax-loader-bar"></div>
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>

    
    
    



        <div class="header header-logged-in true" role="banner">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/" data-hotkey="g d" aria-label="Homepage" data-ga-click="Header, go to dashboard, icon:logo">
  <svg aria-hidden="true" class="octicon octicon-mark-github" height="28" version="1.1" viewBox="0 0 16 16" width="28"><path d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z"></path></svg>
</a>


        <div class="header-search scoped-search site-scoped-search js-site-search" role="search">
  <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/wocommunity/wolips/search" class="js-site-search-form" data-scoped-search-url="/wocommunity/wolips/search" data-unscoped-search-url="/search" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
    <label class="form-control header-search-wrapper js-chromeless-input-container">
      <div class="header-search-scope">This repository</div>
      <input type="text"
        class="form-control header-search-input js-site-search-focus js-site-search-field is-clearable"
        data-hotkey="s"
        name="q"
        placeholder="Search"
        aria-label="Search this repository"
        data-unscoped-placeholder="Search GitHub"
        data-scoped-placeholder="Search"
        tabindex="1"
        autocapitalize="off">
    </label>
</form></div>


      <ul class="header-nav left" role="navigation">
        <li class="header-nav-item">
          <a href="/pulls" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:pulls context:user" data-hotkey="g p" data-selected-links="/pulls /pulls/assigned /pulls/mentioned /pulls">
            Pull requests
</a>        </li>
        <li class="header-nav-item">
          <a href="/issues" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:issues context:user" data-hotkey="g i" data-selected-links="/issues /issues/assigned /issues/mentioned /issues">
            Issues
</a>        </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="https://gist.github.com/" data-ga-click="Header, go to gist, text:gist">Gist</a>
          </li>
      </ul>

    
<ul class="header-nav user-nav right" id="user-links">
  <li class="header-nav-item">
    
    <a href="/notifications" aria-label="You have unread notifications" class="header-nav-link notification-indicator tooltipped tooltipped-s js-socket-channel js-notification-indicator" data-channel="tenant:1:notification-changed:690678" data-ga-click="Header, go to notifications, icon:unread" data-hotkey="g n">
        <span class="mail-status unread"></span>
        <svg aria-hidden="true" class="octicon octicon-bell" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path d="M14 12v1H0v-1l.73-.58c.77-.77.81-2.55 1.19-4.42C2.69 3.23 6 2 6 2c0-.55.45-1 1-1s1 .45 1 1c0 0 3.39 1.23 4.16 5 .38 1.88.42 3.66 1.19 4.42l.66.58H14zm-7 4c1.11 0 2-.89 2-2H5c0 1.11.89 2 2 2z"></path></svg>
</a>
  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link tooltipped tooltipped-s js-menu-target" href="/new"
       aria-label="Create new…"
       data-ga-click="Header, create new, icon:add">
      <svg aria-hidden="true" class="octicon octicon-plus left" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 9H7v5H5V9H0V7h5V2h2v5h5z"></path></svg>
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <ul class="dropdown-menu dropdown-menu-sw">
        
<a class="dropdown-item" href="/new" data-ga-click="Header, create new repository">
  New repository
</a>

  <a class="dropdown-item" href="/new/import" data-ga-click="Header, import a repository">
    Import repository
  </a>


  <a class="dropdown-item" href="/organizations/new" data-ga-click="Header, create new organization">
    New organization
  </a>



  <div class="dropdown-divider"></div>
  <div class="dropdown-header">
    <span title="wocommunity/wolips">This repository</span>
  </div>
    <a class="dropdown-item" href="/wocommunity/wolips/issues/new" data-ga-click="Header, create new issue">
      New issue
    </a>

      </ul>
    </div>
  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link name tooltipped tooltipped-sw js-menu-target" href="/elemgee"
       aria-label="View profile and more"
       data-ga-click="Header, show menu, icon:avatar">
      <img alt="@elemgee" class="avatar" height="20" src="https://avatars1.githubusercontent.com/u/690678?v=3&amp;s=40" width="20" />
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <div class="dropdown-menu dropdown-menu-sw">
        <div class="dropdown-header header-nav-current-user css-truncate">
          Signed in as <strong class="css-truncate-target">elemgee</strong>
        </div>

        <div class="dropdown-divider"></div>

        <a class="dropdown-item" href="/elemgee" data-ga-click="Header, go to profile, text:your profile">
          Your profile
        </a>
        <a class="dropdown-item" href="/stars" data-ga-click="Header, go to starred repos, text:your stars">
          Your stars
        </a>
        <a class="dropdown-item" href="/explore" data-ga-click="Header, go to explore, text:explore">
          Explore
        </a>
          <a class="dropdown-item" href="/integrations" data-ga-click="Header, go to integrations, text:integrations">
            Integrations
          </a>
        <a class="dropdown-item" href="https://help.github.com" data-ga-click="Header, go to help, text:help">
          Help
        </a>


        <div class="dropdown-divider"></div>

        <a class="dropdown-item" href="/settings/profile" data-ga-click="Header, go to settings, icon:settings">
          Settings
        </a>

        <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/logout" class="logout-form" data-form-nonce="f3613d574daf1716d7dbc4038c6f6629fb02e69c" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="r0hFKo65Ku2ZqWRXWckIIklyzJQzRZjhrmFbzHJBDKkSyxWAT3jWOklL1OjmmbTKDb/hhbbdGRTA6iunuHbrag==" /></div>
          <button class="dropdown-item dropdown-signout" data-ga-click="Header, sign out, icon:logout">
            Sign out
          </button>
</form>      </div>
    </div>
  </li>
</ul>


    
  </div>
</div>


      


    <div id="start-of-content" class="accessibility-aid"></div>

      <div id="js-flash-container">
</div>


    <div role="main" class="main-content">
        <div itemscope itemtype="http://schema.org/SoftwareSourceCode">
    <div id="js-repo-pjax-container" data-pjax-container>
      
<div class="pagehead repohead instapaper_ignore readability-menu experiment-repo-nav">
  <div class="container repohead-details-container">

    

<ul class="pagehead-actions">

  <li>
        <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-form-nonce="f3613d574daf1716d7dbc4038c6f6629fb02e69c" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="82Jp1fnOr72OSXmbV++6zZ2hlBq7UE0HvAaxub7ZtinMDc9wA26o95Ip7eEOCzN11UbwlTr/7ggmQ79XEkpRQg==" /></div>      <input class="form-control" id="repository_id" name="repository_id" type="hidden" value="1585278" />

        <div class="select-menu js-menu-container js-select-menu">
          <a href="/wocommunity/wolips/subscription"
            class="btn btn-sm btn-with-count select-menu-button js-menu-target" role="button" tabindex="0" aria-haspopup="true"
            data-ga-click="Repository, click Watch settings, action:blob#show">
            <span class="js-select-button">
              <svg aria-hidden="true" class="octicon octicon-eye" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"></path></svg>
              Watch
            </span>
          </a>
          <a class="social-count js-social-count" href="/wocommunity/wolips/watchers">
            20
          </a>

        <div class="select-menu-modal-holder">
          <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
            <div class="select-menu-header js-navigation-enable" tabindex="-1">
              <svg aria-label="Close" class="octicon octicon-x js-menu-close" height="16" role="img" version="1.1" viewBox="0 0 12 16" width="12"><path d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"></path></svg>
              <span class="select-menu-title">Notifications</span>
            </div>

              <div class="select-menu-list js-navigation-container" role="menu">

                <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
                  <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
                  <div class="select-menu-item-text">
                    <input checked="checked" id="do_included" name="do" type="radio" value="included" />
                    <span class="select-menu-item-heading">Not watching</span>
                    <span class="description">Be notified when participating or @mentioned.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <svg aria-hidden="true" class="octicon octicon-eye" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"></path></svg>
                      Watch
                    </span>
                  </div>
                </div>

                <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                  <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
                  <div class="select-menu-item-text">
                    <input id="do_subscribed" name="do" type="radio" value="subscribed" />
                    <span class="select-menu-item-heading">Watching</span>
                    <span class="description">Be notified of all conversations.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <svg aria-hidden="true" class="octicon octicon-eye" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"></path></svg>
                      Unwatch
                    </span>
                  </div>
                </div>

                <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                  <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
                  <div class="select-menu-item-text">
                    <input id="do_ignore" name="do" type="radio" value="ignore" />
                    <span class="select-menu-item-heading">Ignoring</span>
                    <span class="description">Never be notified.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <svg aria-hidden="true" class="octicon octicon-mute" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M8 2.81v10.38c0 .67-.81 1-1.28.53L3 10H1c-.55 0-1-.45-1-1V7c0-.55.45-1 1-1h2l3.72-3.72C7.19 1.81 8 2.14 8 2.81zm7.53 3.22l-1.06-1.06-1.97 1.97-1.97-1.97-1.06 1.06L11.44 8 9.47 9.97l1.06 1.06 1.97-1.97 1.97 1.97 1.06-1.06L13.56 8l1.97-1.97z"></path></svg>
                      Stop ignoring
                    </span>
                  </div>
                </div>

              </div>

            </div>
          </div>
        </div>
</form>
  </li>

  <li>
    
  <div class="js-toggler-container js-social-container starring-container ">

    <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/wocommunity/wolips/unstar" class="starred" data-form-nonce="f3613d574daf1716d7dbc4038c6f6629fb02e69c" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="pN303fxggQDve8KXHdOqpInYyiygYZ9s+hPfqmJ382OFPNkrih80Au16Obd3RRibHJla5E09PAtypnjtNCwDNA==" /></div>
      <button
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Unstar this repository" title="Unstar wocommunity/wolips"
        data-ga-click="Repository, click unstar button, action:blob#show; text:Unstar">
        <svg aria-hidden="true" class="octicon octicon-star" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path d="M14 6l-4.9-.64L7 1 4.9 5.36 0 6l3.6 3.26L2.67 14 7 11.67 11.33 14l-.93-4.74z"></path></svg>
        Unstar
      </button>
        <a class="social-count js-social-count" href="/wocommunity/wolips/stargazers">
          46
        </a>
</form>
    <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/wocommunity/wolips/star" class="unstarred" data-form-nonce="f3613d574daf1716d7dbc4038c6f6629fb02e69c" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="GLu7chQRol5n21R2D3QSV+f8lGozYFfym22+T5UR2ODvXletFfp7JovQ3B+Nso9F0AxG3sjXxgifDJnKW6Lyxw==" /></div>
      <button
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Star this repository" title="Star wocommunity/wolips"
        data-ga-click="Repository, click star button, action:blob#show; text:Star">
        <svg aria-hidden="true" class="octicon octicon-star" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path d="M14 6l-4.9-.64L7 1 4.9 5.36 0 6l3.6 3.26L2.67 14 7 11.67 11.33 14l-.93-4.74z"></path></svg>
        Star
      </button>
        <a class="social-count js-social-count" href="/wocommunity/wolips/stargazers">
          46
        </a>
</form>  </div>

  </li>

  <li>
          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/wocommunity/wolips/fork" class="btn-with-count" data-form-nonce="f3613d574daf1716d7dbc4038c6f6629fb02e69c" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="6wR00lKRCJsmJz2qlYPEdux+kiZBvz9oXeuNSn8esEf+KMgUFON8yteBP/l6Z/jP/FKIoH8BlZBMjN5kBX72VQ==" /></div>
            <button
                type="submit"
                class="btn btn-sm btn-with-count"
                data-ga-click="Repository, show fork modal, action:blob#show; text:Fork"
                title="Fork your own copy of wocommunity/wolips to your account"
                aria-label="Fork your own copy of wocommunity/wolips to your account">
              <svg aria-hidden="true" class="octicon octicon-repo-forked" height="16" version="1.1" viewBox="0 0 10 16" width="10"><path d="M8 1a1.993 1.993 0 0 0-1 3.72V6L5 8 3 6V4.72A1.993 1.993 0 0 0 2 1a1.993 1.993 0 0 0-1 3.72V6.5l3 3v1.78A1.993 1.993 0 0 0 5 15a1.993 1.993 0 0 0 1-3.72V9.5l3-3V4.72A1.993 1.993 0 0 0 8 1zM2 4.2C1.34 4.2.8 3.65.8 3c0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3 10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3-10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2z"></path></svg>
              Fork
            </button>
</form>
    <a href="/wocommunity/wolips/network" class="social-count">
      52
    </a>
  </li>
</ul>

    <h1 class="public ">
  <svg aria-hidden="true" class="octicon octicon-repo" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M4 9H3V8h1v1zm0-3H3v1h1V6zm0-2H3v1h1V4zm0-2H3v1h1V2zm8-1v12c0 .55-.45 1-1 1H6v2l-1.5-1.5L3 16v-2H1c-.55 0-1-.45-1-1V1c0-.55.45-1 1-1h10c.55 0 1 .45 1 1zm-1 10H1v2h2v-1h3v1h5v-2zm0-10H2v9h9V1z"></path></svg>
  <span class="author" itemprop="author"><a href="/wocommunity" class="url fn" rel="author">wocommunity</a></span><!--
--><span class="path-divider">/</span><!--
--><strong itemprop="name"><a href="/wocommunity/wolips" data-pjax="#js-repo-pjax-container">wolips</a></strong>

</h1>

  </div>
  <div class="container">
    
<nav class="reponav js-repo-nav js-sidenav-container-pjax"
     itemscope
     itemtype="http://schema.org/BreadcrumbList"
     role="navigation"
     data-pjax="#js-repo-pjax-container">

  <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
    <a href="/wocommunity/wolips" aria-selected="true" class="js-selected-navigation-item selected reponav-item" data-hotkey="g c" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches /wocommunity/wolips" itemprop="url">
      <svg aria-hidden="true" class="octicon octicon-code" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path d="M9.5 3L8 4.5 11.5 8 8 11.5 9.5 13 14 8 9.5 3zm-5 0L0 8l4.5 5L6 11.5 2.5 8 6 4.5 4.5 3z"></path></svg>
      <span itemprop="name">Code</span>
      <meta itemprop="position" content="1">
</a>  </span>

    <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
      <a href="/wocommunity/wolips/issues" class="js-selected-navigation-item reponav-item" data-hotkey="g i" data-selected-links="repo_issues repo_labels repo_milestones /wocommunity/wolips/issues" itemprop="url">
        <svg aria-hidden="true" class="octicon octicon-issue-opened" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path d="M7 2.3c3.14 0 5.7 2.56 5.7 5.7s-2.56 5.7-5.7 5.7A5.71 5.71 0 0 1 1.3 8c0-3.14 2.56-5.7 5.7-5.7zM7 1C3.14 1 0 4.14 0 8s3.14 7 7 7 7-3.14 7-7-3.14-7-7-7zm1 3H6v5h2V4zm0 6H6v2h2v-2z"></path></svg>
        <span itemprop="name">Issues</span>
        <span class="counter">67</span>
        <meta itemprop="position" content="2">
</a>    </span>

  <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
    <a href="/wocommunity/wolips/pulls" class="js-selected-navigation-item reponav-item" data-hotkey="g p" data-selected-links="repo_pulls /wocommunity/wolips/pulls" itemprop="url">
      <svg aria-hidden="true" class="octicon octicon-git-pull-request" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M11 11.28V5c-.03-.78-.34-1.47-.94-2.06C9.46 2.35 8.78 2.03 8 2H7V0L4 3l3 3V4h1c.27.02.48.11.69.31.21.2.3.42.31.69v6.28A1.993 1.993 0 0 0 10 15a1.993 1.993 0 0 0 1-3.72zm-1 2.92c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zM4 3c0-1.11-.89-2-2-2a1.993 1.993 0 0 0-1 3.72v6.56A1.993 1.993 0 0 0 2 15a1.993 1.993 0 0 0 1-3.72V4.72c.59-.34 1-.98 1-1.72zm-.8 10c0 .66-.55 1.2-1.2 1.2-.65 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2zM2 4.2C1.34 4.2.8 3.65.8 3c0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2z"></path></svg>
      <span itemprop="name">Pull requests</span>
      <span class="counter">0</span>
      <meta itemprop="position" content="3">
</a>  </span>

    <a href="/wocommunity/wolips/wiki" class="js-selected-navigation-item reponav-item" data-hotkey="g w" data-selected-links="repo_wiki /wocommunity/wolips/wiki">
      <svg aria-hidden="true" class="octicon octicon-book" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M3 5h4v1H3V5zm0 3h4V7H3v1zm0 2h4V9H3v1zm11-5h-4v1h4V5zm0 2h-4v1h4V7zm0 2h-4v1h4V9zm2-6v9c0 .55-.45 1-1 1H9.5l-1 1-1-1H2c-.55 0-1-.45-1-1V3c0-.55.45-1 1-1h5.5l1 1 1-1H15c.55 0 1 .45 1 1zm-8 .5L7.5 3H2v9h6V3.5zm7-.5H9.5l-.5.5V12h6V3z"></path></svg>
      Wiki
</a>

  <a href="/wocommunity/wolips/pulse" class="js-selected-navigation-item reponav-item" data-selected-links="pulse /wocommunity/wolips/pulse">
    <svg aria-hidden="true" class="octicon octicon-pulse" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path d="M11.5 8L8.8 5.4 6.6 8.5 5.5 1.6 2.38 8H0v2h3.6l.9-1.8.9 5.4L9 8.5l1.6 1.5H14V8z"></path></svg>
    Pulse
</a>
  <a href="/wocommunity/wolips/graphs" class="js-selected-navigation-item reponav-item" data-selected-links="repo_graphs repo_contributors /wocommunity/wolips/graphs">
    <svg aria-hidden="true" class="octicon octicon-graph" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M16 14v1H0V0h1v14h15zM5 13H3V8h2v5zm4 0H7V3h2v10zm4 0h-2V6h2v7z"></path></svg>
    Graphs
</a>

</nav>

  </div>
</div>

<div class="container new-discussion-timeline experiment-repo-nav">
  <div class="repository-content">

    

<a href="/wocommunity/wolips/blob/903fbe7d17f7849603e4baf568190a9444c837b9/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java" class="hidden js-permalink-shortcut" data-hotkey="y">Permalink</a>

<!-- blob contrib key: blob_contributors:v21:66d598bbcb9fe240fc619bbbb7f14c9b -->

<div class="file-navigation js-zeroclipboard-container">
  
<div class="select-menu branch-select-menu js-menu-container js-select-menu left">
  <button class="btn btn-sm select-menu-button js-menu-target css-truncate" data-hotkey="w"
    title="master"
    type="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <i>Branch:</i>
    <span class="js-select-button css-truncate-target">master</span>
  </button>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <svg aria-label="Close" class="octicon octicon-x js-menu-close" height="16" role="img" version="1.1" viewBox="0 0 12 16" width="12"><path d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"></path></svg>
        <span class="select-menu-title">Switch branches/tags</span>
      </div>

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="form-control js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" data-filter-placeholder="Filter branches/tags" class="js-select-menu-tab" role="tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" data-filter-placeholder="Find a tag…" class="js-select-menu-tab" role="tab">Tags</a>
            </li>
          </ul>
        </div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches" role="menu">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/wocommunity/wolips/blob/Eclipse_3_3/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
               data-name="Eclipse_3_3"
               data-skip-pjax="true"
               rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target js-select-menu-filter-text" title="Eclipse_3_3">
                Eclipse_3_3
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/wocommunity/wolips/blob/NewBuildPathHotness/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
               data-name="NewBuildPathHotness"
               data-skip-pjax="true"
               rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target js-select-menu-filter-text" title="NewBuildPathHotness">
                NewBuildPathHotness
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/wocommunity/wolips/blob/eclipse_3_0_0/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
               data-name="eclipse_3_0_0"
               data-skip-pjax="true"
               rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target js-select-menu-filter-text" title="eclipse_3_0_0">
                eclipse_3_0_0
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/wocommunity/wolips/blob/eclipse_3_6_stable/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
               data-name="eclipse_3_6_stable"
               data-skip-pjax="true"
               rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target js-select-menu-filter-text" title="eclipse_3_6_stable">
                eclipse_3_6_stable
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/wocommunity/wolips/blob/eclipse_3_6/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
               data-name="eclipse_3_6"
               data-skip-pjax="true"
               rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target js-select-menu-filter-text" title="eclipse_3_6">
                eclipse_3_6
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/wocommunity/wolips/blob/eclipse_3_7/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
               data-name="eclipse_3_7"
               data-skip-pjax="true"
               rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target js-select-menu-filter-text" title="eclipse_3_7">
                eclipse_3_7
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/wocommunity/wolips/blob/eclipse_3_8/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
               data-name="eclipse_3_8"
               data-skip-pjax="true"
               rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target js-select-menu-filter-text" title="eclipse_3_8">
                eclipse_3_8
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/wocommunity/wolips/blob/eclipse_4_2/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
               data-name="eclipse_4_2"
               data-skip-pjax="true"
               rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target js-select-menu-filter-text" title="eclipse_4_2">
                eclipse_4_2
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/wocommunity/wolips/blob/integration/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
               data-name="integration"
               data-skip-pjax="true"
               rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target js-select-menu-filter-text" title="integration">
                integration
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open selected"
               href="/wocommunity/wolips/blob/master/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
               data-name="master"
               data-skip-pjax="true"
               rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target js-select-menu-filter-text" title="master">
                master
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/wocommunity/wolips/blob/woenvironment-2.0.15.x/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
               data-name="woenvironment-2.0.15.x"
               data-skip-pjax="true"
               rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target js-select-menu-filter-text" title="woenvironment-2.0.15.x">
                woenvironment-2.0.15.x
              </span>
            </a>
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject_wolips_1_0_5/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject_wolips_1_0_5"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject_wolips_1_0_5">
                woproject_wolips_1_0_5
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject_wolips_1_0_2/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject_wolips_1_0_2"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject_wolips_1_0_2">
                woproject_wolips_1_0_2
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject_before_change_of_properties_handling/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject_before_change_of_properties_handling"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject_before_change_of_properties_handling">
                woproject_before_change_of_properties_handling
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.1%405896/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.1@5896"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.1@5896">
                woproject-all-parent-2.1@5896
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.1%405893/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.1@5893"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.1@5893">
                woproject-all-parent-2.1@5893
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.1%403744/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.1@3744"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.1@3744">
                woproject-all-parent-2.1@3744
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.1/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.1"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.1">
                woproject-all-parent-2.1
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.1-old/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.1-old"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.1-old">
                woproject-all-parent-2.1-old
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.17-non-recursive%405730/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.17-non-recursive@5730"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.17-non-recursive@5730">
                woproject-all-parent-2.0.17-non-recursive@5730
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.17-non-recursive/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.17-non-recursive"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.17-non-recursive">
                woproject-all-parent-2.0.17-non-recursive
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.16%405517/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.16@5517"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.16@5517">
                woproject-all-parent-2.0.16@5517
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.16%405507/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.16@5507"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.16@5507">
                woproject-all-parent-2.0.16@5507
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.16%405503/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.16@5503"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.16@5503">
                woproject-all-parent-2.0.16@5503
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.16/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.16"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.16">
                woproject-all-parent-2.0.16
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.15%405276/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.15@5276"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.15@5276">
                woproject-all-parent-2.0.15@5276
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.15/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.15"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.15">
                woproject-all-parent-2.0.15
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.14%405151/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.14@5151"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.14@5151">
                woproject-all-parent-2.0.14@5151
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.14/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.14"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.14">
                woproject-all-parent-2.0.14
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.13%404940/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.13@4940"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.13@4940">
                woproject-all-parent-2.0.13@4940
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.13/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.13"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.13">
                woproject-all-parent-2.0.13
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.12%404940/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.12@4940"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.12@4940">
                woproject-all-parent-2.0.12@4940
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.12/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.12"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.12">
                woproject-all-parent-2.0.12
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.10%404655/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.10@4655"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.10@4655">
                woproject-all-parent-2.0.10@4655
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.10/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.10"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.10">
                woproject-all-parent-2.0.10
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.9%404313/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.9@4313"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.9@4313">
                woproject-all-parent-2.0.9@4313
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.9/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.9"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.9">
                woproject-all-parent-2.0.9
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.8%404313/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.8@4313"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.8@4313">
                woproject-all-parent-2.0.8@4313
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.8/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.8"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.8">
                woproject-all-parent-2.0.8
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.7%404149/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.7@4149"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.7@4149">
                woproject-all-parent-2.0.7@4149
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.7/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.7"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.7">
                woproject-all-parent-2.0.7
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.6%404043/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.6@4043"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.6@4043">
                woproject-all-parent-2.0.6@4043
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.6/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.6"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.6">
                woproject-all-parent-2.0.6
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.5%403855/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.5@3855"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.5@3855">
                woproject-all-parent-2.0.5@3855
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.5/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.5"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.5">
                woproject-all-parent-2.0.5
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.4%403836/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.4@3836"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.4@3836">
                woproject-all-parent-2.0.4@3836
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.4/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.4"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.4">
                woproject-all-parent-2.0.4
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.3%403805/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.3@3805"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.3@3805">
                woproject-all-parent-2.0.3@3805
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.3/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.3"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.3">
                woproject-all-parent-2.0.3
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.2%403802/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.2@3802"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.2@3802">
                woproject-all-parent-2.0.2@3802
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.2/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.2"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.2">
                woproject-all-parent-2.0.2
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.1%403774/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.1@3774"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.1@3774">
                woproject-all-parent-2.0.1@3774
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.1/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.1"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.1">
                woproject-all-parent-2.0.1
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.0%403744/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.0@3744"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.0@3744">
                woproject-all-parent-2.0.0@3744
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-all-parent-2.0.0/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-all-parent-2.0.0"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-all-parent-2.0.0">
                woproject-all-parent-2.0.0
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woproject-1-0b/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woproject-1-0b"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woproject-1-0b">
                woproject-1-0b
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/wolips_1_0_0_rc1/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="wolips_1_0_0_rc1"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="wolips_1_0_0_rc1">
                wolips_1_0_0_rc1
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/wolips_1_0_0_final/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="wolips_1_0_0_final"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="wolips_1_0_0_final">
                wolips_1_0_0_final
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/wolips_1_0_0_RC3/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="wolips_1_0_0_RC3"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="wolips_1_0_0_RC3">
                wolips_1_0_0_RC3
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/wolips_0_9_9/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="wolips_0_9_9"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="wolips_0_9_9">
                wolips_0_9_9
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/wolips_0_9_6/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="wolips_0_9_6"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="wolips_0_9_6">
                wolips_0_9_6
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/wolips_0_9_4/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="wolips_0_9_4"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="wolips_0_9_4">
                wolips_0_9_4
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/wolips_0_9_2/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="wolips_0_9_2"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="wolips_0_9_2">
                wolips_0_9_2
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/woenvironment-2.0.15.1/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="woenvironment-2.0.15.1"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="woenvironment-2.0.15.1">
                woenvironment-2.0.15.1
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_115/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_115"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_115">
                v2_0_0_115
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_114/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_114"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_114">
                v2_0_0_114
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_113/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_113"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_113">
                v2_0_0_113
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_111/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_111"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_111">
                v2_0_0_111
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_109/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_109"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_109">
                v2_0_0_109
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_108/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_108"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_108">
                v2_0_0_108
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_107/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_107"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_107">
                v2_0_0_107
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_106/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_106"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_106">
                v2_0_0_106
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_104/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_104"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_104">
                v2_0_0_104
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_103/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_103"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_103">
                v2_0_0_103
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_102/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_102"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_102">
                v2_0_0_102
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_91/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_91"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_91">
                v2_0_0_91
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_90/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_90"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_90">
                v2_0_0_90
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_89/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_89"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_89">
                v2_0_0_89
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_88/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_88"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_88">
                v2_0_0_88
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_87/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_87"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_87">
                v2_0_0_87
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_85/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_85"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_85">
                v2_0_0_85
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_83/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_83"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_83">
                v2_0_0_83
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_82/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_82"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_82">
                v2_0_0_82
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_81/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_81"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_81">
                v2_0_0_81
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_80/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_80"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_80">
                v2_0_0_80
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_79/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_79"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_79">
                v2_0_0_79
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_78/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_78"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_78">
                v2_0_0_78
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_77/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_77"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_77">
                v2_0_0_77
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_76/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_76"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_76">
                v2_0_0_76
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_75/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_75"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_75">
                v2_0_0_75
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_74/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_74"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_74">
                v2_0_0_74
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_73/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_73"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_73">
                v2_0_0_73
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_72/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_72"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_72">
                v2_0_0_72
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_71/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_71"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_71">
                v2_0_0_71
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_70/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_70"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_70">
                v2_0_0_70
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_69/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_69"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_69">
                v2_0_0_69
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_68/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_68"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_68">
                v2_0_0_68
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_67/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_67"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_67">
                v2_0_0_67
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_66/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_66"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_66">
                v2_0_0_66
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_65/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_65"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_65">
                v2_0_0_65
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_63/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_63"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_63">
                v2_0_0_63
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_62/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_62"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_62">
                v2_0_0_62
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_61/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_61"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_61">
                v2_0_0_61
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_58/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_58"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_58">
                v2_0_0_58
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_57/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_57"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_57">
                v2_0_0_57
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_56/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_56"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_56">
                v2_0_0_56
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_55/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_55"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_55">
                v2_0_0_55
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_54/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_54"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_54">
                v2_0_0_54
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_53/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_53"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_53">
                v2_0_0_53
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_52/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_52"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_52">
                v2_0_0_52
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/wocommunity/wolips/tree/v2_0_0_51/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java"
              data-name="v2_0_0_51"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"></path></svg>
              <span class="select-menu-item-text css-truncate-target" title="v2_0_0_51">
                v2_0_0_51
              </span>
            </a>
        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div>

    </div>
  </div>
</div>

  <div class="btn-group right">
    <a href="/wocommunity/wolips/find/master"
          class="js-pjax-capture-input btn btn-sm"
          data-pjax
          data-hotkey="t">
      Find file
    </a>
    <button aria-label="Copy file path to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button">Copy path</button>
  </div>
  <div class="breadcrumb js-zeroclipboard-target">
    <span class="repo-root js-repo-root"><span class="js-path-segment"><a href="/wocommunity/wolips"><span>wolips</span></a></span></span><span class="separator">/</span><span class="js-path-segment"><a href="/wocommunity/wolips/tree/master/wolips"><span>wolips</span></a></span><span class="separator">/</span><span class="js-path-segment"><a href="/wocommunity/wolips/tree/master/wolips/core"><span>core</span></a></span><span class="separator">/</span><span class="js-path-segment"><a href="/wocommunity/wolips/tree/master/wolips/core/plugins"><span>plugins</span></a></span><span class="separator">/</span><span class="js-path-segment"><a href="/wocommunity/wolips/tree/master/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core"><span>org.objectstyle.wolips.eogenerator.core</span></a></span><span class="separator">/</span><span class="js-path-segment"><a href="/wocommunity/wolips/tree/master/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates"><span>templates</span></a></span><span class="separator">/</span><strong class="final-path">Entity.java</strong>
  </div>
</div>


  <div class="commit-tease">
      <span class="right">
        <a class="commit-tease-sha" href="/wocommunity/wolips/commit/b71735fb42bf765c44b7b7516eec369b567ad730" data-pjax>
          b71735f
        </a>
        <relative-time datetime="2007-12-04T23:39:49Z">Dec 4, 2007</relative-time>
      </span>
      <div>
        <img alt="" class="avatar" height="20" src="https://2.gravatar.com/avatar/227d1d49b889f1b32836cf93e7b98a34?d=https%3A%2F%2Fassets-cdn.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png&amp;r=x&amp;s=140" width="20" />
        <span class="user-mention">mschrag</span>
          <a href="/wocommunity/wolips/commit/b71735fb42bf765c44b7b7516eec369b567ad730" class="message" data-pjax="true" title="* EOGenerator dialog only appears if it has something important to say (i.e. failure message), even if triggered by EOGenerate ... action
* VelEOGen: New support for defining an additional subpackage for superclass templates (like &quot;base&quot;) -- less confusing than filename template
* VelEOGen: Automatic template search path that includes ~/Library/Application Support/WOLips/EOGenerator, /Library/Application Support/WOLips/EOGenerator, etc
* VelEOGen: Support for overriding the template name while not overriding the template path (previously if you had a blank template path, it would skip the template name)

git-svn-id: https://svn.objectstyle.org/repos/woproject/trunk@4709 930f2ab1-3212-0410-a8ea-d1eb4cc50a93">* EOGenerator dialog only appears if it has something important to sa…</a>
      </div>

    <div class="commit-tease-contributors">
      <button type="button" class="btn-link muted-link contributors-toggle" data-facebox="#blob_contributors_box">
        <strong>0</strong>
         contributors
      </button>
      
    </div>

    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header" data-facebox-id="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list" data-facebox-id="facebox-description">
      </ul>
    </div>
  </div>

<div class="file">
  <div class="file-header">
  <div class="file-actions">

    <div class="btn-group">
      <a href="/wocommunity/wolips/raw/master/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java" class="btn btn-sm " id="raw-url">Raw</a>
        <a href="/wocommunity/wolips/blame/master/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java" class="btn btn-sm js-update-url-with-hash">Blame</a>
      <a href="/wocommunity/wolips/commits/master/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java" class="btn btn-sm " rel="nofollow">History</a>
    </div>

        <a class="btn-octicon tooltipped tooltipped-nw"
           href="github-mac://openRepo/https://github.com/wocommunity/wolips?branch=master&amp;filepath=wolips%2Fcore%2Fplugins%2Forg.objectstyle.wolips.eogenerator.core%2Ftemplates%2FEntity.java"
           aria-label="Open this file in GitHub Desktop"
           data-ga-click="Repository, open with desktop, type:mac">
            <svg aria-hidden="true" class="octicon octicon-device-desktop" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M15 2H1c-.55 0-1 .45-1 1v9c0 .55.45 1 1 1h5.34c-.25.61-.86 1.39-2.34 2h8c-1.48-.61-2.09-1.39-2.34-2H15c.55 0 1-.45 1-1V3c0-.55-.45-1-1-1zm0 9H1V3h14v8z"></path></svg>
        </a>

        <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/wocommunity/wolips/edit/master/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java" class="inline-form js-update-url-with-hash" data-form-nonce="f3613d574daf1716d7dbc4038c6f6629fb02e69c" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="DHliQeBrulNPVsCgr4Kpu0hjpnay1VAYhqwzLMsjfpdOUZCTLp2woQl+90LooNlKNBIjgPydhUQ9I4fnoLgmfg==" /></div>
          <button class="btn-octicon tooltipped tooltipped-nw" type="submit"
            aria-label="Edit the file in your fork of this project" data-hotkey="e" data-disable-with>
            <svg aria-hidden="true" class="octicon octicon-pencil" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path d="M0 12v3h3l8-8-3-3-8 8zm3 2H1v-2h1v1h1v1zm10.3-9.3L12 6 9 3l1.3-1.3a.996.996 0 0 1 1.41 0l1.59 1.59c.39.39.39 1.02 0 1.41z"></path></svg>
          </button>
</form>        <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/wocommunity/wolips/delete/master/wolips/core/plugins/org.objectstyle.wolips.eogenerator.core/templates/Entity.java" class="inline-form" data-form-nonce="f3613d574daf1716d7dbc4038c6f6629fb02e69c" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="BRUCHphTDKxKcJVOp3nPQgbbVy1kM4sk9xR7ftTGL9N+RxaKi4KY/okcErbeDQjU4+N9hGaJt5qtZbL15wfOLg==" /></div>
          <button class="btn-octicon btn-octicon-danger tooltipped tooltipped-nw" type="submit"
            aria-label="Delete the file in your fork of this project" data-disable-with>
            <svg aria-hidden="true" class="octicon octicon-trashcan" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M11 2H9c0-.55-.45-1-1-1H5c-.55 0-1 .45-1 1H2c-.55 0-1 .45-1 1v1c0 .55.45 1 1 1v9c0 .55.45 1 1 1h7c.55 0 1-.45 1-1V5c.55 0 1-.45 1-1V3c0-.55-.45-1-1-1zm-1 12H3V5h1v8h1V5h1v8h1V5h1v8h1V5h1v9zm1-10H2V3h9v1z"></path></svg>
          </button>
</form>  </div>

  <div class="file-info">
      10 lines (7 sloc)
      <span class="file-info-divider"></span>
    287 Bytes
  </div>
</div>

  

  <div itemprop="text" class="blob-wrapper data type-java">
      <table class="highlight tab-size js-file-line-container" data-tab-size="8">
      <tr>
        <td id="L1" class="blob-num js-line-number" data-line-number="1"></td>
        <td id="LC1" class="blob-code blob-code-inner js-file-line">#<span class="pl-k">if</span> ($entity<span class="pl-k">.</span>packageName)</td>
      </tr>
      <tr>
        <td id="L2" class="blob-num js-line-number" data-line-number="2"></td>
        <td id="LC2" class="blob-code blob-code-inner js-file-line"><span class="pl-k">package</span> $entity<span class="pl-k">.</span>packageName;</td>
      </tr>
      <tr>
        <td id="L3" class="blob-num js-line-number" data-line-number="3"></td>
        <td id="LC3" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L4" class="blob-num js-line-number" data-line-number="4"></td>
        <td id="LC4" class="blob-code blob-code-inner js-file-line">#end</td>
      </tr>
      <tr>
        <td id="L5" class="blob-num js-line-number" data-line-number="5"></td>
        <td id="LC5" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">org.apache.log4j.Logger</span>;</td>
      </tr>
      <tr>
        <td id="L6" class="blob-num js-line-number" data-line-number="6"></td>
        <td id="LC6" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L7" class="blob-num js-line-number" data-line-number="7"></td>
        <td id="LC7" class="blob-code blob-code-inner js-file-line"><span class="pl-k">public</span> class ${entity<span class="pl-k">.</span>classNameWithoutPackage} extends ${entity<span class="pl-k">.</span>prefixClassNameWithOptionalPackage} {</td>
      </tr>
      <tr>
        <td id="L8" class="blob-num js-line-number" data-line-number="8"></td>
        <td id="LC8" class="blob-code blob-code-inner js-file-line">  <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-smi">Logger</span> log <span class="pl-k">=</span> <span class="pl-smi">Logger</span><span class="pl-k">.</span>getLogger(${entity<span class="pl-k">.</span>classNameWithoutPackage}<span class="pl-k">.</span>class);</td>
      </tr>
      <tr>
        <td id="L9" class="blob-num js-line-number" data-line-number="9"></td>
        <td id="LC9" class="blob-code blob-code-inner js-file-line">}</td>
      </tr>
</table>

  </div>

</div>

<button type="button" data-facebox="#jump-to-line" data-facebox-class="linejump" data-hotkey="l" class="hidden">Jump to Line</button>
<div id="jump-to-line" style="display:none">
  <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="" class="js-jump-to-line-form" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
    <input class="form-control linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" aria-label="Jump to line" autofocus>
    <button type="submit" class="btn">Go</button>
</form></div>

  </div>
  <div class="modal-backdrop"></div>
</div>


    </div>
  </div>

    </div>

        <div class="container site-footer-container">
  <div class="site-footer" role="contentinfo">
    <ul class="site-footer-links right">
        <li><a href="https://status.github.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
      <li><a href="https://developer.github.com" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li><a href="https://training.github.com" data-ga-click="Footer, go to training, text:training">Training</a></li>
      <li><a href="https://shop.github.com" data-ga-click="Footer, go to shop, text:shop">Shop</a></li>
        <li><a href="https://github.com/blog" data-ga-click="Footer, go to blog, text:blog">Blog</a></li>
        <li><a href="https://github.com/about" data-ga-click="Footer, go to about, text:about">About</a></li>

    </ul>

    <a href="https://github.com" aria-label="Homepage" class="site-footer-mark" title="GitHub">
      <svg aria-hidden="true" class="octicon octicon-mark-github" height="24" version="1.1" viewBox="0 0 16 16" width="24"><path d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z"></path></svg>
</a>
    <ul class="site-footer-links">
      <li>&copy; 2016 <span title="0.12508s from github-fe143-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="https://github.com/site/terms" data-ga-click="Footer, go to terms, text:terms">Terms</a></li>
        <li><a href="https://github.com/site/privacy" data-ga-click="Footer, go to privacy, text:privacy">Privacy</a></li>
        <li><a href="https://github.com/security" data-ga-click="Footer, go to security, text:security">Security</a></li>
        <li><a href="https://github.com/contact" data-ga-click="Footer, go to contact, text:contact">Contact</a></li>
        <li><a href="https://help.github.com" data-ga-click="Footer, go to help, text:help">Help</a></li>
    </ul>
  </div>
</div>



    

    <div id="ajax-error-message" class="ajax-error-message flash flash-error">
      <svg aria-hidden="true" class="octicon octicon-alert" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M8.865 1.52c-.18-.31-.51-.5-.87-.5s-.69.19-.87.5L.275 13.5c-.18.31-.18.69 0 1 .19.31.52.5.87.5h13.7c.36 0 .69-.19.86-.5.17-.31.18-.69.01-1L8.865 1.52zM8.995 13h-2v-2h2v2zm0-3h-2V6h2v4z"></path></svg>
      <button type="button" class="flash-close js-flash-close js-ajax-error-dismiss" aria-label="Dismiss error">
        <svg aria-hidden="true" class="octicon octicon-x" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"></path></svg>
      </button>
      Something went wrong with that request. Please try again.
    </div>


      
      <script crossorigin="anonymous" integrity="sha256-cWK+6icqhW0G4ISUX9gCake7uefrKV2Vtg6oKybCcpY=" src="https://assets-cdn.github.com/assets/frameworks-7162beea272a856d06e084945fd8026a47bbb9e7eb295d95b60ea82b26c27296.js"></script>
      <script async="async" crossorigin="anonymous" integrity="sha256-+L61ExG6ALK0mIYgN/ng+TDW75SOlL2ke6QNaGdWxcE=" src="https://assets-cdn.github.com/assets/github-f8beb51311ba00b2b498862037f9e0f930d6ef948e94bda47ba40d686756c5c1.js"></script>
      
      
      
      
      
      
    <div class="js-stale-session-flash stale-session-flash flash flash-warn flash-banner hidden">
      <svg aria-hidden="true" class="octicon octicon-alert" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path d="M8.865 1.52c-.18-.31-.51-.5-.87-.5s-.69.19-.87.5L.275 13.5c-.18.31-.18.69 0 1 .19.31.52.5.87.5h13.7c.36 0 .69-.19.86-.5.17-.31.18-.69.01-1L8.865 1.52zM8.995 13h-2v-2h2v2zm0-3h-2V6h2v4z"></path></svg>
      <span class="signed-in-tab-flash">You signed in with another tab or window. <a href="">Reload</a> to refresh your session.</span>
      <span class="signed-out-tab-flash">You signed out in another tab or window. <a href="">Reload</a> to refresh your session.</span>
    </div>
    <div class="facebox" id="facebox" style="display:none;">
  <div class="facebox-popup">
    <div class="facebox-content" role="dialog" aria-labelledby="facebox-header" aria-describedby="facebox-description">
    </div>
    <button type="button" class="facebox-close js-facebox-close" aria-label="Close modal">
      <svg aria-hidden="true" class="octicon octicon-x" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"></path></svg>
    </button>
  </div>
</div>

  </body>
</html>

