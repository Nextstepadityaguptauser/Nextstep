// 1. Show current year in footer
document.addEventListener("DOMContentLoaded", () => {
  document.getElementById("year").textContent = new Date().getFullYear();

  // 2. Show welcome message
  setTimeout(() => {
    alert("Welcome to the ₹99 Resume Service! 🚀\nGet your job-ready resume now.");
  }, 1000);

  // 3. Copy WhatsApp number to clipboard
  const whatsappLink = document.getElementById("copyWhatsapp");
  if (whatsappLink) {
    whatsappLink.addEventListener("click", (e) => {
      e.preventDefault();
      const phone = "+91XXXXXXXXXX"; // Replace with your number
      navigator.clipboard.writeText(phone).then(() => {
        alert("WhatsApp number copied to clipboard!");
      });
    });
  }

  // 4. Alert on order button click
  const orderBtn = document.getElementById("orderBtn");
  if (orderBtn) {
    orderBtn.addEventListener("click", () => {
      alert("Opening WhatsApp... Please wait.");
    });
  }
});
