<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Gallery</title>
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
</head>
<body>
<!-- banner -->
<div class="banner about-banner-w3ls " id="home">
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
                        <li><a href="index.jsp"><B>主页</B></a></li>
                        <li><a href="news.jsp"><B>中心动态</B></a></li>
                        <li><a class="active" href="gallery"><B>生活风采</B></a></li>
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
    <h2> 我们的风采</h2>
</div>
<!-- //banner -->

<!--gallery-->
<div id="gallery gal-page-agileits-w3layouts" class="welcome gallery">
    <div class="container">
        <div class="gallery-info">
            <div class="col-md-6 gallery-grids glry-grid1">
                <div class="gallery-grids-top">
                    <a href="#portfolioModal1" class="b-link-stripe b-animate-go wow zoomIn animated"
                       data-wow-delay=".5s" data-toggle="modal">
                        <%--<img src="http://192.168.1.101:8080/image/heart5.jpg" class="img-responsive" alt=""/>--%>
                        <img src="${photoDtos[0].pUrl}" class="img-responsive" alt=""/>
                        <div class="b-wrapper">
								<span class="b-animate b-from-left">
									<img class="img-responsive" src="images/search.png" alt=""/>
								</span>
                        </div>
                    </a>
                </div>
                <div class="gallery-grids-top">
                    <div class="col-md-6 bottom-grids">
                        <a href="#portfolioModal2" class="b-link-stripe b-animate-go wow zoomIn animated"
                           data-wow-delay=".5s" data-toggle="modal">
                            <img src="${photoDtos[1].pUrl}" class="img-responsive" alt=""/>
                            <div class="b-wrapper">
									<span class="b-animate b-from-left">
										<img class="img-responsive" src="images/search.png" alt=""/>
									</span>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-6 bottom-grids ">
                        <a href="#portfolioModal3" class="b-link-stripe b-animate-go wow zoomIn animated"
                           data-wow-delay=".5s" data-toggle="modal">
                            <img src="${photoDtos[2].pUrl}" class="img-responsive" alt=""/>
                            <div class="b-wrapper">
									<span class="b-animate b-from-left">
										<img class="img-responsive" src="images/search.png" alt=""/>
									</span>
                            </div>
                        </a>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
            <div class="col-md-6 gallery-grids glry-grid1">
                <div class="gallery-grids-top">
                    <div class="col-md-6 bottom-grids2 ">
                        <a href="#portfolioModal4" class="b-link-stripe b-animate-go wow zoomIn animated"
                           data-wow-delay=".5s" data-toggle="modal">
                            <img src="${photoDtos[3].pUrl}" class="img-responsive" alt=""/>
                            <div class="b-wrapper">
									<span class="b-animate b-from-left">
										<img class="img-responsive" src="images/search.png" alt=""/>
									</span>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-6 bottom-grids2 ">
                        <a href="#portfolioModal5" class="b-link-stripe b-animate-go wow zoomIn animated"
                           data-wow-delay=".5s" data-toggle="modal">
                            <img src="${photoDtos[4].pUrl}" class="img-responsive" alt=""/>
                            <div class="b-wrapper">
									<span class="b-animate b-from-left">
										<img class="img-responsive" src="images/search.png" alt=""/>
									</span>
                            </div>
                        </a>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="gallery-grids-top ">
                    <a href="#portfolioModal6" class="b-link-stripe b-animate-go wow zoomIn animated"
                       data-wow-delay=".5s" data-toggle="modal">
                        <img src="${photoDtos[5].pUrl}" class="img-responsive" alt=""/>
                        <div class="b-wrapper">
								<span class="b-animate b-from-left">
									<img class="img-responsive" src="images/search.png" alt=""/>
								</span>
                        </div>
                    </a>
                </div>
            </div>
            <div class="clearfix"></div>
            <!-- gallery Modals -->
            <div class="portfolio-modal modal fade" id="portfolioModal1" tabindex="-1" aria-hidden="true">
                <div class="modal-content g gal">
                    <div class="close-modal" data-dismiss="modal">
                        <div class="lr">
                            <div class="rl"></div>
                        </div>
                    </div>
                    <div class="portfolio-container">
                        <div class="row">
                            <div class="col-lg-8 col-lg-offset-2">
                                <div class="modal-body">
                                    <h3>Our Gallery</h3>
                                    <hr>
                                    <img src="images/gg1.jpg" class="img-responsive img-centered" alt="">
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem
                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an
                                        unknown printer took a galley of type and scrambled it to make a type specimen
                                        book.</p>
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem
                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an
                                        unknown printer took a galley of type and scrambled it to make a type specimen
                                        book.</p>
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem
                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an
                                        unknown printer took a galley of type and scrambled it to make a type specimen
                                        book.</p>
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem
                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an
                                        unknown printer took a galley of type and scrambled it to make a type specimen
                                        book.</p>
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem
                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an
                                        unknown printer took a galley of type and scrambled it to make a type specimen
                                        book.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="portfolio-modal modal fade" id="portfolioModal2" tabindex="-1" aria-hidden="true">
                <div class="modal-content g">
                    <div class="close-modal" data-dismiss="modal">
                        <div class="lr">
                            <div class="rl"></div>
                        </div>
                    </div>
                    <div class="portfolio-container">
                        <div class="row">
                            <div class="col-lg-8 col-lg-offset-2">
                                <div class="modal-body">
                                    <h3>Our Gallery</h3>
                                    <hr>
                                    <img src="images/gg2.jpg" class="img-responsive img-centered" alt="">
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem
                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an
                                        unknown printer took a galley of type and scrambled it to make a type specimen
                                        book.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="portfolio-modal modal fade" id="portfolioModal3" tabindex="-1" aria-hidden="true">
                <div class="modal-content g">
                    <div class="close-modal" data-dismiss="modal">
                        <div class="lr">
                            <div class="rl"></div>
                        </div>
                    </div>
                    <div class="portfolio-container">
                        <div class="row">
                            <div class="col-lg-8 col-lg-offset-2">
                                <div class="modal-body">
                                    <h3>Our Gallery</h3>
                                    <hr>
                                    <img src="images/gg3.jpg" class="img-responsive img-centered" alt="">
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem
                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an
                                        unknown printer took a galley of type and scrambled it to make a type specimen
                                        book.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="portfolio-modal modal fade" id="portfolioModal4" tabindex="-1" aria-hidden="true">
                <div class="modal-content g">
                    <div class="close-modal" data-dismiss="modal">
                        <div class="lr">
                            <div class="rl"></div>
                        </div>
                    </div>
                    <div class="portfolio-container">
                        <div class="row">
                            <div class="col-lg-8 col-lg-offset-2">
                                <div class="modal-body">
                                    <h3>Our Gallery</h3>
                                    <hr>
                                    <img src="images/gg4.jpg" class="img-responsive img-centered" alt="">
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem
                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an
                                        unknown printer took a galley of type and scrambled it to make a type specimen
                                        book.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="portfolio-modal modal fade" id="portfolioModal5" tabindex="-1" aria-hidden="true">
                <div class="modal-content g">
                    <div class="close-modal" data-dismiss="modal">
                        <div class="lr">
                            <div class="rl"></div>
                        </div>
                    </div>
                    <div class="portfolio-container">
                        <div class="row">
                            <div class="col-lg-8 col-lg-offset-2">
                                <div class="modal-body">
                                    <h3>Our Gallery</h3>
                                    <hr>
                                    <img src="images/gg5.jpg" class="img-responsive img-centered" alt="">
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem
                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an
                                        unknown printer took a galley of type and scrambled it to make a type specimen
                                        book.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="portfolio-modal modal fade" id="portfolioModal6" tabindex="-1" aria-hidden="true">
                <div class="modal-content g">
                    <div class="close-modal" data-dismiss="modal">
                        <div class="lr">
                            <div class="rl"></div>
                        </div>
                    </div>
                    <div class="portfolio-container">
                        <div class="row">
                            <div class="col-lg-8 col-lg-offset-2">
                                <div class="modal-body">
                                    <h3>Our Gallery</h3>
                                    <hr>
                                    <img src="images/gg6.jpg" class="img-responsive img-centered" alt="">
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem
                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an
                                        unknown printer took a galley of type and scrambled it to make a type specimen
                                        book.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--//gallery Modals -->
        </div>
    </div>
</div>
<!-- gallery -->
<div class="gallery" id="gallery">
    <div class="container">
        <%--<div class="head-top-w3ls"><i class="fa fa-graduation-cap" aria-hidden="true"></i></div>--%>
        <%--<h5 class="title-w3">gallery</h5>--%>
        <ul id="flexiselDemo1">
            <li>
                <div class="wthree_testimonials_grid_main">
                    <img src="http://192.168.1.101:8080/image/lib3.jpg" alt=" " class="img-responsive"/>
                    <h6>Make the best choice for your education</h6>
                </div>
            </li>
            <li>
                <div class="wthree_testimonials_grid_main">
                    <img src="http://192.168.1.101:8080/image/lib4.jpg" alt=" " class="img-responsive"/>
                    <h6>Make the best choice for your education</h6>
                </div>
            </li>
            <li>
                <div class="wthree_testimonials_grid_main">
                    <img src="http://192.168.1.101:8080/image/lib5.jpg" alt=" " class="img-responsive"/>
                    <h6>Make the best choice for your education</h6>
                </div>
            </li>
            <li>
                <div class="wthree_testimonials_grid_main">
                    <img src="http://192.168.1.101:8080/image/lib7.jpg" alt=" " class="img-responsive"/>
                    <h6>Make the best choice for your education</h6>
                </div>
            </li>
            <li>
                <div class="wthree_testimonials_grid_main">
                    <img src="http://192.168.1.101:8080/image/lib4.jpg" alt=" " class="img-responsive"/>
                    <h6>Make the best choice for your education</h6>
                </div>
            </li>
        </ul>
    </div>
</div>
<!--//gallery-->
<!-- Footer -->

<div class="copyright-wthree">
    <p>Copyright &copy; 2017.Company name All rights reserved.<a target="_blank" href=""></a></p>
</div>
<!-- //Footer -->
<a href="#home" class="scroll" id="toTop" style="display: block;"> <span id="toTopHover"
                                                                         style="opacity: 1;"> </span></a>
<!-- //smooth scrolling -->


<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>


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
<script type="text/javascript">
    $(window).load(function () {
        $("#flexiselDemo1").flexisel({
            visibleItems: 3,
            animationSpeed: 1000,
            autoPlay: true,
            autoPlaySpeed: 3000,
            pauseOnHover: true,
            enableResponsiveBreakpoints: true,
            responsiveBreakpoints: {
                portrait: {
                    changePoint: 480,
                    visibleItems: 1
                },
                landscape: {
                    changePoint: 640,
                    visibleItems: 2
                },
                tablet: {
                    changePoint: 768,
                    visibleItems: 2
                }
            }
        });

    });
</script>
<script type="text/javascript" src="js/jquery.flexisel.js"></script>
<!-- //gallery -->
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