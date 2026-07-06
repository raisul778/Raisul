const navToggle = document.querySelector('.nav-toggle');
const navMenu = document.querySelector('.nav-menu');
const navLinks = document.querySelectorAll('.nav-menu a');

navToggle.addEventListener('click', () => {
  const isOpen = navMenu.classList.toggle('show');
  navToggle.setAttribute('aria-expanded', String(isOpen));
});

navLinks.forEach(link => {
  link.addEventListener('click', () => {
    navMenu.classList.remove('show');
    navToggle.setAttribute('aria-expanded', 'false');
  });
});

document.getElementById('year').textContent = new Date().getFullYear();

const sections = document.querySelectorAll('main section[id]');
const observerOptions = { threshold: 0.35 };

const sectionObserver = new IntersectionObserver(entries => {
  entries.forEach(entry => {
    const activeLink = document.querySelector(`.nav-menu a[href="#${entry.target.id}"]`);
    if (entry.isIntersecting && activeLink) {
      navLinks.forEach(link => link.classList.remove('active'));
      activeLink.classList.add('active');
    }
  });
}, observerOptions);

sections.forEach(section => sectionObserver.observe(section));

const revealObserver = new IntersectionObserver(entries => {
  entries.forEach(entry => {
    if (entry.isIntersecting) {
      entry.target.classList.add('visible');
      revealObserver.unobserve(entry.target);
    }
  });
}, { threshold: 0.12 });

document.querySelectorAll('.reveal').forEach(element => revealObserver.observe(element));
