<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>欢迎您^_^</title>

    <!-- for-mobile-apps -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content=""/>
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);
    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
    <!-- //for-mobile-apps -->
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all"/>
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <link href="css/font-awesome.css" rel="stylesheet">

    <!--web-fonts-->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Lato:300,400,700" rel="stylesheet">
    <!--//web-fonts-->
    <!--//fonts-->
    <!-- js -->
    <!-- myFocus -->
    <script type="text/javascript" src="js/myfocus-2.0.1.min.js"></script>
    <style type="text/css">
        #myFocus {
            width: 100%;
            height: 40%;
        }
    </style>
    <script type="text/javascript">
        //设置
        myFocus.set({
            id: 'myFocus',//ID
            pattern: 'mF_fancy',//风格
            time: 3,//切换时间间隔(秒)
            loadIMGTimeout: 0
        });
    </script>
</head>
<body>
<!-- banner -->

<div id="home">
    <!-- header -->
    <header>
        <div class="container">

            <!-- navigation -->
            <nav class="navbar navbar-default">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">

                    <div class="w3-logo">
                        <div style="position: relative;float: left;margin-top: -10px">
                            <img width="80px" src="http://192.168.1.101:8080/image/swu.png">
                        </div>
                        <div style="position: relative;float: left;margin-left: 16px">
                            <h1><a href="index.jsp">物联智能创新中心</a></h1>
                        </div>
                    </div>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a class="active" href="index.jsp"><B>主页</B></a></li>
                        <li><a href="news.jsp"><B>中心动态</B></a></li>
                        <li><a href="gallery"><B>生活风采</B></a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                               aria-haspopup="true" aria-expanded="false"><B>中心概况</B><span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="team.jsp"><B>团队建设</B></a></li>
                                <li><a href="projects.jsp"><B>科研项目</B></a></li>
                            </ul>
                        </li>
                        <li><a href="contact.jsp"><B>联系我们</B></a></li>
                    </ul>
                    <%-- <div class="subscribe">
                        <form>
                            <input type="search" class="sub-email" name="Search" required="">
                            <input type="submit"  value="">
                        </form>
                    </div>--%>
                </div><!-- /.navbar-collapse -->

            </nav>
            <div class="clearfix"></div>
            <!-- //navigation -->
        </div>
    </header>
    <!-- //header -->
    <!-- banner-text -->
</div>
<div id="myFocus">
    <div class="pic">
        <ul>
            <li><img src="http://computer.swu.edu.cn/r/cms/computer/computer/images/news/public/banner1.jpg"/></li>
            <li><img src="http://computer.swu.edu.cn/u/cms/computer/201612/29104440m6ln_DSC_3115-1.jpg"/></li>
            <li><img src="http://computer.swu.edu.cn/u/cms/computer/201612/29095814caqy_%E5%9B%BE%E7%89%874.jpg"/></li>
            <li><img src="http://computer.swu.edu.cn/u/cms/computer/201612/29100016xxdt_%E5%9B%BE%E7%89%872.jpg"/></li>
        </ul>
    </div>
</div>

<!-- //banner -->
<!--service-section-->
<div class="services-w3layouts" id="services">
    <div class="container">
        <div class="head-top-w3ls"><i class="fa fa-graduation-cap" aria-hidden="true"></i></div>
        <h5 class="title-w3">Services</h5>
        <div class="w3-agileits-our-advantages-grids">
            <div class="col-md-4 w3layouts-our-advantages-grid">
                <div class="col-xs-3 w3l-our-advantages-grd-left">
                    <i class="fa fa-flask" aria-hidden="true"></i>
                </div>
                <div class="col-xs-9 w3l-our-advantages-grd-right">
                    <h4>车联网</h4>
                    <p>Vel illum qui dolorem eum fugiat quo voluptas
                        nulla pariatur eum iure reprehenderit.</p>
                    <a href="single.html" data-toggle="modal" data-target="#myModal1">More details<span
                            class="glyphicon glyphicon glyphicon-arrow-right" aria-hidden="true"></span></a>

                </div>
                <div class="clearfix"></div>
            </div>
            <div class="col-md-4 w3layouts-our-advantages-grid">
                <div class="col-xs-3 w3l-our-advantages-grd-left">
                    <i class="fa fa-graduation-cap" aria-hidden="true"></i>
                </div>
                <div class="col-xs-9 w3l-our-advantages-grd-right">
                    <h4>手持终端</h4>
                    <p>Vel illum qui dolorem eum fugiat quo voluptas
                        nulla pariatur eum iure reprehenderit.</p>
                    <a href="single.html" data-toggle="modal" data-target="#myModal1">More details<span
                            class="glyphicon glyphicon glyphicon-arrow-right" aria-hidden="true"></span></a>
                </div>
                <div class="clearfix"></div>
            </div>
            <div class="col-md-4 w3layouts-our-advantages-grid">
                <div class="col-xs-3 w3l-our-advantages-grd-left">
                    <i class="fa fa-pencil" aria-hidden="true"></i>
                </div>
                <div class="col-xs-9 w3l-our-advantages-grd-right">
                    <h4>智能家居</h4>
                    <p>Vel illum qui dolorem eum fugiat quo voluptas
                        nulla pariatur eum iure reprehenderit.</p>
                    <a href="single.html" data-toggle="modal" data-target="#myModal1">More details<span
                            class="glyphicon glyphicon glyphicon-arrow-right" aria-hidden="true"></span></a>
                </div>
                <div class="clearfix"></div>
            </div>
            <div class="col-md-4 w3layouts-our-advantages-grid">
                <div class="col-xs-3 w3l-our-advantages-grd-left">
                    <i class="fa fa-cutlery" aria-hidden="true"></i>
                </div>
                <div class="col-xs-9 w3l-our-advantages-grd-right">
                    <h4>智能医疗</h4>
                    <p>Vel illum qui dolorem eum fugiat quo voluptas
                        nulla pariatur eum iure reprehenderit.</p>
                    <a href="single.html" data-toggle="modal" data-target="#myModal1">More details<span
                            class="glyphicon glyphicon glyphicon-arrow-right" aria-hidden="true"></span></a>
                </div>
                <div class="clearfix"></div>
            </div>
            <div class="col-md-4 w3layouts-our-advantages-grid">
                <div class="col-xs-3 w3l-our-advantages-grd-left">
                    <i class="fa fa-book" aria-hidden="true"></i>
                </div>
                <div class="col-xs-9 w3l-our-advantages-grd-right">
                    <h4>自动驾驶</h4>
                    <p>Vel illum qui dolorem eum fugiat quo voluptas
                        nulla pariatur eum iure reprehenderit.</p>
                    <a href="single.html" data-toggle="modal" data-target="#myModal1">More details<span
                            class="glyphicon glyphicon glyphicon-arrow-right" aria-hidden="true"></span></a>
                </div>
                <div class="clearfix"></div>
            </div>
            <div class="col-md-4 w3layouts-our-advantages-grid">
                <div class="col-xs-3 w3l-our-advantages-grd-left">
                    <i class="fa fa-bar-chart" aria-hidden="true"></i>
                </div>
                <div class="col-xs-9 w3l-our-advantages-grd-right">
                    <h4>机械人助理</h4>
                    <p>Vel illum qui dolorem eum fugiat quo voluptas
                        nulla pariatur eum iure reprehenderit.</p>
                    <a href="single.html" data-toggle="modal" data-target="#myModal1">More details<span
                            class="glyphicon glyphicon glyphicon-arrow-right" aria-hidden="true"></span></a>
                </div>
                <div class="clearfix"></div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <div class="clearfix"></div>
</div>
<!--//service-section-->
<!--/reviews-->
<div id="review" class="reviews">
    <div class="container">
        <div class="head-top-w3ls"><i class="fa fa-graduation-cap white" aria-hidden="true"></i></div>
        <h5 class="title-w3 head">Testimonials</h5>
        <div class="callbacks_container test-agile">
            <ul class="rslides" id="slider1">
                <li>

                    <div class="test-monials">
                        <p>Polite sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna
                            aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum
                            stet clita kasd gubergren.</p>
                        <h4>Mathew</h4>
                    </div>
                </li>
                <li>

                    <div class="test-monials">
                        <p>Pellentesque euismod augue quis metus interdum hendrerit. Proin at interdum leo. Sed
                            vestibulum, urna vel tristique aliquet, tellus et rebum turpis cursus justo, ac sodales
                            turpis metus nec sem et ea rebum. </p>
                        <h4>Williams Allen</h4>
                    </div>
                </li>
                <li>

                    <div class="test-monials">
                        <p>Etiam ultrices auctor ipsum sit amet porta. Pellentesque consectetur vitae elit at venenatis.
                            Vestibulum dui purus, pellentesque sit amet ornare vel, dapibus ut massa. Curabitur et
                            accusam nec lorem odio, </p>
                        <h4>John Paul</h4>
                    </div>
                </li>

            </ul>

        </div>
        <div class="clearfix"></div>

    </div>
</div>
<!--//reviews-->

<div class="modal fade" id="myModal1" tabindex="-1" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4>Educative</h4>
                <img src="images/middle.jpg" alt=" " class="img-responsive">
                <h5>Lorem ipsum dolor sit amet</h5>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the
                    industry's standard dummy text ever since the 1500s, rds which don't look even slightly believable.
                    If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything
                    embarrassing hidden in the middle of text.</p>
            </div>
        </div>
    </div>
</div>
<!-- //Modal1 -->
<!-- //mid -->

<!--sign-up-section-->
<div class="signup" id="signup">
    <div class="container">
        <div class="head-top-w3ls"><i class="fa fa-graduation-cap" aria-hidden="true"></i></div>
        <h5 class="title-w3">Play, Explore and Learn.</h5>
        <p>Find out how to get involved in programs of students include world-class curriculum and knowledgeable child
            development professionals that meet the needs of children at every age and stage.</p>
        <div class="button2">
            <h5><a href="#" data-toggle="modal" data-target="#myModal2">Admission Now</a></h5>
        </div>
    </div>
    <!-- Modal1 -->
    <div class="modal fade" id="myModal2" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <!-- Modal content-->
            <div class="modal-content abt-w3l">
                <div class="modal-header">
                    <button type="button" class="close clo1" data-dismiss="modal">&times;</button>
                    <h4>Register</h4>
                    <form action="#" method="post" class="mod2">
                        <ul>
                            <li class="text">Name :</li>
                            <li class="agileits-main"><input name="name" type="text" required></li>
                        </ul>
                        <ul>
                            <li class="text">Gender :</li>
                            <li class="agileits-main"><input name="Gender" type="text" required></li>
                        </ul>
                        <ul>
                            <li class="text">Father Name :</li>
                            <li class="agileits-main"><input name="Father name" type="text" required></li>
                        </ul>
                        <ul>
                            <li class="text">mobile no :</li>
                            <li class="agileits-main"><input name="mobile" type="text" required></li>
                        </ul>
                        <ul>
                            <li class="text">Email :</li>
                            <li class="agileits-main"><input name="E-mail" type="email" required></li>
                        </ul>
                        <ul>
                            <li class="text">Password :</li>
                            <li class="agileits-main"><input name="Password" type="password" required></li>
                        </ul>
                        <ul>
                            <li class="text">Confirm Password :</li>
                            <li class="agileits-main"><input name="Confirm Password" type="password" required></li>
                        </ul>
                        <div class="clear"></div>
                        <div class="agile-submit">
                            <input type="submit" value="submit">
                        </div>
                    </form>

                </div>
            </div>
        </div>
    </div>
    <!-- //Modal1 -->
</div>
<!--//sign-up-section-->

<!-- Footer -->
<div class="copyright-wthree">
    <p>Copyright &copy; 2017.Company name All rights reserved.<a target="_blank"></a></p>
</div>
<!-- //Footer -->

<a href="#home" class="scroll" id="toTop" style="display: block;"> <span id="toTopHover"
                                                                         style="opacity: 1;"> </span></a>
<!-- //smooth scrolling -->


<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<script src="js/responsiveslides.min.js"></script>
<script>
    // You can also use "$(window).load(function() {"
    $(function () {
        // Slideshow 4
        $("#slider3").responsiveSlides({
            auto: true,
            pager: true,
            nav: false,
            speed: 500,
            namespace: "callbacks",
            before: function () {
                $('.events').append("<li>before event fired.</li>");
            },
            after: function () {
                $('.events').append("<li>after event fired.</li>");
            }
        });

    });
</script>


<script>
    // You can also use "$(window).load(function() {"
    $(function () {
        // Slideshow 4
        $("#slider1").responsiveSlides({
            auto: true,
            pager: false,
            nav: true,
            speed: 500,
            namespace: "callbacks",
            before: function () {
                $('.events').append("<li>before event fired.</li>");
            },
            after: function () {
                $('.events').append("<li>after event fired.</li>");
            }
        });

    });
</script>

<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
    jQuery(document).ready(function ($) {
        $(".scroll").click(function (event) {
            event.preventDefault();
            $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
        });
    });
</script>
<!-- start-smoth-scrolling -->
<!-- here stars scrolling icon -->
<script type="text/javascript">
    $(document).ready(function () {
        /*
         var defaults = {
         containerID: 'toTop', // fading element id
         containerHoverID: 'toTopHover', // fading element hover id
         scrollSpeed: 1200,
         easingType: 'linear'
         };
         */

        $().UItoTop({easingType: 'easeOutQuart'});

    });
</script>
<!-- //here ends scrolling icon -->
<!--js for bootstrap working-->
<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->


<!-- script-for-menu -->
<script>
    $("span.menu").click(function () {
        $(".top-nav ul").slideToggle("slow", function () {
        });
    });
</script>
<!-- script-for-menu -->

</body>
</html>