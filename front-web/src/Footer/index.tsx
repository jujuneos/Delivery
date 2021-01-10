import './styles.css'
import { ReactComponent as Youtube } from './Youtube.svg';
import { ReactComponent as Linkedin } from './Linkedin.svg';
import { ReactComponent as Instagram } from './Instagram.svg';

function Footer() {
    return (
        <footer className="main-footer">
            App desenvolvido durante a 2ª ed. do evento Semana Dev Superior
            <div className="footer-icons">
                <a href="https://www.youtube.com/c/DevSuperior" target ="_new">
                    <Youtube />
                </a>
                <a href="https://www.linkedin.com/in/juniorconceicaoa64426163/" target="_new">
                    <Linkedin />
                </a>
                <a href="https://www.instagram.com/jujuneos" target="_new">
                    <Instagram />
                </a>
            </div>
        </footer>
    )
}

export default Footer;